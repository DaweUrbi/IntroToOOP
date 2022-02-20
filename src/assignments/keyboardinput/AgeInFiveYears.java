package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = input.next();

        System.out.printf("Hi, %s! How old are you?\n", name);
        age = input.nextInt();

        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?\n" +
                "And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
