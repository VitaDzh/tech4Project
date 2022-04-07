package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("TASK 1");

        int randomNum1 = (int) (Math.random() * 11), randomNum2 = (int) (Math.random() * 11),
                randomNum3 = (int) (Math.random() * 11), randomNum4 = (int) (Math.random() * 11);
        int i = 1;
        int five = 5;
        System.out.println(
                "Number" + i++ + " = " + randomNum1 +
                        "Number" + i++ + " = " + randomNum2 +
                        "Number" + i++ + " = " + randomNum3 +
                        "Number" + i + " = " + randomNum4
                        //"Number 1 = " + randomNum1 +
                        // "\nNumber 2 = " + randomNum2 +
                        // "\nNumber 3 = " + randomNum3
                        // + "\nNumber 4 = " + randomNum4

                        + "\nAbsolute difference of " + randomNum1 + " with " + five + " is = " + Math.abs(randomNum1 - five)
                        + "\nAbsolute difference of " + randomNum2 + " with " + five + " is = " + Math.abs(randomNum2 - five)
                        + "\nAbsolute difference of " + randomNum3 + " with" + five + " is = " + Math.abs(randomNum3 - five)
                        + "\nAbsolute difference of " + randomNum4 + " with" + five + " is = " + Math.abs(randomNum4 - five)
                        + "\nGreatest number is = " + Math.max(Math.max(randomNum1, randomNum2), Math.max(randomNum3, randomNum4))
                        + "\nSmallest number is = " + Math.min(Math.min(randomNum1, randomNum2), Math.min(randomNum3, randomNum4)));
        System.out.println("End of the program");
        System.out.println();

        System.out.println("TASK 2");

        int num1 = (int) (Math.random() * 101 - 50), num2 = (int) (Math.random() * 101 - 50),
                num3 = (int) (Math.random() * 101 - 50), num4 = (int) (Math.random() * 101 - 50),
                num5 = (int) (Math.random() * 101 - 50), num6 = (int) (Math.random() * 101 - 50),
                num7 = (int) (Math.random() * 101 - 50), num8 = (int) (Math.random() * 101 - 50);
        int max = Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), Math.max(Math.max(num5, num6), Math.max(num7, num8)));
        int min = Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), Math.min(Math.min(num5, num6), Math.min(num7, num8)));
        int average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8;
        int j = 1;
        System.out.println(
                "Number " + j + " = " + num1 +
                        "Number " + j++ + " = " + num2 +
                        "Number " + j++ + " = " + num3 +
                        "Number " + j++ + " = " + num4 +
                        "Number " + j++ + " = " + num5 +
                        "Number " + j++ + " = " + num6 +
                        "Number " + j++ + " = " + num7 +
                        "Number " + j + " = " + num8 +

        //"Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " + num4 +
        //"\nNumber 5 = " + num5 + "\nNumber 6 = " + num6 + "\nNumber 7 = " + num7 + "\nNumber 8 = " + num8 +
        "\nGreatest number is = " + max + "\nSmallest number is = " + min +
        "\nAverage of 8 numbers is = " + average +
        "\nAbsolute difference between smallest and greatest is = " + (max - min));
        System.out.println("3rd number is positive = " + (num3 > 0));
        System.out.println("5th number is negative = " + (num5 < 0));
        System.out.println("There is at least one zero among those numbers = " + (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0));
        /*
        if (num3 > 0) System.out.println("3rd number is positive = " + true);
        else System.out.println("3rd number is positive = " + false);
        if (num5 < 0) System.out.println("5th number is negative = " + true);
        else System.out.println("5th number is positive = " + false);
        if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0)
            System.out.println("There is at least one zero among those numbers = true");
        else System.out.println("There is at least one zero among those numbers = false");
         */
        System.out.println("End of the program!");
        System.out.println();

        System.out.println("TASK 3");

        int randomN1 = (int) (Math.random() * 51), randomN2 = (int) (Math.random() * 51),
                randomN3 = (int) (Math.random() * 51), randomN4 = (int) (Math.random() * 51), randomN5 = (int) (Math.random() * 51),
                randomN6 = (int) (Math.random() * 51), randomN7 = (int) (Math.random() * 51);
        int maxOf7 = Math.max(Math.max(Math.max(randomN1, randomN2), Math.max(randomN3, randomN4)), (Math.max(Math.max(randomN5, randomN6), randomN7)));
        int minOf7 = Math.min(Math.min(Math.min(randomN1, randomN2), Math.min(randomN3, randomN4)), (Math.min(Math.min(randomN5, randomN6), randomN7)));
        int averageOf7 = ((randomN1 + randomN2 + randomN3 + randomN4 + randomN5 + randomN6 + randomN7) / 7);
        System.out.println("Number 1 = " + randomN1 + "\nNumber 2 = " + randomN2 + "\nNumber 3 = " + randomN3
                + "\nNumber 4 = " + randomN4 + "\nNumber 5 = " + randomN5 + "\nNumber 6 = " + randomN6 + "\nNumber 7 = "
                + randomN7 + "\nGreatest number is = " + maxOf7 + "\nSmallest number is = " + maxOf7 + "\nAverage of 7 numbers is = "
                + averageOf7);

        if (randomN1 >= 10) System.out.println("First number is greater than or equal to 10 = " + (randomN1 >= 10));
        else System.out.println("First number is greater than or equal to 10 = " + (randomN1 >= 10));
        if (randomN7 <= 40) System.out.println("Last number is less than or equal to 40 = " + (randomN7 <= 40));
        else System.out.println("Last number is less than or equal to 40 = " + (randomN7 <= 40));
        if (randomN1 > 25 && randomN7 > 25)
            System.out.println("Both first and last numbers are greater than 25 = " + (randomN1 > 25 && randomN7 > 25));
        else
            System.out.println("Both first and last numbers are greater than 25 = " + (randomN1 > 25 && randomN7 > 25));
        if ((randomN1 == 0 || randomN1 == 50) || (randomN2 == 0 || randomN2 == 50) || (randomN3 == 0 || randomN3 == 50)
                || (randomN4 == 0 || randomN4 == 50) || (randomN5 == 0 || randomN5 == 50) || (randomN6 == 0 || randomN6 == 50)
                || (randomN7 == 0 || randomN7 == 50))
            System.out.println("At least one of those numbers is 0 or 50  = true");
        else System.out.println("At least one of those numbers is 0 or 50  = false");
        if ((randomN1 < 40 || randomN1 > 50) || (randomN2 < 40 || randomN2 > 50) || (randomN3 < 40 || randomN3 > 50)
                || (randomN4 < 40 || randomN4 > 50) || (randomN5 < 40 || randomN5 > 50) || (randomN6 < 40 || randomN6 > 50)
                || (randomN7 < 40 || randomN7 > 50)) System.out.println("There is no number between 40 and 50 = false");
        else System.out.println("There is no number between 40 and 50 = true");



        System.out.println("End of the program!");
        System.out.println();

        System.out.println("TASK 4");

        int randomOf100_1 = (int) (Math.random() * 101), randomOf100_2 = (int) (Math.random() * 101),
                randomOf100_3 = (int) (Math.random() * 101);
        if (randomOf100_1 > 25 && randomOf100_2 > 25 && randomOf100_3 > 25) System.out.println("True");
        else System.out.println("False");
        System.out.println("End of the program!");
        System.out.println();

        System.out.println("TASK 5");

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the number between 1 and 7 (inclusive): ");
        int weekday = scan.nextInt();
        switch (weekday) {
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
            default:
                System.out.println("It is not a day");
        }
        System.out.println("End of the program!");
        System.out.println();

        System.out.println("TASK 6");

        System.out.println("Pls enter the number between -10 to 10 (both are included): ");
        int numberBetween_10And10Inc = scan.nextInt();

        if (numberBetween_10And10Inc > 0) System.out.println("\"Number entered is POSITIVE\"");
        else System.out.println("\"Number entered is NEGATIVE\"");
        if (numberBetween_10And10Inc == 0) System.out.println("\"Number entered is ZERO\"");
        if (numberBetween_10And10Inc % 2 == 0) System.out.println("\"Number entered is EVEN\"");
        else System.out.println("\"Number entered is ODD\"");
        System.out.println("End of the program!");
        System.out.println();

        System.out.println("TASK 7");

        System.out.println("PLs enter your exam results: ");
        int averageOf3Exams = (scan.nextInt() + scan.nextInt() + scan.nextInt() / 3);

        if (averageOf3Exams >= 70) System.out.println("Jennifer passed the course");
        else System.out.println("Jennifer failed the course");
        System.out.println("The end of the program!");
        System.out.println();

        System.out.println("TASK 8");

        System.out.println("Pls enter 3 numbers: ");
        int numb1 = scan.nextInt(), numb2 = scan.nextInt(), numb3 = scan.nextInt();
        if (numb1 == numb2 && numb2 == numb3 && num1 == numb3) {
            System.out.println("TRIPLE MATCH");
        } else if (num1 == numb2 || numb2 == numb3 || numb1 == numb3) {
            System.out.println("DOUBLE MATCH");
        } else if (numb1 != numb2 && num1 != numb3) {
            System.out.println("NO MATCH");
        }
        System.out.println("End of the program");


    }
}
