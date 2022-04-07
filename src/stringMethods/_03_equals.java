package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
/*
	equals()
-	compares 2 Strings, tells their equal or not.
-	Non-static. We call it with Objects or values
-	Return type, returns Boolean : TRUE or FALSE
-	Case-sensitive
-	Takes Strings as an arguments

 */
// equals compare Strings and return boolean values TRUE or FALSE
        System.out.println("melda".equals("Melda")); // false
        String name1 = "O";
        String name2 = "L";
        String name3 = "L";
        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true

        String str1 = "Hello";
        String str2 = str1;
        boolean b = !(str1.equals(str2)); // false, cause we used !
        System.out.println(b); // false

        System.out.println(!"abc".concat("xyz").equals("abcx" + "yz")); // First we check what is in parentesis, then ! makes true false

    }
}
