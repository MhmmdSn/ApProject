package Characters;

public abstract class MinionCard extends Card {
private int damageCaused ;
private int HP;

    public int getDamage() {
        return damageCaused;
    }

    public void setDamage(int damage) {
        damageCaused = damage;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}

