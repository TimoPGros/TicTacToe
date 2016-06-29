package game;

/**
 * Das Spiel informiert die Observer mit den hier aufgührten Methoden.
 */
public interface Observer {

    /**
     * Informiert den Observer über einen neuen Spielzug.
     * 
     * @param t
     *            der Zug
     */
    void PieceSetted(Turn t);

    /**
     * Informiert den Observer, dass das Spielfeld nun voll ist.
     */
    void BoardIsFull();

}
