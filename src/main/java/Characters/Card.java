package Characters;


public abstract class Card {
    private static int usingMana;
    private String Name;
    private int AttackPower ;
    private String Description;

    public static void setusingMana(int usingManas) {
        usingMana = usingManas;
    }

    public static int getusingMana() {
        return usingMana;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAttackPower() {
        return AttackPower;
    }

    public void setAttackPower(int attackPower) {
        AttackPower = attackPower;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
