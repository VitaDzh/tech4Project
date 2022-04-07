package loops;
import java.util.Scanner;
public class SumOfNumbersFromUser {
    public static void main(String[] args) {


        /*
        Write a Java program that asks user to enter some numbers and
        find the sum of numbers given by user
        Example program
        Program: Please enter how many number you want to enter
        User: 3
        Program: Please enter number 1
        User: 10
        Program: Please enter number 2
        User: 7
        Program: Please enter number 3
        User: 8
        Expected output:
        25
         */

        System.out.println("Please enter how many numbers you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();

        // FORI
        int sum = 0;
        for(int i = 1; i <= numTotal; i++){
            System.out.println("Pls enter number " + i);
            sum += scan.nextInt();
        }
        System.out.println(sum);

        //WHILE
        int count = 1;
        int sum2 = 0;
        while (count <= numTotal){
            System.out.println("Pls enter number " + count);
            sum2 += scan.nextInt();
            count++;
        }
        System.out.println(count);


    }
}
