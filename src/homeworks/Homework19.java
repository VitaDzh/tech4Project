package homeworks;

import java.util.Arrays;

public class Homework19 {
    /* TASK 1
    -Create a method called noDigit()
    -This method will take one String argument and it will return a new
    String with all digits removed from the original String
     */
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String noDigit2(String str) {
        String noDig = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) noDig += str.charAt(i);
        }
        return noDig;
    }

    public static String noDigit1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }


    /* TASK 2
    -Create a method called noVowel()
    -This method will take one String argument and it will return a new
    String with all vowels removed from the original String
     */
    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    /* TASK 3
    -Create a method called sumOfDigits()
    -This method will take one String argument and it will return an
    int sum of all digits from the original String.
    NOTE: Return zero if there is no digits in the String
     */
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char s : str.toCharArray()) {
            if(!str.matches(".*[\\d]+.*")) return 0;
            if (Character.isDigit(s)) sum += Integer.parseInt("" + s);
        }
        return sum;
    }

    /* TASK 4
    -Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean true
    if there is an uppercase letter and false otherwise.
     */
    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        } return false;
    }

    public static boolean hasUpperCase2(String str){
        return !str.equals(str.toLowerCase());
    }

    public static boolean hasUpperCase3(String str){
        return str.matches("^.*[A-Z].*$");
    }

    /* TASK 5
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle int.
     */
    public static int middleInt(int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }

    public static int findMiddleOf3Numbers(int a, int b, int c){
        if(a == b || b == c) return b;
        else if(a == c) return a;

        int greatest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        if(a != greatest && a != smallest) return a;
        else if(b != greatest && b != smallest) return b;
        return c;
    }

    /* TASK 6
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new array with
    all 13 replaced with 0.
    NOTE: Assume length will always be more than zero.
    */
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }


    /* TASK 7
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will
    return the array with every number replaced with their factorials.
    NOTE: Assume length will always be more than zero.
    NOTE: 0! is equals to 1
     */
    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int factor = 1;
            for (int j = arr[i]; j >= 2; j--) {
                factor *= j;
            }
            arr[i] = factor;
        }
        return arr;
    }

    /* TASK 8
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as letters
    at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
     */
    public static String[] categorizeCharacters(String str) {
        String[] categorized = {"","",""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) categorized[1] += str.charAt(i);
            else if (Character.isLetter(str.charAt(i))) categorized[0] += str.charAt(i);
            else if (!(Character.isLetterOrDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i))))
                categorized[2] += str.charAt(i);
        }
        return categorized;
    }



    public static void main(String[] args) {
        System.out.println("noDigit -->> " + noDigit("a1b2c3"));
        System.out.println("noDigit2 -->> " + noDigit2("lakdjbfkajhdkl902387502349162-"));
        System.out.println("noVowel -->> " + noVowel("a;lhdshoooiiue"));
        System.out.println("sumOfDigits -->> " + sumOfDigits("ksdggs"));
        System.out.println("sumOfDigits2 -->> " + sumOfDigits("ksdggs1122"));
        System.out.println("hasUpper -->> " + hasUpperCase("kajshhfGT"));
        System.out.println("does not haveUpper -->> " + hasUpperCase("kajshhf"));
        System.out.println("hasUpper2 -->> " + hasUpperCase2("jhdgffjGTgadlf"));
        System.out.println("does not haveUpper2 -->> " + hasUpperCase2("lakdh"));
        System.out.println("hasUpper3 -->> " + hasUpperCase3("jhdgffjGTgadlf"));
        System.out.println("does not haveUpper3 -->> " + hasUpperCase3("lakdh"));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));

        int[] arr = {13, 0, 13, 5, 7};
        System.out.println("no13 -->>" + Arrays.toString(no13(arr)));
        System.out.println("factorial -->>" + Arrays.toString(arrFactorial(arr)));
        System.out.println("categorizeCharacters -->> " + Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println("categorizeCharacters2 -->> " + Arrays.toString(categorizeCharacters("12ab$%3c%")));







    }
}
