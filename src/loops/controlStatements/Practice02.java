package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*

       1.As user to enter 2 nums between 0 and 10
       2. Store 2 nums
       3.find min and max
       4. print
       5. put condition
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter nums: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        for(int i = Math.min(num1,num2); i <= Math.max(num1, num2); i++){
            if(i == 5)
                continue;
            System.out.println(i);
        }








    }
}
