package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {

    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        System.out.println("-------------TASK 1-----------");
        /*
        print true if collection contains Mouse element
        Print false otherwise
         */

        boolean isThereAMouse = false;
        for (String object : objects) {
            if (object.equals("Mouse")) {
                isThereAMouse = true;
                break;
            }
        }
        System.out.println(isThereAMouse);


        System.out.println("----------TASK 2----------");
        /*
        Check the collection u have above and print true if one of the element is board
        Print false otherwise
         */
        boolean isThereABoard = false;
        for (String object : objects) {
            if (object.equals("board")) {
                isThereABoard = true;
                break;
            }
        }
        System.out.println(isThereABoard);


        System.out.println("------------TASK 3------------");


                /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3
        Check if it has  7

        RESULT:
        true
        true
        true
        false
         */

        int[] nums = {5, -2, 0, -7, 0, 5, 8, 45, 53};
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, -7));













    }
}
