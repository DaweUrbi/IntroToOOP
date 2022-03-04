package assignments.labs.lab3;

public class King extends Piece{
    private int value = 1000;

    public King(int value, boolean isWhite) {
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public void move() {
        System.out.println("One Square");
    }

    @Override
    public String toString() {
        return "King{value='" + value + "'}";
    }
}
