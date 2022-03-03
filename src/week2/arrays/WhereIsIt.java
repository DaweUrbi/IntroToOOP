package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {
        int[] array = new int[10];
        int index = 0;
        boolean check = false;

        System.out.print("Array: ");
        for (int x = 0; x < 10; x++) {
            array[x] = (int) (Math.random() * 50);
            System.out.print(array[x] + " ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();

        for (int x = 0; x < array.length; x++) {
            if (array[x] == input) {
                check = true;
                index = x;
            }
        }
        if (check) {
            System.out.println(input + " is in slot " + index);
        } else {
            System.out.println(input + " is not in the array.");
        }
    }
}
