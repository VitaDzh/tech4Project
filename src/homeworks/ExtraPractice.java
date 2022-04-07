package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

public class  ExtraPractice {






    /*
    Create a method which will take an int as ang argument and returns a String.
    If the int number is in between -50/ 0 return "The number is negative and more than -50"
    If the int number is in between 0/ 50 return "The number is positive and less than 50"
    If the int number is  0 return "The number is zero"
    If the number is 9 return "You have hit the lucky number!"
    If the number is -11 return "You have hit the unlucky number!"
     */

    public static String luckyUnlucky(int num) {
        if (num == -11) return "You have hit the unlucky number!";
        else if (num == 9) return "You have hit the lucky number!";
        else if (num >= -50 && num < 0) return "The number is negative and more than -50";
        else if (num > 0 && num <= 50) return "The number is positive and less than 50";
        else if (num == 0) return "The number is zero";
        else return "This number is not good for this game";
    }
    /*
     //EDGE CASES - BOUNDARY CASES
        System.out.println(luckyUnluckyGame(-11));
        System.out.println(luckyUnluckyGame(9));
        System.out.println(luckyUnluckyGame(0));
        System.out.println(luckyUnluckyGame(-12));
        System.out.println(luckyUnluckyGame(49));
        System.out.println(luckyUnluckyGame(-75));
        System.out.println(luckyUnluckyGame(34223));

        checkAgeAndName("Abe", 31); //
        checkAgeAndName("Data", 25);
        checkAgeAndName("kaly", 35);
        checkAgeAndName("guluzar", 19);
     */


    /*
Create a method which will take an int for age and String as a name
if the age is older than 30 and first letter is uppercase print out "Age and letter checks out"
if the age is older than 30 and first letter is lowercase print out "Age checks out but letter doesn't"
if the age is equal or younger than 30 and first letter is uppercase print out "Age doesn't check out but letter does"
if the age is equal or younger than 30 and first letter is lowercase print out "Nothing checks out"
 */
    public static String ageName(int age, String name) {
        if (age > 30) {
            if (CharacterHelper.isUppercase(name.charAt(0))) {
                return "Age and letter checks out";
            } else {
                return "Age checks out but letter doesn't"; //I can not use else IF again, because EXAMPLE if age 65 and name starts with 6BEn. mine first conditions is true, but first else if is FALSe, and second ELSE if is FALSE. it can not complete the block of code
            }
        } else {
            if (CharacterHelper.isUppercase(name.charAt(0))) {
                return "Age doesn't check out but letter does";
            } else return "Nothing checks out";
        }
    }
    /*
        Requirement:
        check the number is in between 1 to 10 (1 and 10 are included)
        They will get some points based on numbers they
        entered. So, their points will be calculated as below
        1st  number will be multiplied by 15 and added as points
        2nd number will be multiplied by 10 and added as points
        3rd number will be multiplied by 5 and added as points
        If user enters any number that is not in the range,
        then user will not get any points from that number

        Test data:
        3 7 2 1 8
        Expected result:
        59
         */

    public static void main(String[] args) {

        int num1 = ScannerHelper.getNumberFromUser(), num2 = ScannerHelper.getNumberFromUser(),
                num3 = ScannerHelper.getNumberFromUser();
        if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10 && num3 >= 1 && num3 <= 10) {
            System.out.println(num1 * 15 + num2 * 10 + num3 * 5);
        } else System.out.println("U got nothing");

    }

        /*
        Create a method which will take a String as name and age
        if user age getting dividided by their name’s length without any leftovers
        we will print out “Your age and name gets along!” otherwise print out
        “Your age and name needs time :(”
        if name first letter is a vowel then print out
        “Starting with vowels” otherwise print out “Starting with consonants I see”
        if the name ENDS with a consonant print out “Nice finish” otherwise “Seen better”
        NOTE: If the given name and age is the same as yours print out  “IMPOSTER!!!”
        nothing else (Ignore cases)
         */

/*
    public static String superTask(String name, int age) {
        if (CharacterHelper.isVowel(name.charAt(0))) return "Starting with vowels";
        else return "Starting with consonants I see";


        if (CharacterHelper.isConsonant(name.charAt(name.length() - 1))) return "Nice finish";
        if (age % name.length() == 0) return "Your age and name gets along!";
        else return "Your age and name needs time :(";
        if (age == 29) return "IMPOSTER!!!";
        else return "!";
    }

     */

    /*
            Create a method which will take a full name as a String (only first name and the last name not middle )
        Get the first name and make the name inital capped(only the first letter is uppercase rest is lowercase EX: jOe --> Joe)
        Get the last name and make the last name fully uppercase
        Put the first name and last name in one String and return it
        NOTE: This method should work with every full name!
     */
    public static String fullNAme(String fname) {
        return "First name is " + fname.substring(fname.charAt(0), fname.indexOf(' ')).toLowerCase() + "\nLast name is " + fname.substring(fname.indexOf(' ')).toUpperCase();
    }
}





