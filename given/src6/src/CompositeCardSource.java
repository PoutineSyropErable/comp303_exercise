import java.util.ArrayList;
import java.util.List;

public class CompositeCardSource implements CardSource {
    private final List<CardSource> cardSources;

    public CompositeCardSource() {
        this.cardSources = new ArrayList<>();
    }

    public void add(CardSource pCardSource) {
        cardSources.add(pCardSource);
    }

    @Override
    public Card draw() {
        assert !isEmpty();
        for (CardSource source: cardSources) {
            if (!source.isEmpty()) {
                return source.draw();
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (CardSource source : cardSources) {
            if (!source.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
