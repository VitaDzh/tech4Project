package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        TASK-1
        Pls find how many words u have in the given string
         */
        String s1 = "Today is Tuesday";
        System.out.println(s1.split(" ").length);

        /*
        TASK-2
        How many words u have in the given String starts with A or a
         */
        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] s22 = s2.split(" ");
        int countA = 0;
        for (String word: s22) {
            if(word.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);











    }
}
