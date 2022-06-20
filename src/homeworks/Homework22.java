package homeworks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework22 {
    /*
    -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will return n series of
    Fibonacci numbers as an int array.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */
    public static int[] fibonacciSeries1(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }


    /*
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return
    the nth series of Fibonacci number as an int.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */
    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 1];
    }

    /*
    -Create a method called findUniques()
    -This method will take 2 int array argument and it will return an int array which
    has only the unique values from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.

    public static int[] findUniques(int[] arr1, int[] arr2) {
        int[] arr = new int[Math.max(arr1.length, arr2.length)];
        boolean isUnique = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) arr[i] += arr1[i];
        }
       ______
    }
     */
    //NOT MY SOLUTION
    public static int[] findUniques(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray();
    }

    /*
-Create a method called isPowerOf3()
-This method will take an int argument and it will return true if given int argument
is equal to 3 power of the X. Otherwise, it will return false.
Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….
     */
    public static boolean isPowerOf3(int n) {
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    /*
    -Create a method called firstDuplicate()
    -This method will take an int array argument and it will return
    an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return the one
    for which second occurrence has the smallest index.
     */
    public static int firstDuplicate(int[] arr) {  //   WRONG ONE!!!
        boolean isDuplic = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    isDuplic = true;
                return arr[i];
            }
            if(isDuplic) return -1;
        }
        return 0;
    }








    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(fibonacciSeries2(8));
        int[] arr1 = {1,2,3,2};
        int[] arr2 = {1,2,3,4};
        System.out.println(Arrays.toString(findUniques(arr1, arr2)));
        System.out.println(isPowerOf3(1));
        System.out.println(firstDuplicate(arr1));
    }









}
