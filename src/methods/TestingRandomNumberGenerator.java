package methods;

import utilities.Calculator;
import utilities.RandomNumberGenerator;

public class TestingRandomNumberGenerator {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random number between 37 and 63 and find their division
        63 - 37 + 1 = 27
         */
       // int ran1 = (int)(Math.random()*27) + 37;
        int ran2 = RandomNumberGenerator.getRandomNumber(37, 63);
        int ran3 = RandomNumberGenerator.getRandomNumber(37, 63);
        System.out.println(ran2 + "\n" + ran3);

        System.out.println(Calculator.divide(ran2, ran3));



    }
}
