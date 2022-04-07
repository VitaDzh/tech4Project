package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        String[] s = new String[5];
        System.out.println(Arrays.deepToString(s));


        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints));

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars));

        boolean[] booleans = new boolean[3];
        System.out.println(Arrays.toString(booleans));






    }
}
