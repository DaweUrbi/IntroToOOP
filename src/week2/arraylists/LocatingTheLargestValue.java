package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int largest = 0;
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            arrayList.add((int) (Math.random() * 100));
        }

        System.out.println( "ArrayList: " + arrayList);

        for (int x = 0; x < arrayList.size(); x++) {
            if (arrayList.get(x) > largest) {
                largest = arrayList.get(x);
                index = x;
            }
        }
        System.out.println("The largest value is " + largest + ", which is in slot " + index);
    }
}

