package recursion;

public class _03_ReverseString {

    /*
    Write a recursive method to reverse a given String
    reverse("pple") + A
    reverse("ple") + p+A
    reverse("ple") + p+p+A

     */

    public static String reverseString(String str){
        if(str.length() <= 1) return str;

        return reverseString(str.substring(1) + str.charAt(0));
    }



    public static void main(String[] args) {
        String str = "Apple";
    }

}
