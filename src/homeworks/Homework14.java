package homeworks;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("------------------TASK 1-----------------");
        /*
        Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        boolean isDuplic = false;
        int attempt = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    attempt += 1;
                    System.out.println(numbers[i]);
                    isDuplic = true;
                    break;
                }
            }
            if (attempt > 0) break;
        }
        if (!isDuplic) System.out.println("There is no duplicates");


        System.out.println("------------------TASK 2-----------------");
        /*
        Write a program to find the first duplicated String in a String array, ignore cases.
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
        Test data 1:
        String[] words = {“Z”, “abc”, “z”, “123”, “#” };
         */
        String[] words = {"java", "QA", "HTML", "QA", "HTML"};
        boolean isDuplicat = false;
        int attempt2 = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicat = true;
                    attempt2 += 1;
                    System.out.println(words[j]);
                }
            }
            if (attempt2 > 0) break;
        }
        if (!isDuplicat) System.out.println("There is no duplicates");
        /* TASK - 2 Salih_RECAP
           boolean isDuplicateFound = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    isDuplicateFound = true;
                    break;
                }
            }
            if (isDuplicateFound) break;
        }
        if (!isDuplicateFound) System.out.println("There is no duplicates");
         */


        System.out.println("------------------TASK 3-----------------");
        /*
        Write a program to find the all duplicates in an int array. It should print
        “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbers3 = {0, -7, 5, 10, 5, 10, -4, 45};
        //                    0  -4 -7  0  5   10  45 -7  0
        String d = "";
        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if ((numbers3[i] == numbers3[j]) && (!d.contains(String.valueOf(numbers3[j])))) {
                    d += numbers3[j];
                    System.out.println(numbers3[j]);
                    break;
                }
            }
        }
        if (d.isEmpty()) System.out.println("There is no duplicates");

        /* TASK - 3 SALIH_ Recap
           String s = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !s.contains(numbers[i] + "")) {
                    s += numbers[i] + "\n";
                }
            }
        }

        System.out.println((s.isEmpty()) ? "There is no duplicates" : s);
         */

        System.out.println("\n- - - - - Task3 - - - - KEREM---\n");

        boolean d3 = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    d3 = true;
                    break;
                }
            }
        }
        if (!d3) System.out.println("There is no duplicates");

        System.out.println("------------------TASK 4------------------");
        /*
        Write a program to find the all duplicates in a String array, ignore cases.
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
         */
        String[] words4 = {"A", "foo", "12", "Fo", "bar", "m", "a", "java"};
        String dup = "";
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if ((words4[i].equalsIgnoreCase(words4[j]) && (!d.contains(String.valueOf(words4[j]))))) {
                    d += words4[j];
                    System.out.println(words4[j]);
                    break;
                }
            }
        }
        if (d.isEmpty()) System.out.println("There is no duplicates");

        /*
             System.out.println("\nTASK4\n");

        String[] ws = {"A", "foo", "12" , "Foo", "bar", "a", "a","java"};

        String duplicates = "";

        for (int i = 0; i < ws.length - 1; i++) {
            for (int j = i + 1; j < ws.length; j++) {
                if (ws[i].equalsIgnoreCase(ws[j]) && !duplicates.contains(ws[i].toLowerCase())){
                    System.out.println(ws[i]);
                    duplicates += ws[i].toLowerCase();
                }
            }
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
         */



        System.out.println("Trying boolean flag");

        boolean isEqual = false;
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j])) {
                    System.out.println(words4[j]);
                    isEqual = true;
                    break;
                }
            }
        }
        if (!isEqual) System.out.println("There is no duplicates");


        System.out.println("------------------TASK 5------------------");
        System.out.println("Using converting to ArrList");
        /*
        Write a program to reverse elements in an array, then print array.
        NOTE: Make your code dynamic that works for any given array.
         */
        String[] words5 = {"java", "python", "ruby"};
        List<String> converted = Arrays.asList(words5);
        Collections.reverse(converted);
        System.out.println(converted);


        /*
               System.out.print("[");
        for (int i = words2.length - 1; i >= 0; i--) System.out.print((i == 0) ? words2[i] : words2[i] + ", ");
        System.out.print("]");
       _______________________________________

           String[] reverseWords2 = new String[words2.length];// [ruby, python, java]
//        for (int i = 0; i < words2.length; i++) {
//            reverseWords2[i] = words2[words2.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(reverseWords2));
         */




        System.out.println("------------------TASK 6-------------------");
        /*
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any given String.
        Pseudo code:
        1. Create a containers for whole str and for each word
        2. use split method to  splits a string into an array
        3. Use 2 loops to reverse each word

         */

        String str = "Java is fun";
        String[] words1 = str.split(" ");
        String reversedString = "";

        for (String word : words1) {
            String reverseWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            reversedString += reverseWord + " ";
        }
        System.out.println(reversedString);

        

        System.out.println("\n- - - - - Task6 - - KEREM- - -\n");
        String string = "Java is fun ok";
        String[] opposite = string.split(" ");
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("-----------Here it is--------");
        System.out.println(reverseEachWord(string));

    }

    public static String reverseEachWord(String str){
        StringBuilder result = new StringBuilder();
        for(String word : str.split(" ")){
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
