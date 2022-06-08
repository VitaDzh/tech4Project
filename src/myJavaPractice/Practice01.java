package myJavaPractice;

import homeworks.ExtraPractice;
import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

            /*
            Assume that you are given a String as below;
    String str = ”SDLC is step by step procedure to create an application”;
    Write a program to find length of given String and the indexes of “SDLC”
    and “application” words
             */

        String str = "SDLC is step by step procedure to create an application";
        System.out.println("The length " + str.length() + "\nThe index of SDLS is " + str.indexOf("SDLC") +
                "\nThe index of application " + str.indexOf("application"));

       /*
                Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;

        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
        */
        String str2 = "   I know how to code with Python   ";
        System.out.println(str2.replace("Python", "JAVA").toUpperCase().trim());

        /*
                Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println("First char is " + str3.charAt(0) + "\nLast char is " + str3.charAt(str3.length()-1));

/*
        Requirement:
        Write a program that asks user to enter their favorite color.
                Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
 */
        System.out.println("Color: ");
        String color =  ScannerHelper.getAStringFromUser();
        System.out.println("First character is " + color.trim().charAt(0) +
                "\nLast character is " + color.trim().charAt(color.length()-1) +
                "\nFirst 3 chars are " + color.trim().substring(0,3) +
                "\nLast 3 chars are " + color.substring(color.length()-3)); //orange

        /*
                    Write a program that asks user to enter a full sentence
            Then, convert all sentence to lower case and print the first and last words in the given sentence
            Test data:
            JavA is an object-oriented programming LanguAGE
            Expected output:
            1st word is = java
            2nd word is = language
         */
        String sentence = ScannerHelper.getAStringFromUser();
        System.out.println( "1st word is = " + sentence.substring(0, sentence.indexOf(' ')).toLowerCase()
                + "\nLast word is = " + sentence.substring(sentence.lastIndexOf(' ')+1).toLowerCase());

        /*

         */
        System.out.println("Pls enter a sentance");
        String sent = ScannerHelper.getAStringFromUser();
      /*  if(sent.contains("$"))
            System.out.println("It is contains $ and it is = " + sent.indexOf('$'));
        else System.out.println("It does not contains $");

       */
        System.out.println(sent.contains("$") ? "It is contains $ and it is = " + sent.indexOf('$') : "It does not contains $");


String fn = ExtraPractice.fullNAme("Vita Yuzko");
        System.out.println(fn);



    }
}
