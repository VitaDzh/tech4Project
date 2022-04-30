package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
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

  

    public static int countPrime(int[] arr){
        int countPrime = 0;
        for(int number : arr){
            if(number > 1 && number % 2 != 0 || number == 2) countPrime++;
        }return countPrime;
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

    public static int countPrimeNumberss(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number == 2 || number == 3) count++;
            else if (number > 3 && number % 2 != 0) count++;
        }
        return count;
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

    public static int factorial(int number){
        if(number == 0 || number == 1) return 1;
        else {
            int temp = number;
            for (int i = 2; i < temp; i++) {
                number *= i;
            }
        }
        return number;
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

    public static void main(String[] args) {
        System.out.println(secondMaxValue(new int[]{-5, 4, 1, 10, 2})); // 4
        int[] intArr = {-5, 4, 1, 10, 2};
        findSecondGreatestAndSmallest(intArr);

        System.out.println(factorial(5));
        int[] arr3 = {2, 3, 5, 7, 4, 3, 2, 11, 6, 8, 10};
        System.out.println(countPrime(arr3));
        System.out.println(countPrimeNumbers(arr3));
        System.out.println(countPrimeNumberss(arr3));


        String[] strDig = {"aaa", "aa", "bbb", "bb", "b", "a"};
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
