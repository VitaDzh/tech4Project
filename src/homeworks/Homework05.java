package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args){

        System.out.println("TASK 1");
        /*
        -Write a Java program that asks user to enter 3 numbers
        - int values and find the Max and Min numbers by using Math.max() and Math.min() methods
         */

        Scanner homework05 = new Scanner(System.in);
        System.out.println("Pls enter 3 numbers: ");
        int n1 = homework05.nextInt();
        int n2 = homework05.nextInt();
        int n3 = homework05.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(n1, n2), n3));
        System.out.println("Min value = " + Math.min(Math.min(n1, n2), n3));

        System.out.println("TASK 2");
        /*
        -Write a Java program that asks user to enter 5 numbers
        - int values and find the Max and Min number by using Math.max() and Math.min() methods
         */
        System.out.println("Pls enter 5 numbers: ");
        int num1 = homework05.nextInt();
        int num2 = homework05.nextInt();
        int num3 = homework05.nextInt();
        int num4 = homework05.nextInt();
        int num5 = homework05.nextInt();

        System.out.println("Max value = " + (Math.max(Math.max ((Math.max(num1, num2)), (Math.max(num3, num4))), num5)));
        System.out.println("Min value = " + (Math.min(Math.min ((Math.min(num1, num2)), (Math.min(num3, num4))), num5)));

        System.out.println("TASK 3");
        /*
        -Write a Java program that asks user to enter 2 numbers
        - int values and find the absolute difference between the
        two numbers by using Math.abs() method
         */
        System.out.println("Pls enter 2 numbers: ");
        int number01 = homework05.nextInt();
        int number02 = homework05.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(number01 - number02));

        System.out.println("TASK 4");
        /*
        -Write a Java program that generates 3 random numbers between 50 and 100 both included.
        Use Math.random() First print the numbers
        Then, find the sum of these numbers
         */
        // create number between 103 - 346
        //get the difference --> 346-103 = 243 and add +1
        // multiply it by 243 +1 = 244
        // add the starting point to the equation
        // Math.random() * (end point - start point + 1) + start point --> included

        int random50And100Included1 = (int) (Math.random() * 51) + 50;
        System.out.println("Number 1 = " + random50And100Included1);

        int random50And100Included2 = (int) (Math.random() * 51) + 50;
        System.out.println("Number 2 = " + random50And100Included2);

        int random50And100Included3 = (int) (Math.random() * 51) + 50;
        System.out.println("Number 3 = " + random50And100Included3);

        System.out.println("The sum of numbers is = " + (random50And100Included1 + random50And100Included2 + random50And100Included3));


        System.out.println("TASK 5");
        /*
        Assume Alex has $125, and Mike has $220.
        And Alex is going to give $25.5 to Mike.
        Then, How much money will Alex and Mike will have after that?
         */

        double alexsMoney = 125;
        double mikesMoney = 220;
        System.out.println("Alex's money: $" + (alexsMoney - 25.5) + "\nMike's money: $" + (mikesMoney + 25.5));

        System.out.println("TASK 6");

        /*
        Assume David is going to save  $390 to buy a bicycle.
        David can save only $15.60 per day.
        Write a program to find how many days later, David can save $390 and buy the bicycle.
         */
        double expectedSavings = 390;
        double savingsPerDay = 15.6;

        System.out.println((int)(expectedSavings / savingsPerDay));

    }
}
