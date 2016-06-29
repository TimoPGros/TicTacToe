package game;

public interface Observable {

    /**
     * Fügt einen Observer hinzu.
     *
     * @param observer
     *            the GameObserver to add
     */
    void addObserver(Observer observer);

    /**
     * Löscht einen Observer.
     *
     * @param observer
     *            the GameObserver to remove
     */
    void removeObserver(Observer observer);

}
