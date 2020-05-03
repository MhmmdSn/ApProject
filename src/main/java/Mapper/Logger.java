package Mapper;

import Logic.Game;
import Logic.Player;
import Run.Main;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static Gson gson = new Gson();
    private static PrintWriter printWriter;
    static {
        try {
            printWriter = new PrintWriter(new FileOutputStream("gamelog.txt", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static PrintWriter playerPrintWriter;

    private static Reader reader;
    static {
        try {
            reader = Files.newBufferedReader(Paths.get("players.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static synchronized void log(String[] action) {
        printWriter.write("\n " + getDatenTime() + ": " + gson.toJson(action));
        if (printWriter != null) {
            printWriter.flush();
        }
    }

    static void logPlayers(ArrayList<Player> players) {
        try {
            playerPrintWriter = new PrintWriter(new FileOutputStream("players.txt", false));
        }catch (IOException e){
            e.printStackTrace();
        }
        gson.toJson(players);
        playerPrintWriter.write(gson.toJson(players));
        if (playerPrintWriter != null) {
            playerPrintWriter.flush();
            playerPrintWriter.close();
        }
    }
    static ArrayList<Player> updateMyPlayers(){
        return (ArrayList<Player>) gson.fromJson(reader ,new TypeToken<ArrayList<Player>>(){}.getType() );
    }

    private static String getDatenTime() {
        return dtf.format(LocalDateTime.now());
    }
}

