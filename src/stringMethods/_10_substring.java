package stringMethods;

public class _10_substring {
    public static void main(String[] args) {
/*
-	used to extract a substring from a larger String
-	non-static, call them with Objects
-	return String
-	one method can take one argument (int beginIndex) takes from beginning index and till the end of String, other method take 2 arguments(int beginIndex, int endIndex)
NOTE: begin index is inclusive, but endIndex is exclusive
NOTE: if your beginIndex is = to endIndex, then it will return empty String
NOTE: if your beginIndex is less that endIndex, then it will throw StringIndexOutOf …….error

 */


        String result = "About 3,520,000,000 results (0.82 seconds)";
        String num = result.substring(6, 19); //end index should be number from 0 to end index
        System.out.println(num);
        System.out.println(result.substring(result.length()-1));

        System.out.println(result.substring(28)); // (0.82 seconds). we do not need to specify the end index, because it goes till the end
        System.out.println(result.substring(28, result.length())); // other way when we need to find something in the middle
        System.out.println(result.substring(result.indexOf('('))); // the best
        System.out.println(result.substring(result.lastIndexOf('0') - 1)); // counting from 0 to space before (
        System.out.println(result.substring(result.length() - 14)); // counting from the end to (
        System.out.println(result.substring(result.indexOf("results") + 8)); // counting from result

        String name5  = "Lionel";
        System.out.println(name5.substring(3,1)); // Exception error
        System.out.println(name5.substring(3, 3));// empty string ""




    }
}
