package week2.arraylists;

import java.util.ArrayList;

public class BasicArrayLists2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            arrayList.add((int) (Math.random() * 100));
        }

        System.out.println("ArrayList: " + arrayList);
    }
}
