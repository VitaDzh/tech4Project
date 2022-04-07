package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        System.out.println("----------TASK 1----------");
        /*
        Task - 1
        Create an ArrayList that stores below numbers:
        10
        12
        13
        8
        9
        15
        Print the list
         */
       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);


        System.out.println("-----------TASK 2------------");
        /*
        How many odd numbers are in the List. and Print
         */
        System.out.println("----------FOR EACH LOOP---------");
        int count = 0;
        for (Integer num: numbers) {
            if(num % 2 != 0) count++;
        } System.out.println("Odds = " + count);

        System.out.println("-----------FORI LOOP----------");
        count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1) count++;
        }
        System.out.println("Odds = " + count);

        System.out.println("------------TASK 3------------");
        /*
        Create a List called colors that stores below elts:
        Purple
        Yellow
        blue
        red
        Brown
        Black
        White
        Print the List
         */

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);

        System.out.println(colors);

        /*
        TASK 4
        Count how many colors in the list start with upper case.
         */
        /*
        count = 0;
        for (String color : colors) {
            if(Character.isUpperCase(color.charAt(0)))
                count++;
        }
        System.out.println(count);

        count = 0;
        for (int i = 0; i < colors.size(); i++) {
            if(Character.isUpperCase(colors.get(i).charAt(0))) count++;
                count++;
        }
        System.out.println(count);

        /*
        length at least of 4
        empties
        nulls
        that has length of even or odd
        that has a or A
         */












    }
}
