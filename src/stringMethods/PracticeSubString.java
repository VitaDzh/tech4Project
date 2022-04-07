package stringMethods;

import utilities.ScannerHelper;

public class PracticeSubString {
    public static void main(String[] args) {

        /*
Write a program that asks user to enter a sentence (multiple words)
Find and print the first and the last words from the given sentence with below messages

Test data1:
I like Java

Expected output:
The first word is = I
The last word is = Java

Test data2:
Today is Sunday

Expected output:
The first word is = Today
The last word is = Sunday
 */
        System.out.println("Pls enter a sentence: ");
       String sentence = ScannerHelper.getAStringFromUser();
        /*we need a first space and last space. Everythinf before the first space is my first word
        Everything after the last space is my last word
        First word --> 0 - indexOf(' ');
        Last word --> LAstIndexOf(' ') + 1 to the end
         */
       // String first = sentence.substring(0, sentence.indexOf(' '));
       // String last = sentence.substring(sentence.lastIndexOf(' ') + 1); // +1 means next to space

        System.out.println("First " + sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("Last " + sentence.substring(sentence.lastIndexOf( ' ') + 1));





    }
}
