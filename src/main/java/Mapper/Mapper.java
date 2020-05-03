package Mapper;

import Logic.*;
import Graphics.*;

import javax.swing.*;

public class Mapper {
    private static MainFrame mainFrame;
    private static Game game;
    private static String[] log = new String[2];
    private static Mapper mapper;

    private Mapper() {
        game = Game.getInstance();
    }

    public static Mapper getInstance() {
        if (mapper == null) {
            mapper = new Mapper();
        }
        return mapper;
    }

    public static MainFrame newMainFrame() {
        mainFrame = new MainFrame();
        return mainFrame;
    }

    public static void switchPanel(JPanel addingPanel) {
        mainFrame.switchPanel(addingPanel);
    }

    private static void log(String actionType, String actionMsg) {
        log[0] = actionType;
        log[1] = actionMsg;
        Logger.log(log);
    }

    public static void updatePlayersFile() {
        System.out.println(Game.getPlayers().size());
        Logger.logPlayers(Game.getPlayers());
    }

    public static void updateMyPlayers() {
        Game.setPlayers(Logger.updateMyPlayers());
    }

    public static void loguserNameActions(String userName, boolean userNameExist) {
        log("UserNameCheked", "UserNameEntered (" + userName + ") was " + userNameExist);
    }

    public static void logButton(String name) {
        log("Button_Clicked", name);
    }


    public static Game getGame() {
        return game;
    }

    public static void createPlayer(String name, String password) {
        Game.getPlayers().add(new Player(name, password, 50));
    }

    public static int userNameChecker(String name) {
        if (Game.getPlayers() != null) {
            for (int i = 0; i < Game.getPlayers().size(); i++) {
                if (Game.getPlayers().get(i).getUserName().equals(name)) {
                    Mapper.loguserNameActions(name, true);
                    return i;
                }
            }
        }
        Mapper.loguserNameActions(name, false);
        return -1;
    }

    public static boolean correctPassword(int index, String password) {
        boolean answer = Game.getPlayers().get(index).getPassword().equals(password);
        log("Password_Cheked", "Password Entered for Player(" + index + ") Was " + answer);
        return answer;
    }

    public static Player getPlayer(int index) {
        return Game.getPlayers().get(index);
    }
}
