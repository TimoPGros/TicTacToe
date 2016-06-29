package player;

import java.util.Scanner;

import board.Board;
import board.Kind;
import game.Game;
import game.Observer;
import game.Turn;

/**
 * Diese Klasse implementiert einen Spieler, der über die Kommandozeile
 * gesteuert werden kann.
 */
public class KeyBoardPlayer implements Observer, Player {

    private final Game game;
    private final Board board;
    private Kind kind;
    private Scanner scanner = new Scanner(System.in);

    public KeyBoardPlayer(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }

    @Override
    public Turn getNextTurn() {
        System.out.println("Sie sind am Zug!");
        System.out.println("x Koordinate bitte (0-2)");
        int x = scanner.nextInt();
        System.out.println("y Koordinate bitte (0-2)");
        int y = scanner.nextInt();
        return new Turn(x, y, this.kind);
    }

    @Override
    public void setKind(Kind k) {
        this.kind = k;
        System.out.println("Sie sind " + k.toString());
    }

    @Override
    public Kind getKind() {
        return this.kind;
    }

    @Override
    public void BoardIsFull() {
        // TODO Auto-generated method stub
    }

    @Override
    public void PieceSetted(Turn t) {
        // TODO Auto-generated method stub
    }
}
