package ch3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements CardSource, Comparable<Hand> {
	private int aMaxCardNumber;
	private List<Card> aCards;

	/*
	 * create an empty Hand with the max number of allowed card
	 * 
	 * @pre : pMaxCardNumber > 0
	 * 
	 * @return a Hand
	 */
	public Hand(int pMaxCardNumber) {

		assert pMaxCardNumber > 0;
		aMaxCardNumber = pMaxCardNumber;
		aCards = new ArrayList<Card>();

	}

	public List<Card> getCards() {
		return Collections.unmodifiableList(aCards);
	}

	public boolean isFull() {
		return aCards.size() >= aMaxCardNumber;
	}

	// @pre : !isFull()
	public void add(Card pCard) {
		assert !isFull();
		aCards.add(pCard);

	}

	public void remove(Card pCard) {
		aCards.remove(pCard);

	}

	public boolean contains(Card pCard) {
		return aCards.contains(pCard);
	}

	@Override
	public boolean isEmpty() {
		return aCards.isEmpty();
	}

	/*
	 * @pre: !isEmpty()
	 */
	@Override
	public Card draw() {
		assert !isEmpty();
		return aCards.removeLast();
	}

	public int getMaxNumber() {
		return aMaxCardNumber;
	}

	// @ pre : Card.hashCode() does (suit, rank) <--> int (1 to 1)
	@Override
	public int compareTo(Hand otherHand) {
		if (aMaxCardNumber != otherHand.getMaxNumber()) {
			return Integer.compare(aMaxCardNumber, otherHand.getMaxNumber());
		}

		List<Card> otherCards = otherHand.getCards();
		for (int cardIndex = 0; cardIndex < aCards.size(); cardIndex++) {
			Card card = aCards.get(cardIndex);
			Card otherCard = otherCards.get(cardIndex);
			if (card.hashCode() != otherCard.hashCode()) {
				// Assuming hashCode does by rank then by suit perfect comparaison
				return Integer.compare(hashCode(), card.hashCode());
			}

		}

		return 0;

	}

}
