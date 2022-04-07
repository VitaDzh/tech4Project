package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
          /*
        HOW TO FIND IF NAME STARTS WITH LOWERCASE OR UPPERCASE A
        1. name.startsWith("A") || name.startsWith("a")
        2. name.toLowerCase().startsWith("a")
        3. name.toUpperCase().startsWith("A")
        4. name.charAt(0) == 'A' || name.charAt(0) == 'a'
        5. name.charAt(0) == 65 || name.charAt(0) == 97
        6. name.toLowerCase().charAt(0) == 'a'
        7. name.toLowerCase().charAt(0) == 97
        8. name.toUpperCase().charAt(0) == 'A'
        9. name.toUpperCase().charAt(0) == 65
         */
        System.out.println("TASK 1");
        System.out.println("Please enter your name: ");
        String name = ScannerHelper.getAStringFromUser();
        System.out.println("The length of the name is = " + name.length() +
                "\nThe first character in the name is = " + name.charAt(0) +
                "\nThe last character in the name is = " + name.charAt(name.length()-1) +
                "\nThe first 3 characters in the name are = " + name.substring(0, 3) +
                "\nThe last 3 characters in the name are = " + name.substring(name.length() - 3));
        System.out.println((name.toUpperCase().startsWith("A")) ? "You are in the club" : "Sorry, you are not in the club");
        System.out.println();
        /* If user gives an empty String it will be error, because u did not cover this.
        SOLUTION to cover every possibility:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("The length of the name is = " + name.length());
        if(!name.isEmpty()){ //name.length() > 0
            System.out.println("The first character in the name is = " + name.charAt(0));
            System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        }
        if(name.length() >= 3){ // name.length() > 2
            System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
            System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        }
          if(!name.isEmpty()){
            if(name.toUpperCase().charAt(0) == 'A'){
                System.out.println("You are in the club");
            }
            else{
                System.out.println("Sorry, you are not in the club");
            }
        }
        else{
            System.out.println("The name is required!");
        }
         */

        /*

         */


        System.out.println("TASK 2");
        System.out.println("Please enter your full address: ");
        String address = ScannerHelper.getAStringFromUser();

        if(address.toUpperCase().contains("CHICAGO")) {
            System.out.println("You are in the club");
        }else if(address.toLowerCase().contains("des plaines")){
            System.out.println("You are welcome to join to the club");
            }else System.out.println("Sorry, you will never be in the club");
        System.out.println();

        /*
         System.out.println("Please enter the address");
        String address = scanner.nextLine();

        if(address.isEmpty()){
            System.out.println("The address is required!");
        }
        else{
            if(address.toLowerCase().contains("chicago")){
                System.out.println("You are in the club");
            }
            else if(address.toUpperCase().contains("DES PLAINES")){
                System.out.println("You are welcome to join the club");
            }
            else{
                System.out.println("Sorry, you will never be in the club");
            }
        }
         */

        System.out.println("TASK 3");
        System.out.println("Please enter your colors: ");

        String colors = ScannerHelper.getAStringFromUser().toLowerCase();
        if(!colors.isEmpty()){
            //Check if it has green or red or both
            if(colors.contains("red") || colors.contains("green")){
                System.out.println("Green and red are in the list");
            }
            else if(!colors.contains("red") || !colors.contains("green")){
                System.out.println("Green and red are not in the list");
            }
            else if(colors.contains("green")){
                System.out.println("Green is in the list");
            }
            else System.out.println("Red is in the list");
        }
/*
        if(color.toLowerCase().contains("green") && color.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if(color.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if(color.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

         */


        System.out.println("TASK 4");
        String str = "     Java is fun    ";
        String TrimmedAndLower = str.trim().toLowerCase();
        String _1stWord = TrimmedAndLower.substring(0, 4);
        String _2ndWord = TrimmedAndLower.substring(5, 7);
        String _3ndWord = TrimmedAndLower.substring(8);
        System.out.println("The first word in the str is = " + _1stWord +
                "\nThe second word in the str is = " + _2ndWord +
                "\nThe third word in the str is = " +_3ndWord);

        /*
        String str = "   Java is FUN   ";
String newStr = str.trim().toLowerCase();
System.out.println("The first word in the str is = " + newStr.substring(0, newStr.indexOf(' ')));
System.out.println("The second word in the str is = " + newStr.substring(newStr.indexOf(' ') + 1, newStr.lastIndexOf(' ')));
System.out.println("The third word in the str is = " + newStr.substring(newStr.lastIndexOf(' ') + 1));
         */


    }
}
