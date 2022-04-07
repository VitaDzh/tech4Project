package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {

    public static void main(String[] args){

        /*How to use scanner methods:
        1.Create an object of Scanner (import a class as well)
        ClassName/DataType variableName/objectName = new className/DataType();
        2.variableName/objectName .methodNAme();
        */


        /*
        Task-1
        1. Ask user to enter the age (interract )
        2. Print the question
        3. Use the proper next method(nextInt)
        4. Print out the user's age
         */
        Scanner collect = new Scanner(System.in); //we created a object
        System.out.println("How old are you");
        int age = collect.nextInt();
        System.out.println("User age is = " + age);


        // Account balance
        System.out.println("What is your acc balance? ");
        double number = collect.nextDouble();
        System.out.println("\n\t\'Show your card balance\' = \"$" + number + "\"");


        System.out.println("Are u understanding this Java Class today?");
        boolean javaClass = collect.nextBoolean();
        System.out.println("R u OK? " + javaClass);








    }

}
