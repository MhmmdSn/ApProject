package Logic;

import Characters.Heros.Hero;

import java.util.ArrayList;

public class Player {
    private String UserName;
    private String Password;
    private int Gems;
    private ArrayList<Hero> heroes;
    private int HeroID;

    public Player(String Name, String Password, int Gems) {
        this.UserName = Name;
        this.Password = Password;
        this.Gems = Gems;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String username) {
        UserName = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getGems() {
        return Gems;
    }

    public void setGems(int gems) {
        Gems = gems;
    }

    @Override
    public String toString() {
//TODO Override Player To StringClass
        return null;
    }

    public String PlayerDetails() {
//        Player[] players = new Player[1];
//        players[0] = this;
        return "UserName:" + this.UserName + "\n"
                + "Password:" + Password + "\n" +
                "Gems:" + Gems;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public int getHeroID() {
        return HeroID;
    }

    public void setHeroID(int heroID) {
        HeroID = heroID;
    }
}
