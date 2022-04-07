package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter a number
        if number is dividable by 5 then finish the program but if number is not dividable by 5,
        keep asking user to enter a new number until user enters a number that is dividable by 5

        Example program:
        Program: Please enter a number
        User: 3
        Program: This number is not dividable by 5

        Program: Please enter a new number
        User: 10
        Program: This number is dividable by 5
         */

        System.out.println("Pls enter num: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num % 5 != 0){
            System.out.println("Pls enter a number: ");
            num = scan.nextInt();
        }
        System.out.println("End of the program");



       // if I will ask at least one more time, use DO WHILE
        // Do (some requirements), while (condition)
        int num2; // have to declare here
        int attempt = 1;
        do{
            if (attempt == 1) System.out.println("Pls enter num: ");
            else System.out.println("Pls enter a new number: ");
            num2 = scan.nextInt();
            if(num2 % 5 != 0) System.out.println("This number is not dividable by 5");
            attempt++;
        }while(num2 % 5 != 0);
        System.out.println("This num is dividable by 5 ");



    }
}
