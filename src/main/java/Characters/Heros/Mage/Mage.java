package Characters.Heros.Mage;
import java.util.ArrayList;
import Characters.Heros.Hero;
import Characters.Card;
public class Mage extends Hero{
    private ArrayList <Card> Cards = new ArrayList<>();

    public void AddCard(Card AddingCard){
        Cards.add(AddingCard);
    }

}
