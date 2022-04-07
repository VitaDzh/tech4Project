package homeworks;

import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {
        /*
        Requirement:
        Write a program that prints all the numbers from 1 to 10 (1 and 10 are included)
        If the number is dividable by 2, then print “Foo” instead of number itself
        If the number is dividable by 5, then print “Bar” instead of number itself
        If the number is dividable by both 2 and 5, then print “FooBar” instead of number itself
        Else print number itself
         */
        System.out.println("------------------TASK 1--------------------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        System.out.println();

        System.out.println("-------------------TASK 2--------------------");
        /*
        Write a program to find the first positive and negative numbers in an int array
        Test data:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        Expected output:
        First positive number is: 5
        First negative number is: -4
         */
        /*
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean positive = false;
        boolean negative = false;

        for (int number : numbers) {
            if (number != 0) {
                if (number > 0 && !positive) {
                    positive = true;
                    System.out.println("First positive number is: " + number);
                } else if (!negative) {
                    negative = true;
                    System.out.println("First negative number is: " + number);
                }
                if (positive && negative) break;
            }
        }
        if (!negative) System.out.println("There is no negative number");
        if (!positive) System.out.println("There is no positive number");
        System.out.println();

         */
        int pos = -1;
        int neg = 1;
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        for(int number : numbers){
            if(pos != -1 && neg != 1) break; // optional for performance
            if(pos == -1 && number > 0) {
                pos = number;
            } else if (neg == 1 && number < 0){
                neg = number;
            }
        }
        System.out.println((pos != -1) ? "First positive number is: " + pos : "Positive number was not found!");
        System.out.println((pos != 1) ? "First negative number is: " + pos : "Negative number was not found!");


        System.out.println("-----------------TASK 3-----------------");
        /*
        Write a program to generate 5 random numbers between 1 to 10
        (1 and 10 are included) and store those numbers in an int array.
        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return false
         */

        int[] randomNums = new int[5];
        boolean isContains2Or3 = false;
        for (int i = 1; i < randomNums.length; i++) {
                randomNums[i] = new Random().nextInt( 11 );
            System.out.println("Random number " + i + " is: " + randomNums[i]);
                if(randomNums[i] == 2 || randomNums[i] == 3) isContains2Or3 = true;
        }
        System.out.println(isContains2Or3);



        System.out.println("---------------TASK 4-------------");
        /*
        Write a program to find if String array contains “apple” as an element, ignore cases.
        Test data 1:
        String[] list = {“banana”, “orange”, “Apple”};
        Expected output:
        true
        Test data 2:
        String[] list = {“pineapple”, “banana”, “orange”, “grapes”};
        Expected output:
        false
         */
        String[] list = {"banana", "orange", "Apple"};
        boolean isApple = false;
        for (String word : list) {
            if(word.equalsIgnoreCase("apple")) isApple = true;
        } System.out.println(isApple);
        System.out.println();


        System.out.println("---------------------TASK 5---------------------");
        /*
        Requirement:
        Write a program to find the all-matching elements between 2  int arrays
        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};
        Expected output 2:
        There is no matching elements
         */
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        String str = "";

        boolean match = false;
        for (int num : numbers1) {
            for (int numb : numbers2) {
                if (num == numb) {
                    match = true;
                    str += num + "\n";
                }
            }
        }
        if(!match) System.out.println("There is no matching elements\n");
        System.out.println(str + "\n");


        System.out.println("---------------TASK 6---------------");
        /*
        Write a program to print duplicated characters in a String, ignore cases
        Test data 1:
         */


        String str6 = "baNana";
        String duplicates = ""; // inside container is a & n

        for (int i = 0; i < str6.length()-1; i++){ // i = 0; i < str.length()-1; --> outer loop must start at 0 to start
            // checking from first element
            for (int j = i + 1; j < str6.length(); j++){ // j = i + 1; j < str.length(); --> inner loop must start at
                // the iteration(index) the outer is in plus 1
                if (str6.toLowerCase().charAt(i) == str6.toLowerCase().charAt(j) // checking if there's matching letters
                        && !duplicates.contains("" + str6.toLowerCase().charAt(i))){ //see below note
                    duplicates += str6.toLowerCase().charAt(i); // add to/update container when condition is met
                    System.out.println(str6.charAt(i)); // here not printing container but the original str
                    break;
                }
            }
        }
        /* NOTE: a sign that a container is needed other than keywords "sum" and "count" is when a condition has already been meet and there
        are other elements that also meets the same condition; the container tells it not to check that like-element anymore.
        FOR THE ABOVE EXAMPLE: !duplicates.contains("" + str.toLowerCase().charAt(i)) --> HERE IS SAYING IF CONTAINER ALREADY HAS
        THIS ELEMENT IN IT THEN DON'T ADD ANOTHER SIMILAR ELEMENT. */










    }
}


