package operator.relationalOperators;

public class Exercize1 {
    public static void main(String[] args) {

       /* Requirements:
        Find if the following statements are true or false
        Test data:
        int x = 10, y = 20, z = 10;

        */
        int x = 10, y = 20, z = 10;

        boolean b1 = y < z;
        boolean b2 = x <= y;
        boolean b3 = x >= z;
        boolean b4 = y > x;
        boolean b5 = x >= y;
      //  boolean b6 = (x >= z) < y; // (x>=y) - this is a boolean. and we comparing it to int. we need smth more

        System.out.println("b1 : " + b1);
        System.out.println("b2 : " + b2);
        System.out.println("b3 : " + b3);
        System.out.println("b4 : " + b4);
        System.out.println("b5 : " + b5);






    }
}
