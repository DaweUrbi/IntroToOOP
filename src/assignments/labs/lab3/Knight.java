package assignments.labs.lab3;

public class Knight extends Piece{
    private int value = 2;

    public Knight(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public void move() {
        System.out.println("Like an L   ");

    }
    @Override
    public String toString() {
        return "Knight{value='" + value + "'}";
    }
}
