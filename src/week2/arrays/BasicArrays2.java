package week2.arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random rd = new Random();
        int[] array = new int [10];
        for (int x = 0; x < array.length; x++) {
            array[x] = min + rd.nextInt(max);
            System.out.println("Slot " + (x) + " contains a " + array[x]);
        }

    }
}
