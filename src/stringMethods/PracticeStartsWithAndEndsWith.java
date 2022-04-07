package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {
        /*

         */
        System.out.println("Enter your name: ");
        String name = ScannerHelper.getAStringFromUser();
        if( name.startsWith("A") || name.startsWith("a")) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");


         // SECOND WAY --> System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");
         // THIRD WAY -BEST WAY --> if(name.toUpperCase().startsWith("A")); // u can convert everything to Upper and ask only for upperc
        // FORTH WAY --> if(name.charAt(0) == 'A' || name.charAt(0) == 'a')





    }
}
