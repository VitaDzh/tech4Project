package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /*
13.	replace()
-	to replace char or string with another char or string
-	non-static, call it with object
-	return char or string
-	takes 2 arguments char or string

         */

        String sentance = "Can I can a can?";
        System.out.println(sentance.replace("can", "xxx"));

        String s = "banana";
        System.out.println(s.replace('a', '$'));






    }
}
