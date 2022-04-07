package arrays;

import java.util.Arrays;

public class _04_Practice_Parcial_Arrays {
    public static void main(String[] args) {

        System.out.println("----------TASK 1----------");
        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int num: numbers) {
            System.out.println(num);
        }

        System.out.println("-----------TASK 2-----------");
        /*
        find the sum of all the elements
        Output - 29
         */
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }System.out.println(sum);

        int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum2+=numbers[i];
        }
        System.out.println(sum2);


        System.out.println("-----------TASK 3----------");
        /*
        Find a sum of first 3 elements in the Array

         */
        int sumOf3 = 0;
        for (int i = 0; i < 3; i++) {
            sumOf3 += numbers[i];
        }
        System.out.println(sumOf3);


        int sumOf4 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers.length < 3) sumOf4+=numbers[i];
            else break;
        }
        System.out.println(sumOf4);

        System.out.println("--------------TASK 4-------------");
        /*
        Find the sum of last 5 in array
        Result - 22
         */
        int sumOfLast5 = 0;
        for (int i = numbers.length-5; i < numbers.length; i++) {
            sumOfLast5 += numbers[i];
        } System.out.println(sumOfLast5);


        System.out.println("---------TASK 5-----------");
        /*
        Find the product of last 4 elements in the array, but exclude zero if there are any
        Result 156
         */
        int productOfLast4 = 1; // have to start with 1 for multiplication
        for (int i = numbers.length-4; i < numbers.length; i++) {
            int number = numbers[i];
            if(number == 0) continue;
            productOfLast4 *= number;
        } System.out.println(productOfLast4);


        System.out.println("----------TASK 6------------");
        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero
        RESULT:
        true
         */
        boolean isElement0 = false;
        for (int num: numbers) {
            if (num == 0) {
                isElement0 = true;
                break;
            }
        } System.out.println(isElement0);













    }
}
