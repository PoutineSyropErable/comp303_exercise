package ch3;

import java.util.List;
import java.util.Collections;

public class CardSequence implements CardSource {
	private List<Card> cards;

	public CardSequence() {
		// ...
	}

	public void addCard(Card card) {
		// ...
	}

	public List<Card> getCards() {
		// ...
		return cards;
	}

	public boolean isEmpty() {
		return true;

	}

	public Card draw() {
		return cards.getLast();
	}
}
