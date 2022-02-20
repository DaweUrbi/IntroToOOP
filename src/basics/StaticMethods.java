package basics;

import java.util.Arrays;

public class StaticMethods {

    public static void main(String[] args) {
//        StaticMethods s1 = new StaticMethods();
        printName("Derrick");
        int result = addTwo(10, 20);
        System.out.println(result);

        int x = 10;
        int y = 20;
        swap(x, y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int[] myArr = {1, 2, 3};
        changeFirst(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    // pass by reference
    public static void changeFirst(int[] arr) {
       arr[0] = 7;
    }

    // pass by value
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void printName(String name) {
        // public: this method can be called from outside this class
        // static: we call this method without creating an object(instance).
        System.out.println("Hello, " + name);
    }

    public static int addTwo(int a, int b) {
        return a + b;
    }
}
