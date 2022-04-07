package stringMethods;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {
/*
4.	equalsIgnoreCase()
-	compares 2 Strings, tells their equal or not.
-	Non-static. We call it with Objects or values
-	Return type, returns Boolean : TRUE or FALSE
-	NOT Case-sensitive !!!! differance between equals
-	Takes Strings as an arguments

 */
        System.out.println("Hello".equals("hello"));// false
        System.out.println("hello".equalsIgnoreCase("HELlo")); // true
        System.out.println("Hello".equalsIgnoreCase(" hello")); // false, because we have a space, it makes String with 6 characters

        String s1 = "Good";
        String s2 = "GOOD";

        boolean b = s1.equalsIgnoreCase(s2); // true
        System.out.println(b);



    }
}
