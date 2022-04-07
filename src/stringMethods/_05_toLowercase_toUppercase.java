package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {
        /*
        5.	toLowerCase() and toUpperCase()
-	used to convert letters of String to Upper case or Lower case
-	non-static. We call them with Object or values
-	return, they return the modified string object back with upper or lower cases
-	DO NOT take any arguments

         */
        String s1 = "HELLO world";

        System.out.println(s1); // HELLO world
        System.out.println(s1.toLowerCase()); //hello world
        System.out.println(s1.toUpperCase()); //HELLO WORLD --> converts everything to uppercase
        System.out.println("lzdhflhalirefy".toLowerCase());

        String sentance = "I paid !100.9 to buy airpods";
        String s2 = sentance.toLowerCase(); // "i paid !100.9 to buy airpods"
        String s3 = sentance.toUpperCase(); // "I PAID !100.9 TO BUY AIRPODS"
        System.out.println(s3.toLowerCase().toUpperCase()); // it was a n upper case, I converted it to lower, then to upper again





    }
}
