package utilities;

public class CharacterHelper {


    public static boolean isSpace(char c) {
        return (c == ' ');
    }

    public static boolean isDigit(char c) {
        return (c >= 48 && c <= 57);
    }

    public static boolean isUppercase(char c) {
        return c >= 65 && c <= 90;
    }

    public static boolean isLowercase(char c) {
        return c >= 97 && c <= 122;
    }

    public static boolean isLetter(char c) {
        return isUppercase(c) || isLowercase(c);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i' || c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I';
    }

    public static boolean isConsonant(char c) {
        return ((isUppercase(c) && isLowercase(c)) && (!isVowel(c)));


    }
}
