package Basics;

public class DoubleIntDivision {
    public static void main(String[] args) {

        double x = 10; // 10.0
        int y = 3;
        // int / int = int
        //double / int = double
        //int / double = double
        System.out.println(x / y);

        // casting - forcing to change the type
        int z = (int) x / y;
        System.out.println(z);

        System.out.println((int) (x / y)); // 10/3 = 3,333 -> change to int 3
        System.out.println((int) x / y); //(int)10/3 = 3,3333

        double z = (int) x / y;
        System.out.println(z); // 3.0


    }
}
