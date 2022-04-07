package stringMethods;

import utilities.ScannerHelper;

public class PracticeLength {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter their favorite book name and quote and
store answers of user in different Strings
Finally, print the length of those Strings with proper message
         */
        System.out.println("Your fav book?");
        String s1 = ScannerHelper.getAStringFromUser();
        System.out.println("Your quote?");
        String s2 = ScannerHelper.getAStringFromUser();
        System.out.println("The length of  \"" + s1 + "\" " + s1.length() + "\nThe length for \"" + s2 + "\" " + s2.length());





    }
}
