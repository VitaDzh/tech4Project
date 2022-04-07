package casting;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your balance: ");
        String balance = scan.next();
        System.out.println("What is your next 3 transactions ");

        /*String t1 = scan.next(), t2 = scan.next(), t3 = scan.next();

        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(t1);
        Double t2D = Double.valueOf(t2);
        Double t3D = Double.valueOf(t3);



        System.out.println("Your balance is now = " + (balanceD - t1D - t2D - t3D)
        );

         */

        //Other way SHORTER. Since we use values only once we do not need to store them .we just print them out
        System.out.println("Your balance is now = " + (Double.valueOf(balance) -
        Double.valueOf(scan.next()) - Double.valueOf(scan.next()) - Double.valueOf(scan.next())));
    }
}
