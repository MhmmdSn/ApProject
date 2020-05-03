package Characters.Heros;
import Characters.Card;
import Characters.Character;

import java.util.ArrayList;

public abstract class Hero extends Character{
    private ArrayList<Card> Cards;

    public ArrayList<Card> getCards() {
        return Cards;
    }

    public void setCards(ArrayList<Card> cards) {
        Cards = cards;
    }

}
