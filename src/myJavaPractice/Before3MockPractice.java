package myJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Before3MockPractice {


    public static String noDigits(String str) {
        String noDig = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) noDig += str.charAt(i);
        }
        return noDig;
    }

    public static String noCons(String str) {
        return str.replaceAll("[a-zA-Z&&[^AEIOUaeiou]]", "");
    }

    public static String noConsonants(String str) {
        return str.replaceAll("[^aeiouAEIOU\\d\\W_]", "");
    }

    public static String[] removeDuplic(String[] str) {
        ArrayList<String> uniques = new ArrayList<>();
        for (String s : str) {
            if (!uniques.contains(s)) uniques.add(s);
        }
        return uniques.toArray(new String[0]);
    }


    public static int countPrimeNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number == 2 || number == 3) count++;
            else if (number > 3){
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }




    public static int countPrimee(int[] arr){
        int count = 0;
        for (int a : arr) {
            if (a < 2) {
                continue;
            }
        else if(a == 2 || a == 3) count++;
            else{
                boolean isPrime = true;
                for (int i = 2; i <= a/2; i++) {
                    if(a % i == 0){
                        isPrime = false;
                        break;
                    }
                }
      if(isPrime) count++;
            }
        }
        return count;
    }

    public static void isPrime(int num){
        int count = 0;
            for (int i = 1; i <= num; i++) {
                if(num % i == 0) count++;
        }
        if(count == 2) System.out.println("Prime"); // since Prime is a num dividable by itself and 1 only
        else System.out.println("Not Prime");
    }

    public static int countPrimeee(int[] arr){
        int countPrime = 0;
        for (int a : arr) {
           int  countInside = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && a != 1) {
                    countInside++;
                }
            }
            if(countInside == 2) countPrime++;
        }
        return countPrime;
    }




    public static void reverseEachWord(String str){
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i ++){
            for (int j = arr[i].length()-1; j >=0; j-- ){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static int secondMaxValue(int[] numbers){
        TreeSet<Integer> uniques = new TreeSet<>();
        for(int number : numbers) uniques.add(number);

        return new ArrayList<>(uniques).get(uniques.size()-2);
    }



    ///////////////////////////

    public static void findSecondGreatestAndSmallest(int[] nums){
        if(nums.length >= 1){
            int smallest = Integer.MAX_VALUE;
            int greatest = Integer.MIN_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            int secondGreatest = Integer.MIN_VALUE;
            for(int element : nums){
                if(element < smallest) smallest = element;
                if(element > greatest) greatest = element;
            }
            for (int element : nums) {
                if(element < secondSmallest && element != smallest) secondSmallest = element;
                if(element > secondGreatest && element != greatest) secondGreatest = element;

            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
        }
    }


    public static int[] factorial(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else{
                int number =  numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }

    public static int[] factor(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int f = 1;
            for (int j = arr[i]; j >= 2; j--) {
                f*=j;
            }
            arr[i] = f;
        }
        return arr;
    }



    public static int factorial(int number){
        int temp = 1;
        if(number == 0 || number == 1) return 1;
        else {
            for (int i = 2; i <= number; i++) {
                temp *= i;
            }
        }
        return temp;
    }




    public static int[] removeDuplicateNumbers(int[] numbers){
        HashSet<Integer> uniques = new HashSet<>();
        for(int i : numbers) uniques.add(i);

        int[] arr = new int[uniques.size()];

        int index = 0;
        for(int i : uniques) arr[index++] = i;

        return arr;
    }


    public static boolean isAnagram(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static int returnSum(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
                  if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }





    public static void main(String[] args) {
        String sum = "1 1 2 2 3 3 ";
        System.out.println("sum is " + returnSum(sum));
        System.out.println(secondMaxValue(new int[]{-5, 4, 1, 10, 2})); // 4
        int[] intArr = {-5, 4, 1, 10, 2};
        System.out.println("Facto" + Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2}))); // [1, 120, 24, 1, 6, 2]
        System.out.println("Facto Alona's" + Arrays.toString(factor(new int[]{0, 5, 4, 1, 3, 2}))); // [1, 120, 24, 1, 6, 2]
        System.out.println("Factorial int " + factorial(4)); // [1, 120, 24, 1, 6, 2]

        System.out.println(countPrimeNumbers(intArr));
        findSecondGreatestAndSmallest(intArr);

        System.out.println(factorial(5));
        int[] arr3 = {2, 3, 5, 7, 4, 3, 2, 11, 6, 8, 10};
        System.out.println("Prime before " +countPrimeNumbers(arr3));
        System.out.println("Prime mine " + countPrimee(arr3));
        System.out.println("Prime mine " + countPrimeee(arr3));


        String[] strDig = {"aaa", "a", "aa", "aaa", "aa", "bbb", "bb", "a", "b", "b", "a"};
        System.out.println(Arrays.toString(removeDuplic(strDig)));


        String str = "Selenium is the most common UI automation tool.   ";
        reverseEachWord(str);
        System.out.println();

        int num1 = 0, num2 = 1, num3;
        for (int j = 0; j < 7; j++) {
            System.out.print(num1 + "   ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("\n");
    }
}
