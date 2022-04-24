package projects;

import java.util.Arrays;

public class Project07 {

    /*
            TASK-1 - findGreatestAndSmallestWithSort() method
            Write a method that takes an int array that has at least one element. Find the greatest and smallest elements
            from the array and print them. Complete task using sort() method.
            Test data:
            [10, 7, 7, 10 -3, 10, -3]
            Expected output:
            Smallest = -3
            Greatest = 10
     */
    public static void findGreatestAndSmallest(int[] num) {
        if (num.length >= 1) {
            Arrays.sort(num);
            int smallest = num[0];
            int greatest = num[num.length - 1];
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }

    /*
        TASK-2 findGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element.
        Find the greatest and smallest
        elements from the array and print them.
        DO NOT sort the array and complete task without sorting.
        Test data: [10, 7, 7, 10 -3, 10, -3]
        Expected output:
        Smallest = -3
        Greatest = 10
     */
    public static void findGreatestAndSmallestNoSort(int[] nums){
        if(nums.length >= 1){
            int smallest = Integer.MAX_VALUE;
            int greatest = Integer.MIN_VALUE;
            for(int element : nums){
                if(element < smallest) smallest = element;
                if(element > greatest) greatest = element;
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }

    /*
        TASK-3 - findSecondGreatestAndSmallestWithSort() method
        Write a method that takes an int array that has at least one element.
        Find the second greatest and second smallest elements from the array and print them.
        Complete task using sort() method.
        Test data: [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] num) {
        if (num.length >= 1) {
            Arrays.sort(num);
            int smallest = num[0];
            int greatest = num[num.length - 1];
            int seconMin = num[0] + 1;
            int seconMax = num[num.length-2];

            System.out.println("Second Smallest = " + seconMin);
            System.out.println("Second Greatest = " + seconMax);
        }
    }
    /*
      //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]){
                System.out.println(nums[i]);
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] != nums[nums.length - 1]){
                System.out.println(nums[i]);
                break;
            }
        }
     */

    /*
        TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element.
        Find the second greatest and second smallest elements from the array and print them.
        DO NOT sort the array and complete task without sorting.
        Test data: [10, 5, 6, 7, 8, 5, 15, 15]
        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallest(int[] nums){
        if(nums.length >= 1){
            int smallest = Integer.MAX_VALUE;
            int greatest = Integer.MIN_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            int secondGreatest = Integer.MIN_VALUE;
            for(int element : nums){
                if(element < smallest) smallest = element;
                if(element > greatest) greatest = element;
            }
            for (int element : nums) {
                if(element < secondSmallest && element != smallest) secondSmallest = element;
                if(element > secondGreatest && element != greatest) secondGreatest = element;

            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
        }
    }

    /*
        TASK-5 - findDuplicatedElementsInAnArray() method
        Write a method that takes a String array. Find all duplicated elements and print them.
        NOTE: It is case-sensitive!
        Test data: [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
        Expected output:
        bar
        6
     */
    public static void findDuplicatedElementsInAnArray(String[] str) {
        String duplic = "";
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !duplic.contains(str[i])) {
                    duplic += str[i] + "\n";

                }
            }
        } System.out.println(duplic);
    }

    /*
        TASK-6 findMostRepeatedElementInAnArray() method
        Write a method that takes a String array.
        Find the most repeated element and print it.
        Test data: [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
        Expected output: pen
     */

    public static void findMostRepeatedElementInAnArray(String[] arr) {
     Arrays.sort(arr);
     int max_count = 1, count = 1;
     String element = "";
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) count++;
            if(arr[i] != arr[i-1] || i == arr.length-1){
                if(count > max_count){
                    max_count = count;
                    element = arr[i-1];
                }
                count = 1;
            }
        }
        System.out.println(element);
    }

    /*

     */











    public static void main(String[] args) {
        System.out.println("-----------TASK 1 RESULT-----------");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(numbers);

        System.out.println("-----------TAKS 2 RESULT------------");
        findGreatestAndSmallestNoSort(numbers);

        System.out.println("----------TASK 3 RESULT------------");
        int[] n = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(n);

        System.out.println("-----------TASK 4 RESULT------------");
        findSecondGreatestAndSmallest(n);

        System.out.println("----------TASK 5 RESULT-----------");
        String[] dup = {"foo", "bar", "bar", "Foo", "bar", "6", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(dup);

        System.out.println("----------TASK 6 RESULT-----------");
        String[] mostRepeated = {"pen", "eraser", "pencil", "pen", "pen", "eraser", "123","eraser", "123", "abc", "eraser"};
        findMostRepeatedElementInAnArray(mostRepeated);

        findMostRepeatedElementInAnArray(new String[]{"x", "c", "b", "x"});
    }
}




