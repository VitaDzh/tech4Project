package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of
        number from 10 to 15 ( 10 and 15 are included)
         */
        int sum = 0;
        for (int i = 10; i <= 15; i++) { // it only works with start point 0, if your start point is ODD it will not work
           sum += i;
            System.out.println(sum); // prints everything inside the block until loop will be broken, till false is reached
           /*
           10
           11
           12
           13
           14
           15
            */
        }
        System.out.println(sum); //out of loop it will print total sum of loops
    }
}
