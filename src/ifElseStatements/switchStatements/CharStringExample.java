package ifElseStatements.switchStatements;
import java.util.Scanner;
public class CharStringExample {
    public static void main(String[] args) {
        char character = ' ';

        switch(character){
            case 'A':
                System.out.println("It is an upper case");
                break;
            case '5':
                System.out.println("It is a digit");
                break;
            case '&':
                System.out.println("It is a dollar sign");
                break;
            default:
                System.out.println("It is not A, 5 or $");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, tell me the greeting for the current time ");
        String greeting = scan.nextLine();
        switch (greeting){
            case "Good morning":
                System.out.println("Then, it is morning");
                break;
            case "Good evening":
                System.out.println("Then, it is evening");
                break;
            default:
                System.out.println("Well, nothing");
        }
        System.out.println("End of the program!");



    }
}
