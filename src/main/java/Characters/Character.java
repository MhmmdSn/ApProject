package Characters;

public abstract class Character {
    private int life;
    private boolean MyTurn;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isMyTurn() {
        return MyTurn;
    }

    public void setMyTurn(boolean myTurn) {
        MyTurn = myTurn;
    }
}
