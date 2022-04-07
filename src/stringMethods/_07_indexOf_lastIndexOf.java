package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        7.	indexOf(anyChar), indexOf(anyString)
-	used to find the position of the first or last index of specified character in string or string
-	non-static
-	returns position as an int
-	take either String or char as arguments
NOTE: if the given char or String doe not exists then returns  -1.
NOTE: if we are looking for an index of String and it exist it will return the first index of match

         */



        String sentence = "I like Chicago and Miami more than any other cities";
        System.out.println(sentence.indexOf('C')); // 7
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); // 45
        System.out.println(sentence.indexOf("Chicago")); // 7 takes first letter of the word
        System.out.println(sentence.indexOf("Miami")); // 19 takes first letter of the word
        System.out.println(sentence.indexOf("")); // empty --> 0. shows the first empty string before first letter
        System.out.println(sentence.indexOf("a", 6)); //searching for a will start after index 5

    }
}
