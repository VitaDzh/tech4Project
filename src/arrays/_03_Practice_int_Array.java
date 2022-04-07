package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {
        /*
        Create an int array and store below data
        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15
        Print the array with message "Array not sorted = "
        Print sorted array with message "Array sorted = "
         */

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------TASK 2-----------");
        /*
        TASK 2
        Count how many positive, negative and zeros numbers u have
        USE ONE LOOP
        Expected:
        Positives = 6
        Negatives = 2
        Zeros = 3
         */

        int positives = 0, Zeros = 0, Negatives = 0;
        for (int num: numbers) {
            if(num > 0) positives++;
            else if(num == 0) Zeros++;
            else Negatives++;
        }
        System.out.println("Positives = " + positives +
                "\nZeros = " + Zeros +
                "\nNegatives = " + Negatives);

        System.out.println("\n-------TASK-2 - another approach-------\n");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));

        System.out.println("---------------TASK 3--------------");
        /*
        Task 3
        Count even and odd
        Evens = 5
        Odds = 5
         */
        int evens = 0;
        for (int number : numbers){
            if (number % 2 == 0) evens++;
        } System.out.println("Evens = " + evens + "\nOdds " + (numbers.length - evens));


        /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */








    }
}
