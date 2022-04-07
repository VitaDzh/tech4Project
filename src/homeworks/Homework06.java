package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args){

        System.out.println("TASK 1");
        /*
        Convert given Strings below to int data types
        and find their sum, product, division, subtraction and remainder.
         */

        String s1 = "5", s2 = "10";
        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);
        System.out.println("-Sum of" + s1 + " and 10 is = " + (num1 + num2) + //dynamic code
                "\n-Product of 5 and 10 is = " + num1 * num2 +
                "\n-Division of 5 and 10 is = " + num1 / num2 +
                "\n-Subtraction of 5 and 10 is = " + (num1 - num2) +
                "\n-Remainder of 5 and 10 is = " + num1 % num2);
        System.out.println();

        System.out.println("TASK 2");
        /*
        Convert given Strings below to int data types and find
        the greatest and smallest values and find the average and
        absolute difference of them.
         */
        String s3 = "200", s4 = "-50";
        int ints3 = Integer.parseInt(s3), ints4 = Integer.parseInt(s4);
        System.out.println("The greatest value is = " + Math.max(ints3, ints4) +
                "\nThe smallest value is = " + Math.min(ints3, ints4) +
                "\nThe average is = " + (ints3 + ints4) / 2 +
                "\nThe absolute difference is = " + Math.abs(ints3 - ints4));
        System.out.println();

        System.out.println("TASK 3");
        /*
        Assume that you have a coin bank, and you save 3 quarters,
        1 dime, 2 nickels and 1 penny each day.
        -find how many days later you can save $24
        -find how many days later you can save $168
        -how much you will save after 5 months (assume a month is 30 days)
        3 quarters = 0.75
        1 dime = 0.10
        2 nickels = 0.10
        1 penny = 0.01
        sum is 0.96
         */
        double quarters3 = 0.75, dime1 = 0.10, nickels2 = 0.10, penny1 = 0.01;
        double sum$ = quarters3 + dime1 + nickels2 + penny1;
        System.out.println((int) (24 / sum$) + " days" + "\n" + (int) (168 / sum$) + " days \n$" + (30 * 5) * sum$);
        System.out.println();

        System.out.println("TASK 4");
        /*
        Jessie is going to save $1,250 to buy a new computer. Jessie is saving $62.5 in a day.
        Write a Java program that calculates how many days it will take for Jessie to buy the computer.
         */
        int gointToSave = 1_250;
        double savePerDay = 62.5;
        System.out.println(gointToSave / (int) savePerDay);
        System.out.println();

        System.out.println("TASK 5");
        /*
        Dan is going to save $14,265 to buy a new car.
        Dan is given two options to make monthly payments with no interest rate.
        Option 1: Equal payments of $475.50 per month
        Option 2: Equal payments of $951 per month
        Write a Java program that calculates how many months
        it will take for Dan to complete all the payments with option 1 and option 2.
         */
        double option1 = 475.50;
        int option2 = 951;
        int total = 14_265;
        System.out.println("Option 1 will take " + (int)(total / option1) + " months"
        + "\nOption 2 will take " + (total / option2) + " months");
        System.out.println();

        System.out.println("TASK 6");
        /*
        Write a Java program that asks user to enter 2 numbers(number1 and number2) and store those in int variables.
        Find the result of number1/number2 and store this in a double.
        Finally print the result
         */
        Scanner homework6 = new Scanner(System.in);
        System.out.println("Pls enter 2 numbers: ");
        int number1 = homework6.nextInt();
        int number2 = homework6.nextInt();
        double result = (double) number1 / (double) number2;
        System.out.println(result);


    }
}
