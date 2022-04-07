package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        /*-----TASK 1------
        1.Write a program that asks user to enter 2 numbers.
        2.Store these data in int variables
        3.First, print the numbers entered by user with proper messages as shown below
        4.then print the sum of the given numbers by user with a proper message
         */
        System.out.println("Task 1");

        Scanner numbers = new Scanner(System.in);

        System.out.println("Pls enter your 1st number: ");
        int number1 = numbers.nextInt();

        System.out.println("Pls enter your 2d number");
        int number2 = numbers.nextInt();

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (number1 + number2));
        System.out.println();


        /* ------TASK 2------
        1.Write a program that asks user to enter 2 floating numbers.
        2. Store these data in double variables
        3. First, print the numbers entered by user with proper messages
        4. print the division of the given numbers by user with a proper message
         */
        System.out.println("Task 2");

        Scanner task2 = new Scanner(System.in);

        System.out.println("Pls enter your first number: ");
        double num1 = task2.nextDouble();

        System.out.println("Pls enter your second number: ");
        int num2 = task2.nextInt();

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 / num2));
        System.out.println();


        // -----TASK 3------
        System.out.println("Task 3");

        int arithmetic1 = -10 + ( 7 * 5 );
        System.out.println("1. \t\t " + arithmetic1);

        int arithmetic2 = (72 + 24) % 24;
        System.out.println("2. \t\t " + arithmetic2);

        int arithmetic3 = 10 + -3*9 / 9;
        System.out.println("3. \t\t " + arithmetic3);

        int arithmetic4 = 5 + 18 / 3*3 - (6 % 3);
        System.out.println("4. \t\t " + arithmetic4);
        System.out.println();


        // ------TASK 4------
        /*
        1.Write a program that asks user to enter 2 floating numbers.
        2.Store these data in double variables
        3.First, print the numbers entered by user with proper messages as shown below
        4.Print the sum (addition), multiplication, subtraction, division and remainder of these two numbers
         */
        System.out.println("Task 4");

        Scanner arithmeticOperators = new Scanner(System.in);

        System.out.println("Pls enter number 1: ");
        double numb1 = arithmeticOperators.nextDouble();

        System.out.println("Pls enter number 2: ");
        double numb2 = arithmeticOperators.nextDouble();

        System.out.println("The sum of the given numbers is = " + (numb1 + numb2));
        System.out.println("The product of the given numbers is = " + (numb1 * numb2));
        System.out.println("The subtraction of the given numbers is = " + (numb1 - numb2));
        System.out.println("The division of the given numbers is = " + (numb1 / numb2));
        System.out.println("The remainder of the given numbers is = " + (numb1 % numb2));
        System.out.println();


        //----TASK 5------
        // Write a Java program to print the area and perimeter of a rectangle
        System.out.println("Task 5");
        double widthOfRectangle = 7.5;
        double heightOfRectangle = 10.5;
        System.out.println("The area of the rectangle = " + (widthOfRectangle * heightOfRectangle));
        System.out.println("The perimeter of rectangle = " + (2*(widthOfRectangle + heightOfRectangle)));
        System.out.println();

        //-----TASK 6-----
        /*
         Assume that an average annual rate of salary for a Software Engineer in Test is $90k.
         Write a Java program to find how much money can a Software Engineer in Test earn in 3 years?
         */
        System.out.println("Task 6");
        double annualQATesterSalary = 90_000.00;
        double qATesterSalaryFor3Years = 3 * annualQATesterSalary;
        System.out.println("A Software Engineer in Test can earn " + qATesterSalaryFor3Years + " in 3 years.");














    }
}
