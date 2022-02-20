package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");

        while (true) {
            System.out.println("Number: ");
            number = input.nextInt();
            sum += number;
            if (number == 0) break;
            System.out.printf("The total so far is %d\n", sum);
        }
        System.out.printf("\nThe total is %d", sum);
    }
}
