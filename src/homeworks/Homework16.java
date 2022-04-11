package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework16 {

    /*
    TASK 1
    Write a method countWords() that takes a String as an argument,
    and returns how many words there are in the the given String
     */
    public static int countWords(String str) {
        String trimmed = str.trim();
        int spaces = 0;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ') spaces++;
        }
        return spaces + 1;
    }

    /*
    TASK 2
    Write a method countA() that takes a String as an argument,
    and returns how many A or a there are in the the given String
     */

    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }

    /*
    TASK 3
    Write a method countPos() that takes an ArrayList of Integer as an argument,
    and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> arrayList) {
        int countPos = 0;
        for (Integer integer : arrayList) {
            if (integer > 0) countPos++;
        }
        return countPos;
    }

    /*
    TASK 4
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer
    as an argument, and returns it back with removed duplicates
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (!unique.contains(integer)) {
                unique.add(integer);
            }
        }
        return unique;
    }

        /*
        TASK 5
        Write a method removeDuplicateElements() that takes an ArrayList of String as an argument,
        and returns it back with removed duplicates
        */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arrayList) {
        ArrayList<String> newList = new ArrayList<>();
        for (String s : arrayList) {
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }
        return newList;
    }

    /*
    TASK 6
    Write a method removeExtraSpaces() that takes a String as an argument,
    and returns a String with removed extra spaces
     */
    public static String removeExtraSpaces(String str) {
        str = str.trim();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') result += str.charAt(i);
        }
        return result;
    } //I   am      learning     Java --> it adds a space when i = ' ' and i+1 != ' ' (basically,
    // takes last space before next word starts)

    /*
    TASK 7
    Write a method add() that takes 2 int[] arrays as arguments and
    returns a new array with sum of given arrays elements.
     */
   /* public static int[] add(int[] arr1, int[] arr2){
        int[] nums = new int[Math.max(arr1.length, arr2.length)];

        for (int i = 0; i < nums.length; i++) {
            if(arr2.length > i){
                nums[i] += arr2[i];
            }
            if(arr1.length > i){
            nums[i] += arr1[i];
            }
        }
        return nums;
    }
    */
    public static int[] add(int[] arr1, int[] arr2) {
        if (arr1.length >= arr2.length) {
            int[] sum = new int[arr1.length];

            for (int i = 0; i < sum.length; i++) {
                if (i < arr2.length)
                    sum[i] = arr1[i] + arr2[i];
                else sum[i] = arr1[i];
            }
            return sum;
        } else {
            int[] sum = new int[arr2.length];
            for (int i = 0; i < sum.length; i++) {
                if (i < arr1.length)
                    sum[i] = arr1[i] + arr2[i];
                else sum[i] = arr2[i];
            }
            return sum;
        }
    }
/*
Write a method findClosestTo10() that takes an int[] array as an argument,
and returns the closest element to 10 from given array
Test data 1:
int[] numbers = {10, -13, 5, 70, 15, 57};
 */
public static int findClosestTo10(int[] numbers) {  // Akin's solution
    Arrays.sort(numbers);
    int leftClosest = Integer.MIN_VALUE;
    int rightClosest = Integer.MAX_VALUE;

    for(int number : numbers){
        if(number < 10 && number > leftClosest) leftClosest = number;
        else if(number > 10 && number < rightClosest) rightClosest = number;
    }
    if(10 - leftClosest <= rightClosest - 10) return leftClosest;
    return rightClosest;
}




    public static void main(String[] args) {
        String str = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str));
        String str1 = "QA stands for Quality Assurance";
        System.out.println(countA(str1));
        ArrayList<Integer> pos = new ArrayList<>();
        pos.add(-23);
        pos.add(-4);
        pos.add(0);
        pos.add(2);
        pos.add(5);
        pos.add(90);
        pos.add(67);
        System.out.println(countPos(pos));
        ArrayList<Integer> duplic = new ArrayList<>();
        duplic.add(10);
        duplic.add(20);
        duplic.add(35);
        duplic.add(60);
        duplic.add(70);
        duplic.add(60);
        duplic.add(70);
        ArrayList<String> duplicate = new ArrayList<>();
        duplicate.add("java");
        duplicate.add("C#");
        duplicate.add("ruby");
        duplicate.add("JAVA");
        duplicate.add("ruby");
        duplicate.add("C#");
        duplicate.add("C++");
        System.out.println(duplicate);
        System.out.println(removeDuplicateElements(duplicate));

        String str5 = "    I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str5));

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));
        int[] arr3 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr4 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(arr3, arr4)));




    }
}
