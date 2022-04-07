package operator.arithmeticOperators;

public class Division {
    public static void main(String[] args){

        //we want to know what is an exact number. a decimals .we just use double

        double num1 = 15.6;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double division = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble = num4 / num2;


        System.out.println("num1 / num2 = " + (num1 / num2)); // double / double
        System.out.println("num1 / num3 = " + ( 15.6 / 3.0 ));  // double / int. we always have to put paranthesis.If we use + and do not use paranthesis, java will concat this, not add
        System.out.println("num4 / num2 = " + divisionByDouble); // int / double


        //remainder always uses with division





    }
}
