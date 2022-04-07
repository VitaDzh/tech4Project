package casting;

public class StringConverting {
    public static void main(String[] args) {

        int a = 36;
        String numString = String.valueOf(a);

        //To convert to a String we have 2 options :
        /* + (concatenation)
        valueOf() method
         */
        String numStr = a + 45 + ""; // because Java reads from left to right
        String numStri = "" + 45 + a; // output gonna be 4536. takes it like a String from the start
        System.out.println(numStr);
        System.out.println(numStri);








    }
}
