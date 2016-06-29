package board;

public enum Kind {
    X, O, empty;

    public String toString() {
        if (this == X)
            return "x";
        if (this == O)
            return "o";
        return " ";
    }

}
