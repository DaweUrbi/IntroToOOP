package week2.arraylists;

import java.util.ArrayList;

public class GettingTheLargestValue {

    public static void main(String[] args) {
        int largest = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }

        System.out.println("ArrayList: " + arrayList);

        for (Integer n : arrayList) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("The largest value is " + largest);
    }
}