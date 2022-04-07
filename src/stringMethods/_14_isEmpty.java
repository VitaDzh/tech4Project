package stringMethods;

public class _14_isEmpty {
    public static void main(String[] args) {
        /*
        14.	isEmpty()
-	used to check whether a  string is empty or not
-	non-static
-	return true or false

         */

        String name = "John";
        System.out.println(name.isEmpty());// false
        System.out.println(name.replace(name, "").isEmpty()); // true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true
        System.out.println(" ".isEmpty());// false
    }
}
