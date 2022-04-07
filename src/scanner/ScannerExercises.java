package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        /*
        Pseudo Code:
        1. Create an object of scanner (import)
        2. Print out instructions about what we need
        3. Use next() methods for reading
        4. Print out the first and last name in one statement

         */

        Scanner names = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = names.next();
        System.out.println("Please enter your last name:");
        String lastName = names.next();
        System.out.println("Your full name is " + firstName + " " + lastName);


        // Write a Java program that reads the full address from user and print the address
        Scanner addresses = new Scanner(System.in);
        System.out.println("Please enter your full address: ");
        String usersAddress = addresses.nextLine();               // input.nextLine(); --> this action takes space
        System.out.println("User's Address is: \"" + usersAddress + "\"");

        // Write a Java program that summurize numbers
        Scanner usersNumbers = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNumber = usersNumbers.nextInt();
        System.out.println("User's first number is: " + firstNumber);

        System.out.println("Please enter your second number: ");
        int secondNumber = usersNumbers.nextInt();
        System.out.println("User's second number is: " + secondNumber);

        System.out.println("Please enter your fourth number: ");
        int thirdNumber = usersNumbers.nextInt();
        System.out.println("User's third number is: " + thirdNumber);
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.println("First Number: ");
        int num1 = userInput.nextInt();
        System.out.println("Second number: ");
        int num2 = userInput.nextInt();
        System.out.println("Third Number: ");
        int num3 = userInput.nextInt();

        int sum1 = num1 + num2 + num3;
        System.out.println("Sum: " + sum1);






    }
}
