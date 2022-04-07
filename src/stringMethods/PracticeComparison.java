package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class PracticeComparison {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter 2 strings
And store answers of user in different String variables
Finally, check if given 2 Strings are equal or not and print messages given below

    Test data 1:
    Java
    java

    Expected output 1:
    These strings are not equal

    Test data 2:
    Hello
    Hello

    Expected output 2:
    These strings are equal
 */


        Scanner scan = new Scanner(System.in);
        //WAY 1
        System.out.println("Pls enter 2 Strings: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        if (str1.equals(str2)) System.out.println("Are equal");
        else System.out.println("Not equal");

        //WAY 2

      String result = ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "Equal" : "Not equal";
        System.out.println(result);






    }
}
