package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name;
        name = "John";
        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students info
         */
        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22}; // elements in an Array
        char[] favChars = {'a', '%', 'A'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        //How to print all of them
        System.out.println(Arrays.toString(names));

        //How to get a single element from Array
        System.out.println(names[1]);

        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); // converts to String

        //Alex's age is 21, fav is a, his balance 5.6, he like Java is false.
        //HOW TO LOOP ARRAY USING FOI LOOP
        for(int i = 0; i <=2; i++){
            System.out.println(names[i] + " 's age is " + ages[i] + " fav chars " + favChars[i] + ".");
        }








    }
}
