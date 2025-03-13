package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();
		cards.add(new Card(Suit.HEARTS, Rank.ACE));
		// List<Card> cards2 = Collections.unmodifiableList(cards);

		// cards.add(...);

		Deck deck = new Deck(cards);

		// cards.add(...);

		// List<Card> cards = deck.getCards();
	}

	public static List<Card> drawCards(CardSource pDeck, int pNumber) {
		List<Card> result = new ArrayList<>();
		for (int i = 0; i < pNumber; i++) {
			result.add(pDeck.draw());
		}
		return result;
	}
}
