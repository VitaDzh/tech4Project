package homeworks;

public class Homework10 {
    public static void main(String[] args) {
/*
        Requirement:
        Assume that you are given a String of any length. First check if it has at least
        length of 1. If the length is zero, then print “Length is zero”
         If it has length more than zero, then find:
        -The length of the String
        -First char in the String
        -Last char in the String
        -Check if the String contains any vowel letters
            -if it has any vowel, then print “This String has vowel”
            -Else, print “This String does not have vowel”
            Vowels = a, e, i, u, o
 */
        System.out.println("TASK 1");
        String s = "".toLowerCase();
        if (s.length() >= 1) {
            System.out.println("Length is = " + s.length());
            System.out.println("First char is = " + s.charAt(0));
            System.out.println("Last char is = " + s.charAt(s.length() - 1));

            if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("u") || s.contains("o"))
                System.out.println("This String has vowel");
            else System.out.println("This String does not have vowel");
        } else System.out.println("Length is zero");
        System.out.println();

        System.out.println("TASK 2");
        /*
    Assume that you are given a String of any length. First check if it has at least length of 3.
    If the length is less than 3, then print “Length is less than 3”
    If it has length more than or equal to 3, then find the middle character for the odd length,
    middle 2 characters for the even length.
         */
        String s2 = "toyot";
        if (s2.length() >= 3) {
            if (s2.length() % 2 == 0){
                System.out.println("" + s2.charAt(s2.length() / 2 - 1) + s2.charAt(s2.length() / 2));
        } else System.out.println(s2.charAt(s2.length() / 2));
    } else System.out.println("Length less than 3");
        System.out.println();

        System.out.println("TASK 3");
        /*
     Write a program that divides the given String. Length of given will be at least 4.
     if length of the String is not at least 4, then print “INVALID INPUT”
    If the length is 4 or more, then
    -print the first two characters
    -print the last two characters
    -print all the middle characters other than first and last 2 characters
         */

        String s3 = "Python";
        if(s3.length() < 4) {
            System.out.println("INVALID INPUT");
        }
        else{
            System.out.println("First 2 characters are = " + s3.substring(0, 2) +
                    "\nLast two characters are = " + s3.substring(s3.length()-2) +
                    "\nThe other characters are = " + s3.substring(2, s3.length()-2));
        }
        System.out.println();



        System.out.println("TASK 4");
        /*
        Assume that you are given a String of any length. First check if it has at least length of 2.
        If the length is less than 2, then print “Length is less than 2”
        If it has length more than or equal to 2, then if first 2 and last 2 characters of the given
        String are same. If first 2 and last characters are same, then print true. Otherwise, print false
         */
        String s4 = "xyzaxy";
        if(s4.length() >= 2) {
            if (s4.substring(0, 1).equals(s4.substring(s4.length() - 2, s4.length()-1)))
                System.out.println("True");
            else System.out.println("False");
        } else System.out.println("Length is less than 2");
        System.out.println();

        System.out.println("TASK 5");
        /*
        Write a program that gets rid of first and last characters of given two String values.
        After getting rid of first and last characters, add these two String values to each other
        and print the result. If one of the String values has length that is less than 2,
        then print “INVALID INPUT”
         */
        String a = "1234";
        String b = "Green";

        if(a.length() < 2 || b.length() < 2){
            System.out.println("INVALID INPUT");
        }
        else System.out.println("" + a.substring(1, a.length()-1) + b.substring(1, b.length()-1));
        System.out.println();

        System.out.println("TASK 6");
        /*
        -Write a program that checks if a given String that has length of 4 at least and starts and ends with xx.
        -If the length of String is less than 4, then print “INVALID INPUT”
        -If given String starts and ends with xx, then print true.
        -Otherwise, print false
         */
        String s5 = "red";
        if(s5.length() < 4) System.out.println("INVALID INPUT");
        else if(s5.startsWith("xx") && s5.endsWith("xx")) {
            System.out.println("true");
        }



    }

}









