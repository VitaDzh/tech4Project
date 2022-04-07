package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class MathGradeExample {

    public static void main(String[] args) {

        /*

Write a program that asks David what his balance. If David's balance is greater
than or equal to $600.0, then print message "Awesome! You have enough money!".
If David's balance is less than $600.0, then print message "Sorry!  You are poor!".

EXAMPLE PROGRAM 1
Program: Hey David! Please enter your balance?
User: 600.0

Program: Awesome! You have enough money!

EXAMPLE PROGRAM 2
Program: Hey David! Please enter your balance?
User: 59

Program: Sorry! You are poor!
         */
Scanner bal = new Scanner(System.in);
        System.out.println("Pls enter your name: ");
        String fullName = bal.nextLine();
        System.out.println("Hey" + fullName + "! Pls enter your balance: ");
        double balance = bal.nextDouble();//Double.parseDouble(bal.next()) if we want to convert to String

        if(balance >= 600){
            System.out.println("Awesome!");
        } else {
            System.out.println("Sorry man");
        }




    }
}
