package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        char first = name1.charAt(0);
        char last = name1.charAt(name1.length() - 1);
        System.out.println("Middle " + name1.charAt(name1.length()/ 2 - 1) + name1.charAt(name1.length()/2)); //DO NOT put it in parentesis, cause it will calculate two chars

        String name2 = "Vita";
        String name3 = "Guluzar";
        String name4 = "Kaly";
        System.out.println(StringHelper.getMiddle(name2) + "\n" + StringHelper.getMiddle(name3) + "\n" + StringHelper.getMiddle(name4));

        String mine = "Antrolopogie";
        /*
        find middle, print 3 last chars, and 3 first char
         */
        System.out.println("Middle 2 chars " + mine.charAt(mine.length() / 2-1) + mine.charAt((mine.length()/2-1)+1));
        System.out.println(mine.substring(0, 3));
        System.out.println(mine.substring(mine.length()-3));
        String word1 = mine.substring(0, ' ');
        System.out.println(word1.substring(0, 2).equals(word1.substring(word1.length()-2))) ;

        /*
                Assume you are given 3 Strings as below;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */
        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ";
        String s4 = s1.trim() + s2.trim() + s3.trim();
       // System.out.println(s1.trim().toLowerCase().replace('t', 'T') + "" + s2.trim().replace('g', 'G') + "" + s3.trim().toLowerCase());
        System.out.println(s4.toLowerCase().replace('t', 'T').replace('g', 'G'));



    }
}
