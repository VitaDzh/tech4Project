package stringMethods;

public class _02_concat {
    public static void main(String[] args) {// main method does not belong to any class. we can call it anywhere
        /*
       	concat()
-	used to combine multiple Strings and forms a new one
-	non-static. We call it with an Object name or Object value, not a Class name
-	return type: we can store it in a variable, so it comes with a result. It returns a new String that is a combination of a few Strings. We can put it in a System.out.println
-	it takes String as an args.

         */
        String s1 = "Tech";
        String s2 = "Global";
        String s3 = s1.concat(s2); // String s3 = s1 + s2
        System.out.println(); // output TechGlobal
        System.out.println(s3.concat(" School")); // TechGlobal School
        System.out.println("Hello".concat(" World")); // Hello World
        System.out.println("Hello".concat (" ") + "World"); //have no sense to put space this way!!!!!

    }
}
