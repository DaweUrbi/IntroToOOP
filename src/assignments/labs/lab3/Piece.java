package assignments.labs.lab3;

import java.util.ArrayList;

public abstract class Piece {

    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "King{value=" + value + "\\’’ + ‘}’";
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null || getClass() != x.getClass()) return false;
        Piece piece = (Piece) x;
        return value == piece.value && isWhite == piece.isWhite;
    }

    public static void printMoves(ArrayList<Piece> pieces) {
        for (Piece piece : pieces) {
            piece.move();
        }
    }
}
