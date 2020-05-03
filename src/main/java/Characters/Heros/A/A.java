package Characters.Heros.A;
import java.util.ArrayList;
import Characters.Heros.Hero;
import Characters.Card;
public class A extends Hero{
    private ArrayList <Card> Cards = new ArrayList<Card>();

    public void AddCard(Card AddingCard){
        Cards.add(AddingCard);
    }

}
