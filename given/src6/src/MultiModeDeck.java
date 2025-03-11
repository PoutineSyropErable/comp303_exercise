import java.util.ArrayList;
import java.util.List;

public class MultiModeDeck implements CardSource {
    private List<Card> aCards;

    enum Mode {
        LOGGING, MEMORIZING, AUTOSHUFFLING
    }

    private final List<Mode> modes;

    public MultiModeDeck() {
        // populate deck with 52 cards
        //aCards =...;
        modes = new ArrayList<>();
    }

    public void addMode(Mode mode) {
        modes.add(mode);
    }



    public int size() {
        return aCards.size();
    }

    @Override
    public Card draw() {
        if (isEmpty())
        {
            throw new IllegalStateException();
        }
        Card card = aCards.remove(aCards.size() - 1);
        if (this.modes.contains(Mode.LOGGING)) {
            //
        }
        if (this.modes.contains(Mode.AUTOSHUFFLING)) {
            // ...
        }
        return card;
    }

    @Override
    public boolean isEmpty() {
        return aCards.size() == 0;
    }
}
