public interface CardSource {

    CardSource NULL = new CardSource() {
        @Override
        public Card draw() {
            throw new UnsupportedOperationException("Cannot draw from a NullCardSource.");
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        public boolean isNull() {
            return true;
        }
    };

    /*
     * Returns a card from the card source.
     *
     * @pre !isEmpty()
     * @return The next available card from the card source.
     */
    Card draw();

    CardSource copy();

    /*
     *
     */
    boolean isEmpty();

    default boolean isNull() {
        return false;
    }
}
