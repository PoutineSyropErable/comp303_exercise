package ch3;

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
}
