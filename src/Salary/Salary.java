package Salary;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        System.out.print("Enter number of hours worked: ");
        Scanner in = new Scanner(System.in);
        double totalHoursWorked = in.nextInt();
        double standardWage = 17;
        double totalWage;

        totalWage = totalHoursWorked * standardWage;

        System.out.println("Your total salary is: " + totalWage + " $");
    }
}