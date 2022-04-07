package homeworks;

import java.util.Scanner;

public class Homework08 {

    public static void main(String[] args) {

        System.out.println("TASK 1");
        int random = (int)(Math.random() * 51);
        System.out.println(random);
        if (random >=10 && random <= 25) System.out.println("TRUE");
        else System.out.println("FALSE");
        System.out.println();

        System.out.println("TASK 2"); // this is proper

        int random2 = (int)(Math.random() * 100 + 1);
       /*
        if(random2 <= 50) {System.out.println(random2 + " is in the 1st half"); // we do not need to put condition the number > 0
             if (random2 <= 25) System.out.println(random2 + " is in the 1st quarter");
            else System.out.println(random2 + " is in the 2nd quarter"); // we do not need to use else IF, because first statement is a range between 1 and 50
        }
        if(random2 >= 51 && random2 <= 100){
            System.out.println(random2 + " is in the 2nd half");
            if(random2 >=51 && random2 <= 75) System.out.println(random2 + " is in the 3d quarter");
            else System.out.println(random2 + " is in the 4th quarter"); // we do not need to use else IF, because first statement is a range between 1 and 50
        }
        System.out.println();

         */

        if(random2 <= 50){
            System.out.println(random2 + " is in the 1st half");

            if(random2 <= 25){
                System.out.println(random2 + " is in the 1st quarter");
            }
            else{
                System.out.println(random2 + " is in the 2nd quarter");
            }
        }
        else{
            System.out.println(random2 + " is in the 2nd half");
            if(random2 <= 75){
                System.out.println(random2 + " is in the 3d quarter");
            }
            else{
                System.out.println(random2 + " is in the 4th quarter");
            }
        }


        System.out.println("TASK 3");
        Scanner scan = new Scanner(System.in);

       /* I have not meet requirements!!!!
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(),
                num4 = scan.nextInt(), num5 = scan.nextInt();
        int multiNum = 5;
        System.out.println( (num1 * multiNum--) + " points");
        System.out.println( (num2 * multiNum--) + " points");
        System.out.println( (num3 * multiNum--) + " points");
        System.out.println( (num4 * multiNum--) + " points");
        System.out.println( (num5 * multiNum  ) + " points");
       */

        System.out.println("TASK 3 SOLVING WITH IF statement"); // <-- a proper way, cause If user enters any number
        // that is not in the range, then user will not get any points from that number
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(), n4 = scan.nextInt(), n5 = scan.nextInt();
        int points = 0;

        if (n1 >= 1 && n1<= 10) {
            points += n1 * 5;
        }
        if (n2 >= 1 && n2 <= 10){
            points += n2 * 4;
        }
        if (n3 >=1 && n3 <= 10){
            points += n3 * 4;
        }
        if (n4 >= 1 && n4 <= 10){
            points += n4 * 4;
        }
        if (n5 >= 1 && n5 <= 10){
            points += n5 * 5;
        }
        System.out.println(points);

    }
}
