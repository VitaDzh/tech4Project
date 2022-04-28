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

    SALIH's REcap
            //first way
        String[] sArr = s.trim().split(" "); // [I, , ,am, , , , , , learning, , , , ,  Java]
        StringBuilder sentence = new StringBuilder();
        for (String el : sArr) {
            if (!el.isEmpty()) sentence.append(el).append(" ");
        }
        return sentence.substring(0, sentence.length()-1);

            //second way
    //String str = “I   am      learning     Java      ”;
    StringBuilder sentence = new StringBuilder(); // I am
        for (int i = 0; i < s.length(); i++) {
        if (Character.isLetter(s.charAt(i))) sentence.append(s.charAt(i));
        else if (s.charAt(i) == ' ' && sentence.charAt(sentence.length() - 1) != ' ') sentence.append(" ");
    }
        return sentence.toString();
}
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
    --------------------------------------------------------------------------------
    */
    //SALIH's Recap
       public static int[] addd(int[] n1, int[] n2){

//        n1[0] += n2[0];
//        n1[1] += n2[1];
//        n1[2] += n2[2];
        for (int i = 0; i < Math.min(n1.length, n2.length); i++) {
            if (n1.length > n2.length) n1[i] += n2[i];
            else n2[i] += n1[i];
        }

        return n1.length > n2.length ? n1: n2;
    }
   // ----------------------------------------------------------------------------------

     public static int[] add(int[] arr1, int[] arr2){
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


        /*
        Write a method findClosestTo10() that takes an int[] array as an argument,
        and returns the closest element to 10 from given array
        Test data 1:
        int[] numbers = {10, -13, 5, 70, 15, 57};
        {-13, 5, 10, 15, 57, 70}
         */
    //SALIH's REcap
        public static int findClosestToo10(int[] arr){
            int closest = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++)
                if (arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(10 - closest)) // 5 <
                    closest = arr[i];
            return closest;
        }

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

    public static int countLetters(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)) count++;
        }
        return count;
    }

    public static int count(String str){
            int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) count++;
        } return count;
    }

    public static String noDigits(String str) {
        String noDig = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) noDig += str.charAt(i);
        }
        return noDig;
    }

        public static String noCons(String str){
            return str.replaceAll("[a-zA-Z&&[^AEIOUaeiou]]", "");
        }

    public static String noConsonants(String str){
        return str.replaceAll("[^aeiouAEIOU\\d\\W_]", "");
    }

    public static String[] removeDuplic(String[] str){
            ArrayList<String> uniques = new ArrayList<>();
        for (String s : str) {
            if(!uniques.contains(s)) uniques.add(s);
        } return (uniques.toArray(new String[0]));
    }










    public static void main(String[] args) {

        String[] strDig = {"aaa", "aa", "bbb", "bb", "b", "a"};
        System.out.println(Arrays.toString(removeDuplic(strDig)));


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

        System.out.println("-----------REMOVE EXTRA SPACES--------------");
        String str5 = "    I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str5));

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));
        int[] arr3 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr4 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(arr3, arr4)));
        int[] numbers = new int[10];
        numbers[0] = 100;
        numbers[1] = -34200;
        numbers[2] = 3040;
        numbers[3] = 400433;
        numbers[4] = 500;
        numbers[5] = -100;
        numbers[6] = -200;
        numbers[7] = 532;
        numbers[8] = 6584;
        numbers[9] = -945;
        System.out.println(findClosestTo10(numbers));




    }
}
