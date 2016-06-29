package game;

import java.io.IOException;

import board.Board;
import board.Kind;
import player.Player;

public interface Game extends Observable {

    /**
     * Startet das Spiel.
     */
    public void run() throws IOException;

    /**
     * Diese Methode testet, ob es einen Sieger gibt.
     * 
     * @return true genau dann, wenn es einen Sieger gibt
     */
    public boolean hasWinner();

    /**
     * Diese Methode überprüft, ob das Spiel vorbei ist.
     * 
     * @return true genau dann, wenn das Spiel vorbei ist
     */
    public boolean isOver();

    /**
     * Diese Methode printet das Spiel auf die Kommandozeile.
     */
    public void showBoard();

    /**
     * Diese Methoden erlauben, dass 2 Spieler dem Spiel beitreten.
     * 
     * @param player
     *            Spieler 1
     */
    public void joinPlayer1(Player player);

    /**
     * Diese Methoden erlauben, dass 2 Spieler dem Spiel beitreten.
     * 
     * @param player
     *            Spieler 2
     */
    public void joinPlayer2(Player player);

    /**
     * Gibt das Spielfeld zurück.
     * 
     * @return das Board
     */
    public Board getBoard();

    /**
     * Gibt den Gewinner zurück.
     * 
     * @return der Gewinner
     */
    public Kind getWinner();

}
