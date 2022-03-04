package assignments.labs.lab3;

public class Queen extends Piece{
    private int value = 9;

    public Queen(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public void move() {
        System.out.println("Like a bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value='" + value + "'}";
    }
}
