package operator.relationalOperators;

public class RElationalOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a ==b;
        boolean isANotEqualToB = a !=b;

        System.out.println("a = b: " + isAEqualToB);
        System.out.println("a != b: " + isANotEqualToB);

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a < b : " + isASmallerThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);
        System.out.println("a < b : " + isASmallerOrEqualThanB);

       // boolean bool = x + y == --z //3+5=9-1 true

    }
}
