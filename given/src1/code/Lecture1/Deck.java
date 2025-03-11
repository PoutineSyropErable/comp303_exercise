import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck()
    {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public ArrayList<Card> getCards()
    {
        return cards; // return a copy
    }

    public void addCard(Card card)
    {
        this.cards.add(card);
    }

    public boolean isCardInDeck(Card card)
    {
        for (Card i : this.cards)
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
}
