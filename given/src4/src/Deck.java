import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck implements CardSource, Iterable<Card> {
    private List<Card> aCards;

    // abstract state
    // "Empty" -> meaningful
    // "Complete but not shuffled"
    // "Complete and shuffled"
    // "Incomplete and shuffled"
    // "Incomplete and not shuffled"

    public Deck() {
        // populate deck with 52 cards
        aCards =...;
    }

    public void shuffle() {
        // ...
    }

    public int size() {
        return aCards.size();
    }

    public Card draw() {
        if (isEmpty())
        {
            throw new IllegalStateException();
        }
        return aCards.remove(aCards.size() - 1);
    }

    public boolean isEmpty() {
        return aCards.size() == 0;
    }

    public List<Card> getCards()
    {
        List<Card> result = new ArrayList<>();
        for (Card card : this.aCards)
        {
            result.add(new Card(card));
        }
        return result;
    }

    public void collect(List<List<Card>> pAllCards)
    {
        pAllCards.add(aCards);
    }

    public void addCard(Card card)
    {
        this.aCards.add(card);
    }

    /*public static ArrayList<Card> getDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < 52; i ++)
        {
            cards.add(new Card(i));
        }
        return cards;
    }*/

    public boolean isCardInDeck(Card card)
    {
        for (Card i : this.aCards)
        {
            if (card == i) // change
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isSuitInDeck(ArrayList<Card> deck, Suit suit_)
    {
        for (Card card : deck)
        {
            if (card.getSuit() == suit_)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Card> iterator() {
        return aCards.iterator();
    }
}
