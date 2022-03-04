package assignments.labs.lab3;

import java.util.Objects;

public class Pawn extends Piece {
    private int value = 1;
    public boolean promoted;
    public Piece newPiece;

    public Pawn(int value, boolean isWhite, boolean promoted) {
        super(value, isWhite);
        this.promoted = promoted;
    }

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.newPiece = newPiece;
        this.promoted = promoted;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + value + "'}";
    }

    public void promote(Piece newPiece) {
        newPiece = new Queen(8, true);
        promoted = true;
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null || getClass() != x.getClass()) return false;
        if (!super.equals(x)) return false;
        Pawn pawn = (Pawn) x;
        return value == pawn.value && promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }
}