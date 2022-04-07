package ifElseStatements.switchStatements;
import java.util.Scanner;
public class WorkCode {
    public static void main(String[] args) {
        /*
       1 Monday --> Blue
       2 Tuesday --> Red
       3 Wednesday --> Purple
       4 Thursday --> Yellow
       5 Friday --> Orange
       Write a program that asks user to enter which day it is(number from 1 to 5)?
       based on the answer print what color will be selected
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter which day it is 1 to 5: ");
        int day = scan.nextInt();

        //FIRST WAY using if-else-if statements
        if(day == 1) System.out.println("Blue");
        else if (day == 2)System.out.println("Red");
        else if(day == 3)System.out.println("Purple");
        else if (day == 4)System.out.println("Yellow");
        else if (day == 5)System.out.println("Orange");  // if u will finish code with else instead of else if, when user put 10 it will show orange,NOT RIGHT
        else if (day == 6 || day == 7)System.out.println("It is weekend");
        else System.out.println("Error: no day");

        System.out.println("End of the program");

        //SECOND WAY - switch cases. When u have a few cases
        // can be used with String, int, byte, short, char, Enum
        //The value of a case must be the same data type as the variable in the switch
        switch (day) { // it is not condition it can be any argument
            case 1:
                System.out.println("Blue");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Purple");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Orange");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break; //optional
            default: // optional
                System.out.println("Error: no day"); // do not need to use break in the end, cause it represents end of the program

        }




    }
}
