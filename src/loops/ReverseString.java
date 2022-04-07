package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

        /*
        Write a program that reads a name from user
        Reverse the name and print it back
        Test data: Kaly
        Expected output: ylaK
        IF WE NEED THE RESULT WE NEED DEFINATELY PUT IT INTO A CONTAINER
         */
        System.out.println("Enter your name: ");
        String name = ScannerHelper.getAStringFromUser();
        for (int i = name.length() - 1; i >= 0; i--)
            System.out.print(name.charAt(i));

        // REversing with method
        String name1 = "kaly";
        String reversed = "";
        for (int i = name1.length() - 1; i >= 0; i--) {
            reversed = name1.charAt(i) + "";
            System.out.println(reversed);
        }

         /*
        Write a program that reads a name from user
        Reverse the name and print it back
        Test data: Kaly
        Expected output: The reversed name = ylaK
         */
        System.out.println("\nEnter your name: ");
        String name2 = ScannerHelper.getAStringFromUser();

        String message = "";
        for (int i = name2.length() - 1; i >= 0; i--) {
            message += name.charAt(i); // it is reassignment
        }
        System.out.println("Enter your name: " + message);


        // Adding and assigning at once
        String name3 = "Alex"; // want to make it Alexander
        name3 += "ander";
        System.out.println(name3);

        // Adding and assigning one by one
        String name4 = "Alex"; // want to make it Alexander
        name4 += "an";
        name4 += "d";
        name4 += "e";
        name4 += "r";
        System.out.println(name4);








    }
}