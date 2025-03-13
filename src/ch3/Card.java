package ch3;

import java.util.Objects;

public class Card {
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		assert suit != null;
		assert rank != null;
		this.suit = suit;
		this.rank = rank;
	}

	// copy constructor
	public Card(Card card) {
		this.suit = card.suit;
		this.rank = card.rank;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public Rank getRank() {
		return this.rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public int hashCode() {
		// return Objects.hash(suit, rank);
		int N = Suit.values().length;

		return rank.ordinal() * N + suit.ordinal();
		// uniquely 1 to 1 map (rank, suit) <-> int

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Card card = (Card) obj;
		return suit == card.suit && rank == card.rank; // ✅ Correct approach

		// Bellow is wrong because if hash code stops being unique, then fails
		// return hashCode() == card.hashCode();

	}

}
