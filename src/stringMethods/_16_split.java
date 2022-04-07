package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {
        String s = "Banana is nice";
        String[] splitItFromSpace= s.split(" ");
        System.out.println(Arrays.toString(splitItFromSpace));

        String[] splitFromI = s.split("i");
        System.out.println(Arrays.toString(splitFromI));

        String[] splitFromA = s.split("a");
        System.out.println(Arrays.toString(splitFromA));




    }
}
