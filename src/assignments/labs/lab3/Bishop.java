package assignments.labs.lab3;

public class Bishop extends Piece {
    private int value = 3;

    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value='" + value + "'}";
    }
}
