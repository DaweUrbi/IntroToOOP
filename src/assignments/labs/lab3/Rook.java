package assignments.labs.lab3;

public class Rook extends Piece{
    private int value = 5;

    public Rook(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public void move(){
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value='" + value + "'}";
    }
}
