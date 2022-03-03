package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            arrayList.add((int) (Math.random() * 50));
        }

        System.out.println( "ArrayList: " + arrayList);

        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();

        if (arrayList.contains(input)) {
            System.out.println(input + " is in the ArrayList.");
        }
    }
}
