package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {
        int index;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            arrayList.add((int) (Math.random() * 50));
        }

        System.out.println("ArrayList: " + arrayList);

        System.out.print("Value to find: ");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        keyboard.close();

        if (arrayList.contains(input)) {
            index = arrayList.lastIndexOf(input);
            System.out.println(input + " is in slot " + index);
        } else {
            System.out.println(input + " is not in the ArrayList.");
        }
    }
}
