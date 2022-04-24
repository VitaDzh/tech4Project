package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Before: " + str);

        str = str.replaceAll("[aeiouAEIOU]", "\\$");

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]", "");

        String str5 = " abc 123 $#^ ";
        System.out.println(str5.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
