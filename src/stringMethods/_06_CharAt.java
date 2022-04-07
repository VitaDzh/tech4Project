package stringMethods;

public class _06_CharAt {
    public static void main(String[] args) {
        /*
        6.	charAt(index)
-	used to find the character at the specified index (position)
-	non-static, call with Object
-	returns char  at specified index
-	it takes an arguments which int (index)
NOTE: it will throw StringIndexOutOfBoundException when the given index does not exist
         */

String name = "John";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

       // System.out.println(name.charAt(4)); // -1 Error, 4 Error
        /*
        Check if the name start with A and print this name starts with A
        print this name is not starting with A
         */
        char firstchar = name.charAt(0); // we can not call methods with primitives!!!!
        // Can not use equalIgnoreCase because it is a String method
        if(firstchar == 'A' || firstchar == 'a') System.out.println("Name starts with A");
        else System.out.println("The name is not starts with A");









    }
}
