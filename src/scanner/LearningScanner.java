package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am gonna use Scanner class for creating my objects
        2. I'll use the object for creating data
         */

        Scanner scan = new Scanner(System.in); // we created an object. the name of the object scan for using the method next()

        System.out.println("Please put your first name"); // this is what i want user to put
        String firstName = scan.next(); // storing the first name from user. This method takes only one word

        System.out.println("Please put your name:");
        String lastName = scan.next();

        System.out.println("First name = " + firstName); //printing the object(which is also a variable)
        System.out.println("Second name = " + lastName);







    }
}
