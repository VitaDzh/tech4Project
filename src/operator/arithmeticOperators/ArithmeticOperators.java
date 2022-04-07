package operator.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){

        int number1 = 9;
        int number2 = 3;
        number1 = 5; //re-assignment


        //addition
        int sum = number1 + number2; // output = 8

        //subtraction
        int sub = number1 - number2; // output = 2

        //multiplication
        int times = number1 * number2; // output = 15;

        //division
        int div = number1 / number2;

        //remainder
        int remainder = number1 % number2; // 5 - (3*1) = 2. how many times can we store 3 in 5, only one time, so 3*1=3 and 5-3=2. Remainder is a leftover.

        System.out.println("Addition is = " + sum);
        System.out.println("Sub is = " + sub);
        System.out.println("Multi is = " + times);
        System.out.println("Div is = " + div);
        System.out.println("Rem is = " + remainder);




    }
}
