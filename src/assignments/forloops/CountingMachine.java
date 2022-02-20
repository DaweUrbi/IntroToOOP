package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Count to: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
            // System.out.println(i);   Print one number on each line
        }
    }
}
