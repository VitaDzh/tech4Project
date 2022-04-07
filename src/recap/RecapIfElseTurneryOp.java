package recap;

import java.util.Scanner;

public class RecapIfElseTurneryOp {
    public static void main(String[] args) {

        //03/01/2022
        /*
        write a code takes a user age and
        if the user is 16 or older print out "You can drive"
        if the user is 18 or older print out "You can work"
        if the user is 21 or older print out "You can drink"
        if the user is 25 or older print out "You can rent a car"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your num: ");
        int age = scan.nextInt();
        if(age > 15) {
            System.out.println("You can drive");
            if (age > 17) {
                System.out.println("You can work");
                if (age >= 21) {
                    System.out.println("You can drink");
                    if (age >= 25) {
                        System.out.println("You can rent a car");
                    }
                }
            }
        }

        //TERNARY
        /*
        (expression) ? action for true : action for false;
         */
        /* TASK 1
        Write a progr that asks user their height
        if their height is lower than 5 feet print out "You can go ro roller coaster"
        else print out "You are tall"
         */
        System.out.println((scan.nextInt() < 5) ? "you cann't go to roller coaster" : "you are tall");

        /*TASK 2
        Write a prog that asks user their balance
        if their balance is lower than 50$ print out "You are poor"
        else "You are good"
         */
        System.out.println((scan.nextDouble() < 50.0) ? "you are poor" : "you r good");





    }
}
