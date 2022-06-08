package myJavaPractice;


import java.awt.*;
import java.util.Arrays;

public class MyHomePractice1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point1);

        String message = "Hello Word" + "!!";
        System.out.println(message.replace("d", "!"));

        int[] numbers = new int[5];  //this is a syntax for Arrays
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        char[] letters = { 'a', 'c', 'b' };
        System.out.println(letters.length); // outprint will show how many letters are in letters variable
        Arrays.sort(letters);
        System.out.println(letters);

        //multidimentional Arrays
        int[] chara = new int[3]; // single dimentional Array
        int[] [] [] characters = new int[2] [3] [5];// we converted it to a two dimentional Array
        characters [0] [0] [0]= 1;
        int[] [] character = { { 1, 2, 3 }, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(character));

        //constant
        final float PI = 3.14F; // using final before datatype means we can't change the value of it then
                                // by convention we use all capital letters to initialize constants

       //Arithmetic Expressions
        int result = 10 + 3;
        System.out.println(result);
        double result2 = (double)10 / (double)3;  // "/" is an arithmetic operator, "10, 3" called operands
        System.out.println(result2);

        //increment and decrement operands
        int q = 1;
        q++; // if we want to increase the value of "q" by 1, we use increment operator
        System.out.println(q);
        int w =++q;
        q +=2; // here += is an an augmented or compound assignment
        System.out.println(q);
        System.out.println(w);





    }
}









