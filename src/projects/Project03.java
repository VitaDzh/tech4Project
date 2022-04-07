package projects;

import java.util.Scanner;

public class Project03 {

    public static void main(String[] args) {

        System.out.println("TASK 1");
        Scanner scan = new Scanner(System.in);

        String s1 = "24", s2 = "5";
        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2) +
                "\nThe subtraction of " + num1 + " and " + num2 + " = " + (num1 - num2) +
                "\nThe division of " + num1 + " and " + num2 + " = " + (num1 / num2) +
                "\nThe multiplication of " + num1 + " and " + num2 + " = " + (num1 * num2) +
                "\nThe remainder of " + num1 + " and " + num2 + " = " + (num1 % num2));
        System.out.println();

        System.out.println("TASK 2");
        int random = (int) ((Math.random() * 35) + 1);
        System.out.println("Random number = " + random);

        if (random == 2 || random == 3 || random == 5 || random == 7 || random == 11 || random == 13 || random == 17 || random == 19 || random == 23 || random == 29 || random == 31)
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        System.out.println();


        System.out.println("TASK 3");

        int randomNum1 = (int) ((Math.random() * 50) + 1),
                randomNum2 = (int) ((Math.random() * 50) + 1),
                randomNum3 = (int) ((Math.random() * 50) + 1);
        System.out.println("Random number 1 is = " + randomNum1 +
                "\nRandom number 2 is = " + randomNum2 +
                "\nRandom number 3 is = " + randomNum3);

        if (randomNum1 < randomNum2 && randomNum2 < randomNum3) System.out.println("Lowest number is = " + randomNum1);
        else if (randomNum2 < randomNum1 && randomNum2 < randomNum3)
            System.out.println("Lowest number is = " + randomNum2);
        else System.out.println("Lowest number is = " + randomNum3);

        if (randomNum1 < randomNum2 && randomNum2 < randomNum3 || randomNum3 < randomNum2 && randomNum2 < randomNum1)
            System.out.println("Middle number is = " + randomNum2);
        else if (randomNum2 < randomNum1 && randomNum1 < randomNum3 || randomNum3 < randomNum1 && randomNum1 < randomNum2)
            System.out.println("Middle number is = " + randomNum1);
        else System.out.println("Middle number is = " + randomNum3);

        if (randomNum1 > randomNum2 && randomNum2 > randomNum3)
            System.out.println("Greatest number is = " + randomNum1);
        else if (randomNum2 > randomNum1 && randomNum2 > randomNum3)
            System.out.println("Greatest number is = " + randomNum2);
        else System.out.println("Greatest number is = " + randomNum3);
        System.out.println();

        System.out.println("TASK 4");
        char c1 = '7';
        if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122) ;
        else System.out.println("Invalid character detected");
        if (c1 >= 65 && c1 <= 90) System.out.println("The letter is uppercase");
        else if (c1 >= 97 && c1 <= 122) System.out.println("The letter is lower case");
        System.out.println();


        System.out.println("TASK 5");
        char c2 = '=';
        if (c2 >= 65 && c2 <= 90 || c2 >= 97 && c2 <= 122) { //it is not a casting, it is convertion. We had to use 'a'...
            if (c2 == 65 || c2 == 69 || c2 == 73 || c2 == 79 || c2 == 85 || c2 == 97 || c2 == 101 || c2 == 105 || c2 == 111 || c2 == 117)
                System.out.println("The letter is vowel");
            else if (c2 != 65 || c2 != 69 || c2 != 73 || c2 != 79 || c2 != 85 || c2 != 97 || c2 != 101 || c2 != 105 || c2 != 111 || c2 != 117)
                System.out.println("The letter is consonant");
        } else System.out.println("Invalid character detected!!!");
        System.out.println();

        /* SECOND WAY FOR TASK 5
        if(c2 >= 'a' && c2 <= 'z' || c >= 'A' && c2 <= 'Z'){ --> everything here is a letter
        switch (c2){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'O':
        case 'U':
        case 'I':
          sout("vows");
         break;
         default:
            sout("consonant")
            }
        } else sout("Invalid");

         */

        System.out.println("TASK 6");
        char c3 = '+';
        if (c3 >= 33 && c3 <= 47 || c3 >= 58 && c3 <= 64 || c3 >= 91 && c3 <= 96 || c3 >= 123 && c3 <= 127)
            System.out.println("Special character is = " + "\" " + c3 + " \"");
        else System.out.println("Invalid character detected!!!");
        System.out.println();

        /*

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '0')) sout




         */

        System.out.println("TASK 7");
        char c4 = '@';
        if (c4 >= 65 && c4 <= 90 || c4 >= 97 && c4 <= 122) System.out.println("Character is a letter");
        else if (c4 >= 48 && c4 <= 57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");

        System.out.println();
        System.out.println("End of the program!");


    }
}









