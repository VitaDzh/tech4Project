package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExamole {
    public static void main(String[] args){

        /*
        Write a Java program that asks user to enter their age
        And print “It is your time to get retired!” if their age is more than or equal to 55
        1.Create a Scanner object
        2. Ask a question about their age
        3.Retrieve age
        4.Use if statement and proper action in curly braces
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your age: ");
        //int age = scan.nextInt();

        if(scan.nextInt() >= 55){
            System.out.println("It is your time to get retired");
        }else{
            System.out.println("Keep working");
        }




    }
}
