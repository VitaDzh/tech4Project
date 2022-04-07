package stringMethods;

import utilities.ScannerHelper;

import java.util.Locale;

public class _12_contains {
    public static void main(String[] args) {

        /*
        12.	contains()
-	used ti find out if a String contains another string or character
-	non-static
-	return Boolean
-	it takes a String argument
         */

        String s = "Good Morning!";
        System.out.println(s.contains("Good")); // true
        System.out.println("");// true

        System.out.println("Pls enter the address: ");
        String address = ScannerHelper.getAStringFromUser();
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");



    }
}
