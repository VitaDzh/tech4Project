package arrays;

import java.util.Arrays;
import java.util.Locale;

public class FruitsCollection {
    public static void main(String[] args) {
        /*
        Task-1
        Create an array that will store 4 fruit names
         */
        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));

        /*
        Task-2
        U have 4 fav fruits. Store them. Decide the one u like most. Store in the index of 0
        Store 4th fav fruit in the index of 3
        print the array
         */
        String[] favFruits = new String[4];
        favFruits[0] = "Apple";
        favFruits[3] = "Mango";
        System.out.println(Arrays.deepToString(favFruits));

        /*
        Task - 3
        Find the size of your array and print it
         */

        System.out.println(favFruits.length); // length of ARRAY. SIZE of Array. how many elements it contains. length is an instance variable

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */
        System.out.println(favFruits[0].toLowerCase() + " " + favFruits[3]);
        System.out.println(favFruits[0].charAt(0) + " " + favFruits[3].length());









    }
}
