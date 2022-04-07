package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args){

        //-----TASK 1-----
        /*
        -Write a Java program that asks user to enter 2 numbers
        as input and print the average of the numbers.
         */
        System.out.println("TASK 1");
        Scanner homework04 = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number1 = homework04.nextInt();
        int number2 = homework04.nextInt();
        System.out.println("The average of the given 2 numbers is: " + ((number1 + number2) / 2));

        // -----TASK 2-----
        /*
        -Write a Java program that asks user to enter 2 numbers
        as input and print the product of the numbers.
         */
        System.out.println("TASK 2");
        System.out.println("Please enter 2 numbers: ");
        int num1 = homework04.nextInt();
        int num2 = homework04.nextInt();
        System.out.println("The product of the given 2 numbers is: " + (num1*num2));


        //----TASK 3-----
        /*
        -Write a Java program that asks user to enter 3 numbers as input
        and print the square of each number entered by user.
         */

        System.out.println("TASK 3");
        System.out.println("Please enter 3 numbers: ");
        int numb1 = homework04.nextInt();
        int numb2 = homework04.nextInt();
        int numb3 = homework04.nextInt();

        System.out.println("The " + numb1 + " multiplied with" + num1 + " is = " + (numb1 * numb1)); //!!!!!!! instead of using String, we use variable name, so it could be changed in number if user put different number
        System.out.println("The 6 multiplied with 6 is = " + (numb2 * numb2));
        System.out.println("The 10 multiplied with 10 is = " + (numb3 * numb3));

        //----TASK 4-----
        /*
        -Write a Java program that asks user to enter 2 numbers
        and print the remainder of first number by second number
         */
        System.out.println("TASK 4");
        System.out.println("Please enter 2 numbers: ");
        System.out.println("The remainder of 25 % 8 = " + (homework04.nextInt() % homework04.nextInt()));


        //----TASK 5----
        /*
        Write a Java program that asks user to enter 5 numbers
        as input and print the average of numbers.
         */
        System.out.println("Please enter 5 numbers: ");
        System.out.println("The average of the given 5 numbers is: " + ((homework04.nextInt() + homework04.nextInt() + homework04.nextInt() + homework04.nextInt() + homework04.nextInt()) / 5));

        //----TASK 6----
        /*
        -Write a Java program that asks user to enter a number
        as input and print its multiplication table up to 10.
         */
        System.out.println("Please enter a number: ");
        int multiplicNumber = homework04.nextInt();
        int num = 1;

        /*System.out.println("7*1 = " + (7*1) + "\n7*2 = " + (7*2) + "\n7*3 = " + (7*3) + "\n7*4 = " + (7*4) + "\n7*5 = "
                + (7*5) + "\n7*6 = " + (7*6) + "\n7*7 = " + (7*7) + "\n7*8 = " + (7*8) + "\n7*9 = " + (7*9) +
                "\n7*10 = " + (7*10)); //DO NOT HARDCODE!!!!!!!! USE DYNAMIC
         */
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));
        System.out.println(multiplicNumber + " * " + num + " = " + (multiplicNumber * num++));



        //----TASK 7----
        /* -Write a Java program that asks user to enter the side of a square as input and print
        square’s perimeter and area
        NOTE: area of a square = side * side; perimeter of a square = 4 * side
         */
        System.out.println("Pls enter the side of a square: ");
        int sideOfSquare = homework04.nextInt();
        System.out.println("Perimeter of the square = " + (4*sideOfSquare) + "\nArea of the square = " + (sideOfSquare*sideOfSquare));

    }
}
