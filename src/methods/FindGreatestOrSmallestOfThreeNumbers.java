package methods;

import utilities.Calculator;
import utilities.MathHelper;

public class FindGreatestOrSmallestOfThreeNumbers {
    public static void main(String[] args) {
       //  Math.max(5, 1, 5);//compiler error
       int max =  MathHelper.maxOfThree(5, 1,5);
        System.out.println("Max of three numbers = " + max);

        MathHelper.maxOfThree(1.1, 2.4, 7.8);
        byte b = 6; //  MathHelper.maxOfThree(b, 2.4, 7.8). we can put (b, 2.4, 7.8), it will work because byte implicitly cast to a double!!!

        byte b1 = (byte)(Math.random()*10);
        byte b2 = (byte)(Math.random()*10);
        byte b3 = (byte)(Math.random()*10);
        System.out.println(b1 + "\n" + b2 + "\n" + b3);
        System.out.println(MathHelper.minOfThree(b1, b2, b3));

       byte abs =  (byte)Calculator.absolute(b1, b2);
        System.out.println("abs " + abs);



    }

}
