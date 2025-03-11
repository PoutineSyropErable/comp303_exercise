import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> aCards;
    private int aMaxLimit;

    public Hand(int pMaxLimit) {
        assert pMaxLimit > 0;
        aCards = new ArrayList<>();
        aMaxLimit = pMaxLimit;
    }


    public boolean add(Card card) {
        if (isFull()) {
            return false;
        }
        aCards.add(card);
        return true;
    }

    public boolean contains(Card card) {
        return aCards.contains(card);
    }
    //add(Card), remove(Card), contains(Card), isEmpty(), size(), and isFull()
}
