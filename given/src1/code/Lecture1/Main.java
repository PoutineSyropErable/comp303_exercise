import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //int card = 9001; // problem with using int: can accept values out of range of card

        //int numCardsInHand = 3;
        //card = numCardsInHand; // problem with int: can lead to logic errors that are not caught by compiler

        //int[] card = {1, 0}; // problem with int: changing internal representation is difficult

        Card card = new Card(Suit.HEARTS, Rank.QUEEN);
        card.rank = Rank.FIVE; // error: accessing private property

        Card card2 = new Card(Suit.DIAMONDS, Rank.THREE);

        Deck myCards = new Deck();
        myCards.addCard(card);
        myCards.addCard(card2);

        // bad: escaping reference
        ArrayList<Card> cards = myCards.getCards();
        cards.add(card2);


    }
}