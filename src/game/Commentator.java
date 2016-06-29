package game;

/**
 * Diese Klasse ist nur ein Observer, der das Spiel kommentiert, indem die
 * erhaltenen Events in der Kommandozeile ausgegeben werden.
 */
public class Commentator implements Observer {

    private final Game game;

    public Commentator(Game game) {
        this.game = game;
    }

    @Override
    public void PieceSetted(Turn t) {
        System.out.println("Kommentator: " + t.kind + " war am Zug und hat (" + t.x + "," + t.y + ") besetzt");

    }

    @Override
    public void BoardIsFull() {
        System.out.println("Kommentator: Das Spielfeld ist voll");
        if (game.hasWinner()) {
            System.out.println("Kommentator: Der Gewinner ist " + game.getWinner());
        } else {
            System.out.println("Kommentator: Unentschieden");
        }
    }

}
