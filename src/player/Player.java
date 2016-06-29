package player;

import board.Kind;
import game.Turn;

/**
 * Dieses Interface gibt einem Spieler die nötigen Methode um ein Spiel zu
 * spielen.
 */
public interface Player {

    /**
     * Fragt den Spieler nach dem nächten Zug.
     * 
     * @return der nächste Zug
     */
    public Turn getNextTurn();

    /**
     * Teilt dem Spieler das Zeichen (X oder O) mit.
     * 
     * @param k
     *            das Zeichen des Spielers
     */
    public void setKind(Kind k); //

    /**
     * Fragt den Spieler nach seinem Zeichen (X oder O).
     * 
     * @return das Zeichen des Spielers
     */
    public Kind getKind();

}
