import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        List<Card> cards2 = Collections.unmodifiableList(cards);
        cards2.add(new Card(Suit.HEARTS, Rank.ACE));

        //cards.add(...);

        Deck deck = new Deck(cards);

        //cards.add(...);



        //List<Card> cards = deck.getCards();
    }
}