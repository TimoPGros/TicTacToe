package board;

public interface Board {

    /**
     * Setzt einen Stein an die Stelle (x, y).
     * 
     * @param kind
     *            das Zeichen des Spielers
     * @param x
     *            Zeile
     * @param y
     *            Spalte
     */
    public void setPiece(Kind kind, int x, int y);

    /**
     * Gibt den Stein an der Stelle (x,y) zurück.
     * 
     * @param x
     *            Zeile
     * @param y
     *            Spalte
     * @return der Stein an dieser Stelle
     */
    public Kind getPiece(int x, int y);

    /**
     * Testet, ob ein Feld frei ist.
     * 
     * @param x
     *            Zeile
     * @param y
     *            Spalte
     * @return true genau dann, wenn das Feld frei ist
     */
    public boolean canSetPiece(int x, int y);

    /**
     * Testet ob das Board voll ist.
     * 
     * @return true genau dann, wenn das Board voll ist.
     */
    public boolean isFull();

    /**
     * Gibt das Board zurück.
     * 
     * @return das Board
     */
    public Kind[][] getBoard();

    /**
     * Erstellt eine Kopie des Boards.
     * 
     * @return ein Clon des Boards
     */
    public Board copy();

}
