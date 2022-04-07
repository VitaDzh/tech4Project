package homeworks;

import java.util.Scanner;

public class MyPractive {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        // DO WHILE

        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter a number between 1 and 10: ");
            num = scan.nextInt();
        }while (!(num > 0 && num < 10)); // (num < 0 || num > 10)
        System.out.println(num + " is between 1 and 10");

        /*
        Write a program which reads a sequence of integers from the user and stops by displaying "Done
        when the sum of these values exceeds 100.
        Pseudo code:
        1. Declare sum variable to store the sum of nums
        2. Read values from the user and add them to sum as long as sum <= 100
        3. When sum >= 100 display "Done"
         */
        //HERE we do not need the variable i, that's why we use do while or while
        System.out.println("DO WHILE LOOP");
        int sum = 0;
        do{
            System.out.println("Enter num: ");
            sum += scan.nextInt();
        }while(sum < 100);
        System.out.println("Done: " + sum);

        System.out.println("WHILE loop");
        while(sum <= 100){
            System.out.println("Enter num: ");
            sum += scan.nextInt();
         //   if(sum > 100)
          //      break;
        }
        System.out.println("Done: " + sum);

        System.out.println("Exercise 2");
        /*
        Write a program which reads a positive number N
        from user then indicates if N is prime or not
        N is a prime if it's divisors only 1 and N
         */
        int sum1 = 1;
        int n = scan.nextInt();
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0)
                sum += i;
        }
        System.out.println(sum == 1 ? "prime" : "not prime");

        /*PSEUDO CODE
     1. Iterate over all the possible divisors except 1 and N
     2. If i is a divisor of N, then N is not prime
     3. N is prime if no divisors were found
         */
        int b = scan.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= b/2; i++) {
            if (b % i == 0){
              isPrime = false;
                break;
            }
            System.out.println(isPrime);
        }

        System.out.println("Exersice 3");
        /*
        Wrtite a program which displays the sum of the strict
        divisors of an integer given by the user
        Example:
        6 --> 1 + 2 + 3 = 6
        10 --> 1 + 2 + 5 = 8
        Hint:
        1.The strict divisors of a number N are <= N/2
        2. If N % i = 0, then i is a divisor of N
        Pseudo code:
        1.Iterate over all the possible divisors
        2. If i is a divisor of N, add i to the sum
        3.Print sum
         */

        System.out.println("Enter num:" );
        int n2 = scan.nextInt();
        int sum2 = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % 1 == 0)
                sum2 += i;
            //System.out.print(i + " "); // to print list of divisors
        }
       System.out.println(sum2);

        System.out.println("Exercise 4");
        /*
        Write a program which reads a sequence of positive integers.
        The program stops when the user fills a negative value and shows
        the maximum and the minimum of these numbers.
        Pseudo code:
        1. REad the first value from the user and suppose it is the max and the min
        2. Keep updating max and min as long as user gives a positive
        3.Display the result when user enters negative num
         */
        int nu = scan.nextInt();;
        int max = nu;
        int min = nu;

        if(n >= 0) {
            while (true) {
                System.out.println("Enter for min and max: ");
                n = scan.nextInt();
                if (n < 0)
                    break;
                if (n > max)     // max = n > max ? n : max;
                    max = n;
                if (n < min)     // min = n < min ? n : min;
                    min = n;
            }
            System.out.println("min " + min + "\nmax" + max);
        }
        else System.out.println(" Num is less than 0");

        System.out.println("Exercise 5");
        /*
        Write a program which display the sum of
        digits of an integer read from the user
Pseudo code:
1. Read the number from the user
2. Keep extracting the digits using the modulo and division operators
and adding them to sum
3. Display sum
         */
        int n3 = scan.nextInt();
        int sum3 = 0;
        while(n > 0){
            sum += n % 10; // ABC
            n /= 10; // AB
        }















    }
}
