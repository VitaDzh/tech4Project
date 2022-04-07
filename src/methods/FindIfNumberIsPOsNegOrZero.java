package methods;
import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;
public class FindIfNumberIsPOsNegOrZero {
    public static void main(String[] args) {

        /*
        Ask user to enter any number
        Print "
         */
        int number = ScannerHelper.getNumberFromUser();
        if (MathHelper.isPositive(number)) System.out.println("positive");
           else if (MathHelper.isNegative(number)) System.out.println("negative");
            else MathHelper.isZero(number);

            String name = ScannerHelper.getANameFromUser();
            System.out.println(name + "'s age is " + number);

        }
    }

