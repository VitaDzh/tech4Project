package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    /*Task 1
     -Create a method called hasLowerCase()
     -This method will take a String argument, and it will return boolean
     true if there is lowercase letter and false if it doesn’t.
     */
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase((str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    /*Task 2
   -Create a method called noZero()
   -This method will take one Integer ArrayList argument and it will return an
   ArrayList with all zeros removed from the original Integer ArrayList.
   NOTE: Assume that ArrayList size will be at least 1.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> arrayList) {
        ArrayList<Integer> forRemoving = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer == 0) forRemoving.add((integer));
        }
        arrayList.removeAll(forRemoving);
        return arrayList;
    }

    /*Task 3
    -Create a method called numberAndSquare()
    -This method will take an int array argument and it will
    return a multidimensional array with all numbers squared.
    NOTE: Assume that array size is at least 1.
    e(new int[]{2, 1, 3, 2})));
    arr[row][column]
    */
    public static int[][] numberAndSquare(int[] arr){
        int[][] squared = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
                squared[i][0] += arr[i];
                squared[i][1] += arr[i]*arr[i];
            }
        return squared;
    }


    /*Task 4
    -Create a method called containsValue()
    -This method will take a String array and a String argument, and it will return a boolean.
    Search the variable inside of the array and return true if it exists in the array.
    If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
     */
    public static boolean containsValue(String[] arr, String str) {
        boolean exist = false;
        for (String s : arr) {
            if (s.equals("str")) {
                return true;
            }
        }
        return exist;
    }

    /*Task 5
    -Create a method called reverseSentence()
    -This method will take a String argument and it will return a String with changing the place of every word.
    All words should be in reverse order. Make sure that there are two words inside the sentence at least.
 If there is no two words return “There is not enough words!”.
    NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
     */
    public static String reverseSentence(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() > 1) {
            for (String word : str.split(" ")) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    result.append(word.charAt(i));
                }
                result.append(" ");
            }
            return result.toString().trim();
        }
        return "There is not enough words!";
    }

    /*Task 6
    -Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will return a String without the special
    characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
     */
    public static String removeStringSpecialsDigits(String str) {
        return str.replaceAll("[^sa-zA-Z]", "");
    }

    public static String removeStringSpecialsDigits2(String str) {
        String clearStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)) || Character.isLetterOrDigit(str.charAt(i)))
                clearStr += str.charAt(i) + "";
        }
        return clearStr;
    }

    /*Task 7
    -Create a method called removeArraySpecialsDigits()
    -This method will take a String array as argument, and it will return a String array without
    the special characters or digits from the elements.
    NOTE: Assume that array size is at least 1.

     */

    public static String[] removeArraySpecialsDigits(String[] arr) {
        String[] clearedd = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
             String word = arr[i].replaceAll("[^sa-zA-Z]", "");
             clearedd[i] = word;
        }
        return clearedd;
    }


    /*Task 8
    -Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2 ){
        ArrayList<String> commonWords = new ArrayList<>();
        for (String value : arr1) {
            for (String s : arr2) {
                if (value.equals(s) && !commonWords.contains(s)) commonWords.add(s);
            }
        }
        return commonWords;
    }

    /*Task 9
    -Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X
    removed from elements.
    If the element itself equals to x or X or contains only x letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.
     */

    public static ArrayList<String> noXInVariables2(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).toLowerCase().contains("x")){
                    arrayList.set(i, arrayList.get(i).replaceAll("[xX]", ""));
                }
            }
        arrayList.removeIf(String::isEmpty);
        return arrayList;
    }

     






        public static void main(String[] args) {
            System.out.println("TASK 1 " + hasLowerCase(""));
            System.out.println("TASK 1 " + hasLowerCase("JAVA"));
            System.out.println("TASK 1 " + hasLowerCase("123$"));
            System.out.println("TASK 1 " + hasLowerCase("hello"));
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            System.out.println("Task 2 " + noZero(arrayList));
            System.out.println("Task 3 " + Arrays.deepToString(numberAndSquare(new int[]{ 1, 2, 3})));
            System.out.println("Task 4 " + containsValue(new String[]{"abc", "foo", "java"}, "hello "));
            System.out.println("Task 4 " + containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123 "));
            System.out.println("Task 4 " + containsValue(new String[]{"abc", "def", "123"}, "Abc "));
            System.out.println("Task 5 " + reverseSentence("Hello"));
            System.out.println("Task 5 " + reverseSentence("Java is fun"));
            System.out.println("Task 5 " + reverseSentence("This is a sentence"));
            System.out.println("Task 6 " + removeStringSpecialsDigits("123Java #$%is fun"));
            System.out.println("Task 6 " + removeStringSpecialsDigits("Selenium"));
            System.out.println("Task 6 " + removeStringSpecialsDigits("Selenium 123#$%Cypress"));
            System.out.println("Task 6 " + removeStringSpecialsDigits2("123Java #$%is fun"));
            System.out.println("Task 6 " + removeStringSpecialsDigits2("Selenium"));
            System.out.println("Task 6 " + removeStringSpecialsDigits2("Selenium 123#$%Cypress"));
            System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
            System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
            System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%&%Cypress"})));
           // System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits2(new String[]{"123Java", "#$%is", "fun"})));
            //System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits2(new String[]{"Selenium", "123$%", "###"})));
            //System.out.println("Task 7 " + Arrays.toString(removeArraySpecialsDigits2(new String[]{"Selenium", "123$%&%Cypress"})));
            ArrayList<String> strArr = new ArrayList<>();
            strArr.add("Python");
            strArr.add("C#");
            strArr.add("C++");
            ArrayList<String> str = new ArrayList<>();
            str.add("JavaXx");
            str.add("Cxxx#xxxx");
            str.add("xx");
            str.add("X");
            System.out.println("Task 8 " + removeAndReturnCommons(strArr, str));
            System.out.println("Task 9 " + noXInVariables2(str));
    }




}













