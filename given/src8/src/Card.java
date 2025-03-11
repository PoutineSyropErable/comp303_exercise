import java.util.Optional;

public class Card {
    private Optional<Suit> suit; // 5
    private Optional<Rank> rank; // 14

    // Optional<T>
    // Null object design pattern
    // size of the concrete state space

    public Card(Suit suit, Rank rank)
    {
        assert suit != null;
        assert rank != null;
        this.suit = Optional.of(suit);
        this.rank = Optional.of(rank);
    }

    public Card() {
        this.suit = Optional.empty();
        this.rank = Optional.empty();
    }

    public boolean isJoker() {
        return !this.rank.isPresent();
    }

    // copy constructor
    public Card(Card card)
    {
        this.suit = card.suit;
        this.rank = card.rank;
    }

    public Suit getSuit()
    {
        Suit suit = this.suit.get();
        return suit;
    }
    public Rank getRank()
    {
        return this.rank;
    }
}
