package ifElseStatements.ifElseIFStatement;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Write a program that generates a random number between -10 and 10(inclusive)
        and if the number is positive print out "number is POSITIVE!",
        if the number is negative print out "number is NEGATIVE!",
        and if the number is 0 print out "number is 0".
        input:
        6                            -5                 0
        output:
        number is POSITIVE!          is NEGATIVE!        number is 0
        1. Create a random number
        2. Create if statements for checking 3 different possibilities
        3. Do the proper action for every single possibility
         */

        int random = (int)(Math.random() *21) -10;
        System.out.println(random);
        if(random > 0){
            System.out.println("number is POSITIVE");
        }else if(random == 0){
            System.out.println("number is ZERO");
        } else { // THE REST IS WITHOUT IF
            System.out.println("number is NEGATIVE");
        }
        //WE CAN USE IF ELSE WHEN POSSIBILITIES ARE LINKED



    }
}
