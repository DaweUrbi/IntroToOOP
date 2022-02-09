package basics;

public class DoubleIntDivision {
    public static void main(String[] args) {
        double x = 10; // 10.0
        int y = 3;
        // int / int -> int
        // double / int -> double
        // int / double - double
        System.out.println(x / y);

        // casting -> forcing to change the type
        System.out.println((int) (x / y));
        System.out.println((int) x / y);

        double z = (int) x / y;
        System.out.println(z); // 3.0
    }
}

