package homeworks;

import java.util.*;

public class Practice02 {
    public static void main(String[] args) {


  /*
    Write a program to find the first positive and negative numbers in an int array
    Test data:
    int[] numbers = {0, -4, -7, 0, 5, 10, 45};
    Expected output:
    First positive number is: 5
    First negative number is: -4
            */
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        int positive = -1;
        int negative = 1;

        for (int number : numbers) {
            if (positive == -1 && number > 0) {
                positive = number;
            } else if (negative == 1 && number < 0) negative = number;
        }
        System.out.println((positive != -1) ? "Positive is = " + positive : "There is no positive");
        System.out.println((negative != 1) ? "Negative is = " + negative : "There is no negative");

        /*
        Write a program to generate 5 random numbers between 1 to 10
        (1 and 10 are included) and store those numbers in an int array.
        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return false
         */
        int[] randomNums = new int[5];
        boolean contains2Or3 = false;
        for (int i = 0; i < 5; i++) {
            randomNums[i] = new Random().nextInt(11);
            System.out.println("num - " + randomNums[i]);
            if (randomNums[i] == 2 || randomNums[i] == 3) contains2Or3 = true;
        }
        System.out.println(contains2Or3);


        /*
        Requirement:
        Write a program to find the all-matching elements between 2  int arrays
        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};
        Expected output 2:
        There is no matching elements
         */
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean matched = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    matched = true;
                    System.out.println(numbers1[i]);
                }
            }
        }
        if (!matched) System.out.println("No match");


           /*
        Write a program to print duplicated characters in a String, ignore cases
        Test data 1:
         */

        String str6 = "baNana";
        String str = "";

        for (int i = 0; i < str6.length() - 1; i++) {
            for (int j = i + 1; j < str6.length(); j++) {
                if (str6.toLowerCase().charAt(i) == str6.toLowerCase().charAt(j) &&
                        !str.contains("" + str6.toLowerCase().charAt(i))) {
                    str += str6.charAt(i);
                    System.out.println(str6.charAt(i));
                    break;
                }
            }
        }

        /*
         /*
        Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbers14 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        boolean isDuplic = false;
        for (int i = 0; i < numbers14.length - 1; i++) {
            for (int j = i + 1; j < numbers14.length; j++) {
                if (numbers14[i] == numbers14[j]) {
                    System.out.println(numbers14[i]);
                    isDuplic = true;
                    break;
                }
            }
            if (isDuplic) break;
        }
        if (!isDuplic) System.out.println("No duplic");

          /*
        Write a program to find the all duplicates in an int array. It should print
        “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbers3 = {0, -7, 5, 10, 5, 6, 8 , 9, 8, 6, 10, -4, 45};
        ArrayList<Integer> duplic = new ArrayList<>();

        for (int i = 0; i < numbers3.length-1; i++) {
            for (int j = i+1; j < numbers3.length; j++) {
                if(numbers3[i] == numbers3[j] && !duplic.contains(numbers3[i]))
                    duplic.add(numbers3[i]);
            }
        }
        System.out.println(!duplic.isEmpty() ? duplic : "There is no duplic");

 /*
        Write a program to find the all duplicates in a String array, ignore cases.
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
         */
        String[] words4 = {"A", "foo", "12", "Fo", "bar", "m", "12", "m", "a", "java"};
        List<String> duplicStr = new ArrayList<>();

        for (int i = 0; i < words4.length-1; i++) {
            for (int j = i+1; j < words4.length; j++) {
                if(words4[i].equalsIgnoreCase(words4[j]) && !duplicStr.contains(words4[i]))
                    duplicStr.add(words4[i]);
            }
        }
        System.out.println(!duplic.isEmpty() ? duplicStr : "No duplics");


        String str7 = "Java is fun";
        String[] words1 = str7.split(" ");

        for(int i = 0; i < words1.length; i++){ // length = 3 elements
            for(int j = words1[i].length()-1; j >= 0; j--){ // taking one element
                System.out.print(words1[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println("----------Count words-----------");
        String str4 = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str4));








    }
            /*
        TASK 1
        Write a method countWords() that takes a String as an argument,
        and returns how many words there are in the the given String
        */
        // Str4

        public static int countWords(String str){
        int countSpaces = 0;
        String trimmed = str.trim();
            for (int i = 0; i < trimmed.length(); i++) {
                if(Character.isWhitespace(str.charAt(i))) countSpaces++;
            } return countSpaces + 1;
        }

         /*
    TASK 4
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer
    as an argument, and returns it back with removed duplicates
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arrayList){
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer integer : unique) {
            if(!unique.contains(integer))
                unique.add(integer);
        }

        return unique;
    }


    /*
    TASK 6
    Write a method removeExtraSpaces() that takes a String as an argument,
    and returns a String with removed extra spaces
     */

    public static String removeExtraSpaces(String str){
        String newOne = "";
        for (int i = 0; i < str.trim().length(); i++) {
            if(str.charAt(i) != ' ' || str.charAt(i+1) != ' ')
                newOne += str.charAt(i);
        } return newOne;
    }


}
