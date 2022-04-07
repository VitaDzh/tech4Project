package operator.arithmeticOperators;

public class Exercise2 {
    public static void main(String[] args){

        /*write a program that calculates and prints the area and perimeter of a rectangle
        Create the variables
        Find area by multiplying
        Find perimeter with formula
         */


        int a = 2;
        int b = 3;
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + (a * b)); //second way to find the result.Here we do not have to assign any formula to area



    }
}
