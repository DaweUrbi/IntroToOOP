package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        String name;
        int age;
        double salary;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = input.next();

        System.out.printf("Hi, %s! How old are you?\n", name);
        age = input.nextInt();

        System.out.printf("So you're %d, eh? That's not old at all!\n" +
                "How much do you make, %s\n", age, name);
        salary = input.nextDouble();

        System.out.println( salary + "! I hope that's per hour and not per year! LOL!");

    }
}
