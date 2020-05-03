package Logic;

import Mapper.*;
import java.util.ArrayList;

public class Game {
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static Game game ;

    private Game(){
        Mapper.updateMyPlayers();
        Mapper.newMainFrame();
    }
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }
    public static void setPlayers(ArrayList<Player> playersArray) {
        players = playersArray;
    }
}
