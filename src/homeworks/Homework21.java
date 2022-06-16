package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework21 {
    /*
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print numbers starting from
    1 to given argument. BUT, it will print “Fizz” for the numbers divided by 3, “Buzz”
    for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.
     */
    public static void fizzBuzz1(int number){
        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /*
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return a String.
    BUT it will return “Fizz” if the given number is divided by 3, “Buzz” if the number
    is divided by 5, and “FizzBuzz” if the number is divided both by 3 and 5. Otherwise,
    it will return number itself.
     */
    public static String fizzBuzz2(int number){
        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        else if(number % 3 == 0) return "Fizz";
        else if(number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }


    /*
     Requirement:
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return an int which is the sum
    of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String, return 0.


    public static int findSumNumbers(String str) { // ab110c50d5
        String str2 = ""; int sum = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))){
                if (Character.isDigit(str.charAt(i+1))) str2 += str.charAt(i)+"";
                else if(!Character.isDigit(str.charAt(i+1))) str2 += str.charAt(i)+" ";
            }
        }
        if(Character.isDigit(str.charAt(str.length()-1))) str2 += str.charAt(str.length()-1) +" ";
        String[] arr = str2.split(" ");
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

     */

    public static int findSumNumberss(String s){ // Kaly's
        int sum = 0; 
        String temp = "0";
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }return sum + Integer.parseInt(temp);
    }

    public static int findSumOfNumbers(String str){ //Melda's
        int sum = 0;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if(!string.isEmpty()) sum += Integer.parseInt(string);
        }
        return sum;
    }


    /*
    Requirement:
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will return an int which is the number presented in the String.
    NOTE: If there are no numbers represented in the String, return 0.
    */

    public static int findBiggestNumber(String str){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }

    /*
    -Create a method called countSequenceOfCharacters()
    -This method will take a String argument and it will return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
    Test Data 3: “abbcca”
    Expected Result 3: “1a2b2ca”
     */
    public static String countSequenceOfCharacters(String str) {
        String str2 = ""; // abcacB
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!str2.contains(str.charAt(i) + "")) {
                str2 += str.charAt(i);
                str2 += count;
                count = 1;
            }
        }
        return str2;
    }





    public static void main(String[] args) {
        String str = "ab110c50d5";
        int number = 20;
        System.out.println("TASK 1");
        fizzBuzz1(number);
        System.out.println("TASK 2--> " + fizzBuzz2(number));
        System.out.println("TASK 3--> " + findSumOfNumbers(str));
        System.out.println("TASK 3 KAly;s--> " + findSumNumberss(str));
        System.out.println("TASK 4--> " + findBiggestNumber(str));
        System.out.println("TASK 5--> " + countSequenceOfCharacters(str));

    }





}
