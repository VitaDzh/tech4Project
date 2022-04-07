package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int number = 150;
        byte b = (byte) number;
        System.out.println(b); // 150-127 = 23-->-128-23= -106(because 0 also counts.)



    }
}
