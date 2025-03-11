public class LoggingDecorator implements CardSource {
    private final CardSource element;

    public LoggingDecorator(CardSource pCardSource) {
        this.element = pCardSource;
    }

    @Override
    public Card draw() {
        Card card = element.draw();
        System.out.println("Card drawn was: " + card);
        return card;
    }

    @Override
    public boolean isEmpty() {
        return element.isEmpty();
    }
}
