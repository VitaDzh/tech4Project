package characterClass;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {
        //One way
        char c = '9';
        boolean b = Character.isDigit('9');
        System.out.println(b);

        //Another way
        System.out.println(Character.isDigit('9')); // true

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true

        char c3 = 'B';
        String s = "AEOUIaeiou";
        System.out.println(s.contains(c3 + "")); // true

        char c4 = 'a';
        boolean isC4Viwel = false;  // to store it here u can get info about true and false result. FLAG LOGIC
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c4)
                isC4Viwel = true;
            break;   // it will stop when find a true and will nor check the rest
        }














    }
}
