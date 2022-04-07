package scanner;
import java.util.Scanner;

public class SolvingScannerNextLineProblem {
    public static void main(String[] args){

        /*
        name--> next()
        full name --> nextLne()
        age --> nextInt()
        fav quote --> nextLine() . There gonna be a problem, we would need to put an empty nextLine()
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = userInput.next();

        System.out.println("Whats your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOK = userInput.nextBoolean();

        System.out.println("Whats your address?");
        userInput.nextLine();   // gives u a new line to type the data
        String address = userInput.nextLine();

        System.out.println("User name is = " + name +
                "\nUser age is = " + age +
                "\nIs user's brain OK? = " + myBrainOK +
                "\nUser's address is = " + address);





    }
}
