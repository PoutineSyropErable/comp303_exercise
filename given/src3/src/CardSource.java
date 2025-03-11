public interface CardSource {
    /*
     * Returns a card from the card source.
     *
     * @pre !isEmpty()
     * @return The next available card from the card source.
     */
    Card draw();

    /*
     *
     */
    boolean isEmpty();
}
