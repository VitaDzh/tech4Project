package mathClass;
import java.util.Scanner;
public class MaxAndMinExercise {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers, write the Pseudocode
        and print min and max with proper messages.

         */

        /*Declare and assign variables
        Find min and max with proper messages
         */

        int x = 4, y = 67, z = -54;
        int minOfXY = Math.min(x, y);
        int minOfXYZ = Math.min(Math.min(x, y), z);

        int maxOfXY = Math.max(x, y);
        int maxOfXYZ = Math.max(Math.max(x, y), z);

        System.out.println("Min values of x y z: " + minOfXYZ);
        System.out.println("Max values of x y z: " + maxOfXYZ);


        // this way is more faster
        Math.max (x, y); //67
        System.out.println("Max of every number is = " + Math.max(Math.max(x, y), z)); //67, -54



        /* February 19 class
        Write a program which is going to print the max of given 3 numbers
        4, 56,23
         */

        int n1 = 4; // we do not have to declare and assign numbers. we can just print everything immediately
        int n2 = 56;
        int n3 = 23;
        System.out.println("The max of 3 numbers is: " + Math.max(Math.max(n1, n2), n3));

        /*
         Write a program which asking user to enter 4 numbers.Print  the max of their numbers
         */
        Scanner findMaxOf4Num = new Scanner(System.in);
        System.out.println("Pls enter 4 numbers: ");
        int number1 = findMaxOf4Num.nextInt(), number2 = findMaxOf4Num.nextInt(), number3 = findMaxOf4Num.nextInt(), number4 = findMaxOf4Num.nextInt();
        /* Math.max(number1, number3);
           Math.max(number3, number4);
           Math.max(Math.max(number1, number3), Math.max(number3, number4)));
         */
        System.out.println("The biggest number is: " + Math.max(Math.max(number1, number2), (Math.max(number3,number4))));

        /*System.out.println("The biggest: " +
                Math.max(Math.max(findMaxOf4Num.nextInt(), findMaxOf4Num.nextInt()))); //we can use scanner inside println and do not need to declare and assign
         */
      Math.min(number1,number2);
      Math.min(number3, number4);
        System.out.println(Math.min(Math.min(number1,number2),Math.min(number3, number4)));
        System.out.println("The min:" +
                Math.min(Math.min(findMaxOf4Num.nextInt(), findMaxOf4Num.nextInt()), Math.min(findMaxOf4Num.nextInt(), findMaxOf4Num.nextInt())));

        /* RANDOM
        get a random number between 15 - 30 (both included)
        EX: (Math.random() * (endPoint - startPoint +1) + startPoint)
         */
        //(int)(Math.random() * 16 + 15);






    }
}
