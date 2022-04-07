package mathClass;

import java.util.Scanner;

public class ExerciseMaxRandom {
    public static void main(String[] args) {

        /*
        Create a program which is generating a random number between 45-98
        and print it out
         */
        System.out.println("Random number is: " + (int)(Math.random() * 53 + 45));

        /*
        Generate 2 random numbers between 67 - 85 included
        print out num1 and num2 and max and min
         */

        int random1 = (int)(Math.random() * 19 + 67);
        int random2 = (int)(Math.random() * 19 + 67);

        System.out.println("First number is = " + random1 +
                "\nSecond number is = " + random2 +
                "\nThe max: " + Math.max(random1, random2) +
                "\nThe min: " + Math.min(random1, random2));







    }
}
