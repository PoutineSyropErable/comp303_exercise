package ch3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class AggregatedDeck implements CardSource {
	private List<Card> cards;

	public AggregatedDeck(List<Deck> decks) {
		cards = new ArrayList<>();
		for (Deck deck : decks) {
			while (!deck.isEmpty()) {
				cards.add(deck.draw());
			}
		}
		Collections.shuffle(cards);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Card draw() {
		// TODO Auto-generated method stub
		return null;
	}
}
