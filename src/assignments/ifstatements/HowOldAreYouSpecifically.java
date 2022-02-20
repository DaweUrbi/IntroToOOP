package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        name = input.next();

        System.out.printf("Ok, %s, how old are you?\n", name);
        age = input.nextInt();

        if (age < 16) {
            System.out.printf("You can't drive, %s.", name);
        } else if (age < 18) {
            System.out.printf("You can drive but not vote, %s.", name);
        } else if (age < 25) {
            System.out.printf("You can vote but not rent a car, %s.", name);
        } else {
            System.out.printf("You can do pretty much anything, %s.", name);
        }
    }
}
