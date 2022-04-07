package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {


        /*
                TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
 */


        int count = 0;
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        for (int i = 0; i < address.length() - 1; i++) {
            if (address.charAt(i) == ' ') { // if(Character.isSpaceChar(address.charAt(i)))
                count++;
            }
        }
        System.out.println(count);


          /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */
        int count1 = 0;
        for (int i = 0; i < address.length() - 1; i++) {
            if (Character.isLetter(address.charAt(i))) {
                count1++;
            }
        }
        System.out.println(count1);

        /*
       int count2 = 0;
        for(int i = 0; < address.length()-1; i++){
            char c = address.charAt(i);
            if((c >= 'A' && c <= 'Z') || c >= 'a' && c <= 'z') count2++;
        }
        sout(count2)
         */


        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
 */
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < address.length() - 1; i++) {
            char c = address.charAt(i);
            if (Character.isUpperCase(c)) count3++;
            else if (Character.isLowerCase(c)) count4++;
        }
        System.out.println(Math.abs(count3 - count4));

        /*
        for (int i = 0; i < address.length(); i++) {
            if(Character.isLetter(c)) count++;
            else count--;
        }
        System.out.println(count++ - count--);
         */

        /*
         Write a program that counts vowel and consonant letters for below String.
      and print
         */
        int count0 = 0, counti = 0;
        String addresss = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        for (int i = 0; i < addresss.length() - 1; i++) {
            char a = addresss.charAt(i);
            if (Character.isLetter(a)) {
                if (CharacterHelper.isVowel(a)) counti++;
                else count0++;
            }
        }
        System.out.println("vowels " + counti + " consonant " + count0);


                /*
        TASK-5 - Putting all together
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        Lowercases = 17
        Uppercases = 8
        Vowels = 10
        Consonants = 16
        Digits = 12
        Spaces = 9
        Specials = 2
        Letters
              Upper or Lower
              Vowel or Conson
        Digits
              Even or Odd
        Specials
        Spaces

         */
        System.out.println("\n---TASK-5---\n");
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)) {
                letterCounter++;
                if (Character.isUpperCase(c)) {
                    upperCounter++;
                } else {
                    lowerCounter++;
                }

                if (CharacterHelper.isVowel(c)) {
                    vowelCounter++;
                } else {
                    consonantCounter++;
                }
            } else if (Character.isDigit(c)) {
                digitCounter++;
                if (Integer.parseInt("" + c) % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }
            } else if (Character.isSpaceChar(c)) {
                spaceCounter++;
            } else {
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }
}

/*
        String s = "ab1x2y3cd3dsjfhw43";
       // 1+2+3+3+4+3 = 16;
       // 49+50+51+51+52+51 = 304;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));

 */




























