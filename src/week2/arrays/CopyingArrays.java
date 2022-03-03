package week2.arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random rd = new Random();
        int[] array = new int[10];
        for (int x = 0; x < array.length; x++) {
            array[x] = min + rd.nextInt(max);
        }
        int[] array2 = new int[10];
        for (int x = 0; x < array2.length; x++) {
            array2[x] = array[x];
        }
        array[9] = -7;
        System.out.println("Array 1: " + Arrays.toString(array));
        System.out.println("Array 2: " + Arrays.toString(array2));


    }
}
