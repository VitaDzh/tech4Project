package methods;

import utilities.Calculator;

public class TestingCalculator {

    public static void main(String[] args) {
        int i1 = 15, i2 = 2;
       int result =  Calculator.divide(i1, i2);
        System.out.println(result);

       double d1 = 15, d2 = 2;
        System.out.println(Calculator.divide(d1, d2));
    }
}
