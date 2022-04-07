package operator.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        /*Write a Java program that asks user to enter their balance
        and one day transactions. Subtract each transaction from balance
        and return new balance using shorthand operator
        1.Create a Scanner class
        2. Assigne variables and print them
         */

        Scanner transactions = new Scanner(System.in);

        System.out.println("Pls enter your balance: ");
        double balance = transactions.nextDouble();

        System.out.println("Enter your first transaction: ");
        double firstTrans = transactions.nextDouble();
        balance -= firstTrans;
        System.out.println("Balance after first transaction = $" + balance);

        System.out.println("Enter your second transaction: " );
        double secondTrans = transactions.nextDouble();
        balance -= secondTrans;
        System.out.println("Balance after second transaction = $" + balance);

        System.out.println("Enter your third transaction: ");
        double thirdTrans = transactions.nextDouble();
        balance -= thirdTrans;
        System.out.println("Balance after second transaction = $" + balance );




    }
}
