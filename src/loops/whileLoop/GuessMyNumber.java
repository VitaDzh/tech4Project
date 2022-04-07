package loops.whileLoop;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        int myNum = ran.nextInt(10)+1;
        System.out.println(myNum);
        int usersNum = ScannerHelper.getNumberFromUser();

        while(usersNum != myNum){
            usersNum = ScannerHelper.getNumberFromUser();
        }
        System.out.println("Finaly you could find the number!");



        //WE USE WHILE LOOP, WHEN WE DO NOT KNOW HOW MANY ATTEMPTS WE NEED TO FIND THE NUMBER

        int myNumber = 7;
        System.out.println("The random number is = " + myNumber);
        Random random = new Random();
        int usersNumber = random.nextInt(10) + 1;

        int attempt = 1;

        while(usersNumber != myNumber){
            System.out.println("My random attempt number is = " + usersNumber);
            usersNumber = random.nextInt(10) + 1;
            attempt++;
        }

        System.out.println("Finally you could find the number!");
        System.out.println("You could find it after " + attempt + " times!!!");



    }
}


