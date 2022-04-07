package homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        /*
        Write a program that prints all the numbers that are dividable
        by 7 starting from 1 to 100 (1 and 100 are included)
         */
        String strin = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) strin += i + " - ";
        }
        System.out.print(strin.substring(0, strin.length() - 3));
        System.out.println("\n");

        System.out.println("TASK 2");
/*
        Write a program that prints all the numbers that are dividable
        by both 2 and 3 starting from 1 to 50 (1 and 50 are included)
        NOTE: Result must be in one line with space and dash separators
        Expected Output:6 – 12 – 18 . . . 36 – 42 - 48
 */
        String fullName = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 2 == 0) fullName += i + " - ";
        }
        System.out.print(fullName.substring(0, fullName.length() - 3));
        System.out.println("\n");


        System.out.println("TASK 3");
        /*
        Write a program that prints all the numbers that are dividable
        by 5 starting from 100 to 50 (100 and 50 are included)
        NOTE: Result must be in one line with space and dash separators
        Expected Output: 100 – 95 – 90 . . . - 60 - 55 - 50
         */
        String str1 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) str1 += i + " - ";
        }
        System.out.println(str1.substring(0, str1.length() - 3));
        System.out.println("\n");


        System.out.println("TASK 4");
        /*
            Write a program that prints the squares of all numbers starting from 0 to 7 (0 and 7 are included)
            Expected Output:
            The square of 0 is =  0
            The square of 1 is =  1
                   ...
            The square of 7 is =  49
         */
        int square = 0;
        for (int i = 0; i <= 7; i++) {
            // System.out.println("The square of " + i + " is = " + i * i);
           square = i * i;
            System.out.println("square of " + i + " is " + square );

        }
        System.out.println("\n");


        System.out.println("TASK 5");
        /*
        Write a program that finds sum of the numbers starting from 1 to 10
        Calculation => 1+2+3+4+5+6+7+8+9+10
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();


        System.out.println("TASK 6");
        /*
        Write a program that asks user to enter a positive number
        And find the factorial of the number
        0! = 1
        1! = 1
        2! = 1*2 = 2
        3! = 1*2*3 = 6
        5! = 1*2*3*4*5 = 120
         */
        System.out.println("WHILE LOOP");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scan.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
        System.out.println();

        System.out.println("FORI LOOP");
        System.out.println("Pls enter your num: ");
        int number1 = scan.nextInt();
        int facto = 1;
        for (int j = 1; j <= number1; j++) {
            facto *= j;
        }
        System.out.println("Factorial of " + number1 + " is: " + facto);
        System.out.println();


        System.out.println("TASK 7");
        /*
        Write a program that asks user to enter their first and last name
        And count how many vowel letters they have in their first and last name
        Vowel letters = a, e, i, o, u
        Pseudo Code:
        1. Ask user --> use Scanner
        2. Create a container for counting outside of the loop (BECAUSE number gonna changing every iteration)
        3. Create fori loop and check vowels
        4. Print a message
         */

        System.out.println("Pls enter your full name: ");
        scan.nextLine();
        String fLNames = scan.nextLine().toLowerCase();
        int count2 = 0;

        for (int j = 0; j < fLNames.length(); j++) {
            if (fLNames.charAt(j) == 'a' || fLNames.charAt(j) == 'e' || fLNames.charAt(j) == 'i' || fLNames.charAt(j) == 'o' || fLNames.charAt(j) == 'u') {
                count2++; // CharacterHelper.isVowel(fLName.charAt(i)))
            }
        }
        System.out.println("There are " + count2 + " vowel letters in this full name");
        System.out.println();

        System.out.println("TASK 8");
        /*
        Write a program that asks user to enter a number
        If number is less than 100, then ask user to enter another number and find sum
        of entered 2 numbers.
        Keep asking user to enter numbers until the sum of all entered numbers is at
        least 100.
        If first number entered by user more than or equal to 100, print message
        “This number is already more than 100” and do not ask user to enter any other
        numbers
        Pseudo Code:
        1. Use do while loop
        2. Get num from user-> Scanner and sum them and if they are
        more than or equal to 100 break and print a message
        3. Create a container for counter(attempt) and for the sum, and for the user's number
        4. If the number is more than or equal to 100 AND we are at the FIRST run BREAK
        !! More specific condition go first
         */

        int sum2 = 0; // wrong because
        do {
            System.out.println("Pls enter num: ");
            int num = scan.nextInt();
            if (num >= 100) {
                System.out.println("This number is already more than 100");
                break;
            } else {
                sum2 +=num;
                if(sum2 >= 100) {
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }
        }
        while (sum2 < 100);
        System.out.println();

        //------------------------------
/*
        int num = 0; // for getting a number from user
        int sum0 = 0;  // for getting the sum of numbers
        int attempt = 1; // for checking how many times the loop has run
        do{
            System.out.println("Please enter a number: ");
            num = scan.nextInt();
            if(attempt == 1 && num >= 100; i++){
            System.out.println("This num is already more than 100");
            break;
            } else{
                sum += num;
                if(sum0 >= 100){
                    System.out.println("Sum of nums are ");
                }
            }
                attempt++;
            }while (sum < 100);

 */

        System.out.println("TASK 9");
        /*
        Assume that you are given a number and you are asked to find series of
        Fibonacci numbers
        What is Fibonacci numbers: a series of numbers in which each number
        ( Fibonacci number ) is the sum of the two preceding numbers
        It always starts with 0 and 1
        EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
        NOTE: Write a program that handles any n series of numbers
        Pseudo code:
        1.two containers for 0 and 1 and another 1 for the sum, container String for message
        2. we are repeating , so using loop
        3.
            n1     n2    total
    i = 0   0       1      1
    i = 1   1       1      2
    i = 2   1       2      3
         */
        int num1 = 0, num2 = 1, num3;
        for (int j = 0; j < 7; j++) {
            System.out.print(num1 + "   ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("\n");
        /*
        int n1 = 0, int n2 = 1, int total;
        String s = "";
        for(int i = 0; i < 7; i++){
        message += n1 + " - "
        total = n1 + n2
        n1 = n2;
        n2 = total;
        }
        sout(s.substring(0, s.length()));
        }
         */


        System.out.println("TASK 10");
        /*
        Write a program that asks user to enter a name
        If name starts with j or J, then finish the program
        But, if the name does not start with j or J, then keep
        asking until user gives a name that starts with j or J.
         */
        String name = scan.nextLine();
        do {
            System.out.println("Pls enter your name: ");
            name = scan.nextLine();
        } while (!name.toUpperCase().startsWith("J"));
        System.out.println("End of the program");


        System.out.println("TASK 8");
/*
    int total = 0;
    int number0;
    int attempt = 1;
        do {
                System.out.println("Pls enter num: ");
                number0 = scan.nextInt();
                if (attempt == 1 && number0 >= 100) {
                System.out.println("This number is already more than 100");
                break;
                } else {
                    total += number0;
                }
                if(total >= 100 && attempt != 1) {
                System.out.println("Sum of the entered numbers is at least 100");
                }

                attempt++;
                }
                while (total < 100);
        System.out.println();

 */



    }
}



















