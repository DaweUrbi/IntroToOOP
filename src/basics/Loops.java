package basics;

public class Loops {
    public static void main(String[] args) {
        // for-loop
        // for(initialize loop variable; condition; inc or dec)
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // print even numbers from 1 to 10 using while-loop
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // infinite loop
        for (;;) {
            System.out.println("Hi");
            break;
        }
        while (true) {
            System.out.println("Hi");
            break;
        }
    }
}
