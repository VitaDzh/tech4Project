package casting;

public class AkinRecap {
    public static void main(String[] args) {
        String s = "10.5"; // sout(s + 2) output --> 10.52
        Double d1 = Double.valueOf(s); //output 12.5 (here u are doing extra convertion that is HAS NO SENSE)
        double d3 = Double.parseDouble(s); // output 12.5 ()



    }
}
