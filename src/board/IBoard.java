package board;

/**
 * Implementierung des Boards. Methodenbeschreibungen können im Interface
 * nachgelesen werden.
 */
public class IBoard implements Board {

    private final Kind board[][] = new Kind[3][3];

    public IBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = Kind.empty;
            }
        }
    }

    @Override
    public void setPiece(Kind kind, int x, int y) {
        this.board[x][y] = kind;

    }

    @Override
    public Kind getPiece(int x, int y) {
        return this.board[x][y];
    }

    @Override
    public boolean canSetPiece(int x, int y) {
        return (x < 3 && x >= 0 && y < 3 && y >= 0 && this.board[x][y] == Kind.empty);
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == Kind.empty)
                    return false;
            }
        }
        return true;
    }

    @Override
    public Kind[][] getBoard() {
        return this.board;
    }

    @Override
    public Board copy() {
        Board b = new IBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b.setPiece(this.getPiece(i, j), i, j);
            }
        }
        return b;
    }

}
