package week1.classes;

public class Driver {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 7);
        Rectangle r2 = new Rectangle(10, 2, "Green");
        Rectangle r3 = new Rectangle(15, 12, "Red");
        r1.draw();
        System.out.print("\n");
        r2.draw();
        System.out.print("\n");
        r3.draw();
        r1.setHeight(15);
        r1.setWidth(20);
        r1.setColor("White");
        r1.draw();
    }

}
