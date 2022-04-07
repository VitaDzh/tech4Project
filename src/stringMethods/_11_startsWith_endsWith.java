package stringMethods;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {
        /*
11.	startsWith() & endsWith()
-	used to find if the String starts with or ends with another letter or a String
-	non-static, we call it with object
-	return Boolean: true or false
-	take String as an arguments
         */
 String str = "Today is Sunday";
        System.out.println(str.startsWith("Today")); //true
        System.out.println(str.startsWith("today")); //false
        System.out.println(str.endsWith("day")); // true
        System.out.println(str.toUpperCase().endsWith("SUNDAY"));// true, cause we converts everything to Upper first and then ask about end
        System.out.println(str.startsWith("is", 6)); // true










    }
}
