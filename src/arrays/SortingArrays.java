package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        How to SORT an array of numbers
        Ascending
         */

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        System.out.println("My array is = " + Arrays.toString(numbers));

        //Sort array in ascending order [-5, 0, 0, 0, 7, 9, 10]
        Arrays.sort(numbers); // it is VOID that's why we can not use it in sout immediately
        System.out.println("My sorted array is " + Arrays.toString(numbers));


        System.out.println("---------Sorting characters-----------");
        char[] characters = {'A', 'b', 'z', 'H'};
        System.out.println("My char array = " + Arrays.toString(characters));
        Arrays.sort(characters);
        System.out.println(characters); // AHbz, because Uppercases go first

        System.out.println("-----------Sorting words--------------");
        String[] names = {"Adam", "Alex", "tom", "allay", "Adele", "Allay", "terry"};
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toLowerCase(); // TO GET A FIRST CHAR of each name -->
            // names[i] = names[i].toLowerCase.charAt[0] + names[].toUpperCase().substring(1;)
        }
        Arrays.sort(names);
        System.out.println("Sorted " + Arrays.toString(names));




    }
}
