package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {
        /*
TASK-1
Create a char array, store values and print
Output:  [#, $, 5, A, b, H]
Print the length
 */

        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("The size of the array is = " + chars.length );

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", "); // chars[i] will print each from the new line
        }

        /*
        Each element using FOR EACH loop
         */
        for(char character : chars){
            System.out.println(character);
        }  System.out.println("End");
        /*
        Print each element that are letters
         */
        for(char character : chars){
            if(Character.isLetter(character)){
                System.out.println(character);
            }
        }
        System.out.println("The end");

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i]))
                System.out.println(chars[i]);
        }
        /*
        Count how many Upper case do u have
         */
        System.out.println("FORI LOOP");
        int count = 0;
        for(int i = 0; i < chars.length; i++) { // system shows u that it is better to use FOR ECH, because u are checking each element
            if (Character.isUpperCase(chars[i])) count++;
        } System.out.println(count);

        System.out.println("FOR EACH LOOP");
        int count1 = 0;
        for(char element : chars){
            if(Character.isUpperCase(element)) count1++;
        } System.out.println(count1);


        /*
        Extra practices
        count digits
        spaces
        count specials
         */






    }
}
