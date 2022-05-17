package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework18 {
    /*
    Requirement:
    -Create a method called noSpace()
    -This method will take one String argument and it will return a new String with
    all spaces removed from the original String
     */
    public static String noSpace(String str) {
        return str.replaceAll(" ", "");
    }

    /*
    -Create a method called replaceFirstLast()
    -This method will take one String argument and it will return
    a new String with first and last characters replaced
    NOTE: if the length is less than 2, then return empty String
    NOTE: Ignore all before and after spaces (get actual String only)
     */
    public static String replaceFirstLast(String str) {
        if (str.length() < 2) return str;
        else {
            char[] arr = str.trim().toCharArray();
            char first = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = first;
            return String.valueOf(arr);
        }
    }

    /*
    -Create a method called hasVowel()
    -This method will take one String argument and it will return a
    boolean checking if String has any vowel or not
    NOTE: Vowels are = a, e, o, u, I
    NOTE: Ignore cases
     */
    public static boolean hasVowel(String str) {
        Pattern pattern = Pattern.compile("[aeoui]");
        Matcher matcher = pattern.matcher("I love Java and JavaScript");
        return matcher.find();
    }

    /*
    -Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument and it will print
    message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic way.
    You can use Date class.
     */
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int age = currentYear - yearOfBirth;

        if(age > 100 || yearOfBirth > currentYear) System.out.print("AGE IS NOT VALID");
        else if(age < 16) System.out.print("AGE IS NOT ALLOWED");
        else System.out.print("AGE IS ALLOWED");
    }

    /*
    -Create a method called averageOfEdges()
    -This method will take three int arguments and it will
    return average of min and max numbers
     */
    public static int averageOfEdges(int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }

    /*
    -Create a method called noA()
    -This method will take a String array argument and it will return a new array
    with all elements starting with A or a replaced with “###”
    NOTE: Assume length will always be more than zero
    NOTE: Ignore cases
     */
    public static String[] noA(String[] arr){
        String[] replaces = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            if(arr[i].toLowerCase().startsWith("a")) replaces[i] = arr[i].replaceFirst("[a]", "###");
            else replaces[i] = arr[i];
        }
        return replaces;
    }




    /*
    -Create a method called no3or5()
    -This method will take an int array argument and it will return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101
    NOTE: Assume length will always be more than zero
     */

    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 3 == 0) arr[i] = 100;
            else if(arr[i] % 5 == 0) arr[i] = 99;
        }
return arr;
    }

    /*
    -Create a method called countPrimes()
    -This method will take an int array argument and it will return how many elements in the array are prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2
     */
    public static int countPrimeee(int[] arr){
        int countPrime = 0;
        for (int a : arr) {
            int  countInside = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && a != 1) {
                    countInside++;
                }
            }
            if(countInside == 2) countPrime++;
        }
        return countPrime;
    }



    public static void main(String[] args) {

        System.out.println("TASK 1(remove all spaces from a String) -->> " + noSpace("I love Java and JavaScript"));
        System.out.println("TASK 2(swapping first and last chars in an Array) -->> " + replaceFirstLast("I love Java and JavaScript"));
        System.out.println("TASK 3(does String contains vowels?) -->> " + hasVowel("I love Java and JavaScript"));
        System.out.print("TASK 4(check Age) -->> ");
        checkAge(1800);
        System.out.println("\nTASK 5(find average from 3 nums) -->> " +averageOfEdges(3, 5, 8));
        String[] arr = {"I", "love", "ava", "and", "avaScript"};
        System.out.println("TASK 6(replace first char if it is A or a) -->> " + Arrays.toString(noA(arr)));
        int[] arr2 = {3, 4, 5, 6};
        int[] arr3 = {10, 11, 12, 13, 14, 15};
        int[] arr4 = {7, 4, 11, 23, 17};

        System.out.println("TASK 7(replace int[] elements) -->> " + Arrays.toString(no3or5(arr2)));
        System.out.println("TASK 7(replace int[] elements) -->> " + Arrays.toString(no3or5(arr3)));
        System.out.println("TASK 7(replace int[] elements) -->> " + Arrays.toString(no3or5(arr4)));

        int[] arr5 = {-10, -3, 0, 1};
        int[] arr6 = {7, 4, 11, 23, 17};
        int[] arr7 = {41, 53, 19, 47, 67};

        System.out.println("TASK 8 (countPrimeNums) -->> " + countPrimeee(arr5));
        System.out.println("TASK 8 (countPrimeNums) -->> " + countPrimeee(arr6));
        System.out.println("TASK 8 (countPrimeNums) -->> " + countPrimeee(arr7));
    }



}

