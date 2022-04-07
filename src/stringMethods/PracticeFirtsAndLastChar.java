package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirtsAndLastChar {
    public static void main(String[] args) {
          /*
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "

    Kaly
    charAt(0)
    charAt(3) -> name.length()-1

    Taylor
    charAt(0)
    charAt(5) -> name.length()-1

    Guluzar
    charAt(5) -> name.length()-1

    NOTE:
    First character of String is always -> str.charAt(0)
    Last character of String is always -> str.charAt(str.length()-1)
     */
        System.out.println("Pls enter your name: ");
        String s = ScannerHelper.getAStringFromUser();
        System.out.println("First character in the name is = " + s.charAt(0) +
                "\nLast character in the name is = " + s.charAt(s.length() - 1)); // it is not method inside of method. we put s.length as an int - 1



    }
}
