package basics;

import java.util.Arrays; // auto-import (option + return)

public class ArraysExample {
    public static void main(String[] args) {
        // 1. array-literal (initialization)
        // - setting initial values
        int[] arr1 = {1, 2, 3, 4, 5};

        // the length(size) of array
        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);
        // access the last element in array
        System.out.println(arr1[arr1.length - 1]);

        // for-loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change the element in the array
        arr1[0] = 7;

        // for-each loop
        for (int elem : arr1) {
            System.out.println(elem);
        }

        // how to print contents of an array?
        System.out.println(Arrays.toString(arr1));

        // 2. create an array of size 10
        //    by default it stores 10 zeros
        int[] arr2 = new int[10];
//        arr2[0] = 0;
//        arr2[1] = 10;
//        arr2[2] = 20;
//        arr2[3] = 30;
//        arr2[4] = 40;
//        arr2[5] = 50;
//        arr2[6] = 60;
//        arr2[7] = 70;
//        arr2[8] = 80;
//        arr2[9] = 90;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr2));

        double[] arr3;
        boolean[] arr4;
        char[] arr5;

        String[] countries = {"Canada", "USA"};
        countries[0] = "Mexico";

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
