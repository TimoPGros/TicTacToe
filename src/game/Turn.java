package game;

import board.Kind;

/**
 * Diese Klasse repräsentiert einen Spielzug.
 */
public class Turn {

    final int x;
    final int y;
    final Kind kind;

    public Turn(int x, int y, Kind kind) {
        this.x = x;
        this.y = y;
        this.kind = kind;
    }

}
