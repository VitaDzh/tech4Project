package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        //How to sort in Array
        System.out.println("----------Sorting in an Array---------");
        int[] numbersArray = {3, 7, 0 , 4};
        System.out.println("Unsorted array: " + Arrays.toString(numbersArray));
        Arrays.sort(numbersArray);
        System.out.println("Sorted array: " + Arrays.toString(numbersArray));

        System.out.println("---------Sorting in an ArrayList-----------");
        ArrayList<Integer>  numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(7);
        numberList.add(0);
        numberList.add(4);

        System.out.println("My list before sorting : " + numberList);
        Collections.sort(numberList);
        System.out.println("My list after sorting: " + numberList);









    }
}
