package loops.doWhileLoops;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter a number
        if number is more than or equal to 10, then finish the program but
        if number is less than 10, keep asking user to enter a new number
        until user enters a number that is more than or equal to 10

        Example program:
        Program: Please enter a number
        User: 3
        Program: This number is not more than or equal to 10

        Program: Please enter a new number
        User: 8
        Program: This number is not more than or equal to 10

        Program: Please enter a new number
        User: 15
        Program: This number is more than or equal to 10
 */
        System.out.println("Pls enter num: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num < 10){
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Pls enter a number: ");
            num = scan.nextInt();
            }
        System.out.println("This num is more than 10 ");



        //DO WHILE
        int num2 = scan.nextInt();
        do{
            System.out.println("Pls enter num: ");
             num2 = scan.nextInt();
        }while(num2 < 10);
        System.out.println("Num more than 10");






    }
}
