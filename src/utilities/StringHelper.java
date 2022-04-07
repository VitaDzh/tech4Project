package utilities;

public class StringHelper {
    public static String getMiddle(String str) {
        // if(str.length() % 2 == 0) return "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
        //  String middle = "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
        // return "" + str.charAt(str.length()/2); //we converted char to a String with empty String, because charAt returns char

        // This is turnery operator. Condition --> if it is even
        return (str.length() % 2 == 0) ? "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2) : "" + str.charAt(str.length() / 2);
    }











}
