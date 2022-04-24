package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+","hello")); // true- contains one or more letters
        System.out.println(Pattern.matches("[a-zA-Z]{3,}","helloclass")); // true
        System.out.println(Pattern.matches("[a-zA-Z]{3,}","hello class")); // false, because there is a space in a String
        System.out.println(Pattern.matches("[a-zA-Z ]{3,}","hello class")); // true, because we add a space
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", " "));

        /*
        Write a regex pattern for a phone number with the format of:
        (XXX)-XXX-XXXX
         */
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(123)-456-7890"));

        System.out.println(Pattern.matches("\\(^[1-9][0-9]{2}\\)-^[1-9][0-9]{2}-[\\d]{4}", "(123)-456-7890"));

    }
}
