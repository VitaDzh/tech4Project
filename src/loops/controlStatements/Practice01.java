package loops.controlStatements;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {


        /*

        Write a Java program that ask user to enter 2 diff
        integers
        Print all the numbers between given 2 integers starting from
        biggest to smallest (given numbers are included)
        HOWEVER, do not print any number less than 10

        5 9 -> 9 8 7 6 5

        8 4 -> 8 7 6 5 4
        1.As user to enter 2 nums
        2.Store in int variables
        3.Compare numbers and find biggest and smallest
        4.Start the loop with below info: StartPoint:max num, endpoint: min num, update: decrement
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the num: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        /*
        for(int i = max; i >= min; i--){
            System.out.println(i);
            if(i < 10) break; // will stop the program when hit the 10, and will print evry number until 10. 9,8,7 will not be print
        }

         */
        if (max >= 10) {
            for (int i = max; i >= min; i--) {
                System.out.println(i);
                if (i == 10) break;
            }
        }


    }
}
