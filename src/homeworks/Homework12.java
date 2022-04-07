package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("---------------TASK 1---------------");
        /*
        -Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0
         */

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3] + "\n" + numbers[0] + "\n" + numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("---------------TASK 2---------------");
        /*
    -Create a String array having size of 5
    -Assign “abc” to index of 1
    -Assign “xyz” to index of 4
         */
        String[] chars = new String[5];
        chars[1] = "abc";
        chars[4] = "xyz";
        System.out.println(chars[3] + "\n" + chars[0] + "\n" + chars[4]);
        System.out.println(Arrays.toString(chars));


        System.out.println("--------------------TASK 3-------------------");
        int[] nums = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println("---------------TASK 4-----------------");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("----------------TASK 5----------------");
        /*
        Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        -Print the entire array
        -Then, check if it contains Pluto
            if it contains Pluto, then print true
            if it does not contain Pluto, print false
         */
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));
        boolean isThereAPluto = false;
        for (String dog : cartoonDogs) {
            if (dog.equals("Pluto")) isThereAPluto = true;
        }
        System.out.println(isThereAPluto);


        System.out.println("------------------TASK 6-----------------");
        /*
        -Create a String array that stores cartoon cats below
        Garfield, Tom, Sylvester, Azrael
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
            if it contains both, then print true
            if it does not contain both, print false
            Pseudo code:
            1.create a String and store data, create 2 flags for chechink
            2.print the entire array sorted lexicographically
            3.Then check if it contains Garfield and Felix:
            -if it contains both, then print true
            - if it does not contain both, print false
         */

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean hasGarfield = false, hasFelix = false;
        for (String cat : cartoonCats) {
            if (cat.equalsIgnoreCase("Garfield")) hasGarfield = true;
            else if (cat.equalsIgnoreCase("Felix")) hasFelix = true;
        }
        System.out.println(hasFelix && hasGarfield);

        System.out.println("Sort solution");
        Arrays.sort(cartoonCats);
        System.out.println((Arrays.binarySearch(cartoonCats, "Garfield") >= 0) &&
                (Arrays.binarySearch(cartoonCats, "Felix") >= 0));



        System.out.println("-------------TASK 7-------------");
        double[] numbers2 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbers2));
        for (double n : numbers2) {
            System.out.println(n);
        }

        System.out.println("---------------TASK 8----------------");
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));
        int lettersTotal = 0, lowerCaseTotal = 0, upperCaseTotal = 0, digitsTotal = 0, specialCharTotal = 0;
        for (char cha : characters) {
            if (Character.isLetter(cha)) {
                lettersTotal++;
                if (Character.isLowerCase(cha)) lowerCaseTotal++;
                else upperCaseTotal++;
            } else if (Character.isDigit(cha)) digitsTotal++;
            else if (!Character.isLetterOrDigit(cha) && !Character.isWhitespace(cha)) specialCharTotal++;
        }
        System.out.println("Letters = " + lettersTotal +
                "\nUppercase letters = " + upperCaseTotal +
                "\nLowercase letters = " + lowerCaseTotal +
                "\nDigits = " + digitsTotal +
                "\nSpecial characters = " + specialCharTotal);


        System.out.println("------------TASK 9----------");
        /*
                Requirement:
        -Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler

        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring cases

         */
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int upperC = 0, lowerC = 0, bOrp = 0, bookOrpen = 0;
        for (String ob : objects) {
            if (Character.isUpperCase(ob.charAt(0))) upperC++;
            else lowerC++;
            ob = ob.toLowerCase();
            if (ob.charAt(0) == 'b' || ob.charAt(0) == 'p') bOrp++;
            if (ob.contains("book") || ob.contains("pen")) bookOrpen++;
        }
        System.out.println("Elements starts with uppercase = " + upperC);
        System.out.println("Elements starts with lowercase = " + lowerC);
        System.out.println("Elements starts with B or P = " + bOrp);
        System.out.println("Elements has \"book\" or \"pen\" = " + bookOrpen);


        System.out.println("-------------TASK 10------------");
        /*
                Requirement:
        -Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78

        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10

         */
        int[] numbers10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers10));
        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int numOf10 : numbers10) {
            if (numOf10 > 10) counter1++;
            else if (numOf10 < 10) counter2++;
            else counter3++;
        }
        System.out.println("Elements that are more than 10 = " + counter1 +
                "\nElements that are less than 10 = " + counter2 +
                "\nElements that are 10 = " + counter3);


        System.out.println("--------------TASK 11---------------");
        /*
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
         */
        int[] ary1 = {5, 8, 13, 1, 2};
        int[] ary2 = {9, 3, 67, 1, 0};
        int[] ary3 = new int[5]; //
        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.toString(ary2));

        for (int i = 0; i < ary3.length; i++) {
            ary3[i] = Math.max(ary1[i], ary2[i]);
        }
        System.out.println(Arrays.toString(ary3));

/* IF WE DO NOT KNOW THE LENGTH OF ARRAYS

            /*
            i ->        0, 1, 2,  3, 4, 5, 6
            First ->    5, 8, 13, 1, 2, 2 ,9
            Second ->   9, 3, 67, 1, 0
            Third ->    9, 8, 67, 1, 2, 2, 9

 */

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[Math.max(first.length, second.length)]; // change this

            for (int i = 0; i < third.length; i++) {
        if (i < Math.min(first.length, second.length)){
            third[i] = Math.max(first[i], second[i]);
        }else if(first.length > second.length){
            third[i] = first[i]; // getting the rest of elements
        }else{
            third[i] = second[i];// getting the rest of elements
        }
    }
        System.out.println("1st array is = " + Arrays.toString(first) +
            "\n2nd array is = " + Arrays.toString(second) +
            "\n3rd array is = " + Arrays.toString(third));




    }
}

