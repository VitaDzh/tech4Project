package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        /*
         Write a Java program to ask user to enter a number and print
        all the odd numbers starting from 0 to given number by user
        (0 and given number is included)
         */

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i <= a; i++){
            if(!(i % 2 == 0)) {
                System.out.println(i);
            }
        }



    }
}
