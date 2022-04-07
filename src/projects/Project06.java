package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        /*
    Write a program that asks user to enter a sentence as a String, and count
    how many words that sentence has, and print it with given below message.
    NOTE: Write a program that handles any String
    NOTE: First check if the given sentence has 2 words at least.
    If not, then just print “This sentence does not have multiple words”.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter a sentence: ");
        String sentance = scan.nextLine().trim();
        int totalSpaces = 0;
        if (!sentance.contains(" ")) {
            System.out.println("This sentence does not have multiple words");
        } else {
            for (int i = 0; i <= sentance.length() - 1; i++) {
                if (sentance.charAt(i) == ' ') {
                    totalSpaces++;
                }
            }
            System.out.println("This sentence has " + (totalSpaces + 1) + " words.");
        }
        System.out.println();

        //CONVERT TO ARRAY's WAY
        System.out.println("TASK 2");
        System.out.println("Pls enter a sentence: ");
        String sentence2 = scan.nextLine().trim();
        String[] howManyWords = sentence2.split(" ");
        System.out.println(howManyWords.length > 1 ? "This sentence has " + howManyWords.length + " words." : "This sentence does not have multiple words");
        System.out.println();


        System.out.println("TASK 2");
        /*
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        •	EX/ kayak, civic, madam
        NOTE: Write a program that handles any String
        NOTE: First check if the given String has at least 1 character, if the String does not have at
        least one character, then print message “This word does not have 1 or more characters”
         */
        System.out.println("Please enter a word: ");
        String word = scan.nextLine();
        String reversedWord = "";
        if (word.length() < 1) {
            System.out.println("This word does not have 1 or more characters");
        } else {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
                }
            if (word.equals(reversedWord)) {
                System.out.println("This word is palindrome");
            } else System.out.println("This word is not palindrome");
        }
        System.out.println();

        System.out.println("TASK 3");
        /*
        Write a program that asks user to enter a sentence as a String and count how many a or
        A letters that sentence has and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 1 character at least.
        If not, then just print “This sentence does not have any characters”.
         */
        System.out.println("Pls enter a sentance: ");
        String s = scan.nextLine().toLowerCase();
        int counter = 0;
        if(s.length() < 1){
            System.out.println("This sentence does not have any characters");
        } else{
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
            counter++;
            }
        }
            System.out.println("This sentence has " +  counter +  " a or A letters.");
        }
        System.out.println();


        System.out.println("TASK 4");
        /*
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided by 2,
        “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.
         */
        System.out.println("Pls enter a positive number: ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("FooBar");
            }else if(i % 3 == 0){
                System.out.println("Bar");
            }else if(i % 2 == 0){
                System.out.println("Foo");
            }else System.out.println(i);
        }


    }
}



