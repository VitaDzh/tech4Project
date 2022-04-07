package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("---------TASK 1--------");
        /*
        int[] numbers = {5, 3, 0, -5}
        Find the greatest and print it
         */
        int[] numbers = {5, 3, 0, -5};
        int max = 0;
        for (int number : numbers) {
            if (max < number) max = number; // max = Math.max(max, number);
        }
        System.out.println(max);


        /*
        TASK-2
        Create a double array and store below elements
        {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}
        Find the minimum value
        RESULT:
        0.5
         */

        double min = 1;
        double[] nums = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        for (double n: nums) {
            if(min > n) min = n;
        }
        System.out.println(min);

        System.out.println("Second way");
        double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double minValue = Double.MAX_VALUE;
        for (double number : array) {
            //if(number < minValue) minValue = number;
            minValue = Math.min(minValue, number);
        }
        System.out.println(minValue);

        /*
        Find second minimum value
         */
        double minValue2 = Double.MAX_VALUE;
        for(double number : array){
            if(number != minValue && number < minValue2)  minValue2 = number;
        }

        /*
        Find the second max
         */





















    }
}
