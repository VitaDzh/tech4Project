package loops.forLoop;

import java.util.Random;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {

        /*
                Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included),
                Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.
        Test data:
        int randomNumber1 = 12;
        int randomNumber2 = 4;
        Expected output:
        12 – 11 – 9 – 8 – 7 – 6 - 4
         */
        Random random = new Random(); // if i want from 10 to 30
        int num1 = random.nextInt(26); // random.nextInt(31) + 10
        int num2 = random.nextInt(26); // random.nextInt(31) + 10
        System.out.println(num1 + "\n" + num2);

        System.out.println("\nNumbers printed in ascending order: ");
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 5 != 0) System.out.println(i);
            }
        } else                                        // is not a best way. because looks like loops are dublicated!!!
            for (int i = num2; i < num1; i++) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }

          //System.out.println(Integer.MIN_VALUE);
          //System.out.println(Integer.MAX_VALUE);








    }
}
