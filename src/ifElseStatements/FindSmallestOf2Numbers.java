package ifElseStatements;

import java.util.Scanner;

public class FindSmallestOf2Numbers {

    public static void main(String[] args) {
       /*
Write a program that asks user to enter 2 numbers
Find the smallest and print it

EXAMPLE PROGRAM:
Program: Please enter 2 numbers
User: 5 7

Program: 5
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter 2 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        //first way using simple if else
        if (num1 < num2) System.out.println("The smallest number between " + num1 + " and " + num2 + " is " + num1);
        else System.out.println("The smallest number between " + num1 + " and " + num2 + " is " + num2);

        /* second way Ternary operator
        1. Java ternary operator can be used instead of if else statement
        2. It is used a lot in Java programming
        NOTE: It can be used only for simple if-else statement
        It can not be used with is-else-is and nested!
        dataType variableName = condition ? option1 : option2;
        int greatest = 5 < 23 ? 23 : 5;
        Kaly 19
        Kaycee 20
        System.out.println ("Who is older?")
        String oldest = ageKaly < ageKaycee ? "Kaycee" : "Kaly"
         */
       // int smallestNumber = num1 < num2 ? num1 : num2; //can be used only with simple conditions. if not this than that!

        System.out.println("smallest is " + (num1 < num2 ? num1 : num2)); //TURNERY OPERATOR
        System.out.println("End of the program!");







    }
}
