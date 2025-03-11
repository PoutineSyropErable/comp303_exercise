import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    CardSource source = CardSource.NULL;

    public void playGame() {
        Card card = this.source.draw();
    }

    public static void main(String[] args) {
        //List<Card> cards = new ArrayList<>();
        //List<Card> cards2 = Collections.unmodifiableList(cards);
        //cards2.add(new Card(Suit.HEARTS, Rank.ACE));

        //cards.add(...);

        Deck deck = new Deck();
        //List<Card> cards = deck.getCards();
        for (Card card : deck) {
            // do something
        }

        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext())
        {
            Card element = iterator.next();
            // do something
        }

        // Iterator<E> interface




        //List<Card> cards = deck.getCards();
    }

    public static List<Card> drawCards(CardSource pDeck, int pNumber) {
        List<Card> result = new ArrayList<>();
        for (int i = 0; i < pNumber; i ++)
        {
            result.add(pDeck.draw());
        }
        return result;
    }
}