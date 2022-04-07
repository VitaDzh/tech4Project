package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        /*
        Write a program asks user to put number and checks if the
        number is between 0 and 100 (inclusive)
        if it is true print out "It is"
        if it is not "it is not"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter num: ");
       int num = scan.nextInt();
       // And does not like false, OR likes true
       // boolean isNumBiggerThan0 = num >= 0;
       // boolean isNumSmallerThan0 = num >= 100;
        //boolean inBetween = isNumBiggerThan0 && isNumSmallerThan0; //num >=0 && num <= 100;

        if(num >=0 && num <= 100){ // num >=0 && num <= 100
            System.out.println("it is");
        } else{
            System.out.println("it is not");
        }

    }
}
