public class Card {
    private Suit suit; // 5
    private Rank rank; // 14
    private boolean isJoker;

    // Optional<T>
    // Null object design pattern
    // size of the concrete state space

    public Card(Suit suit, Rank rank)
    {
        assert suit != null;
        assert rank != null;
        this.suit = suit;
        this.rank = rank;
        this.isJoker = false;
    }

    public Card() {
        this.isJoker = true;
    }

    public boolean isJoker() {
        return this.isJoker;
    }

    // copy constructor
    public Card(Card card)
    {
        this.suit = card.suit;
        this.rank = card.rank;
    }

    public Suit getSuit()
    {
        return this.suit;
    }
    public Rank getRank()
    {
        return this.rank;
    }
}
