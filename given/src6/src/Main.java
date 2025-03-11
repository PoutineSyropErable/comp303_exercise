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

        /*CompositeCardSource compositeCardSource = new CompositeCardSource();
        compositeCardSource.add(new Deck());
        compositeCardSource.add(new Deck());

        List<Card> cards = drawCards(compositeCardSource, 5);*

         */

        CardSource deck = new Deck();
        Card card = deck.draw();

        CardSource loggingDeck = new LoggingDecorator(deck);
        Card card2 = loggingDeck.draw();

        //CardSource shufflingDeck = new ShufflingDecorator(deck);
        //Card card3 = shufflingDeck.draw();

        CardSource loggingAndShufflingDeck = new ShufflingDecorator(loggingDeck);
        Card card3 = loggingAndShufflingDeck.draw();
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