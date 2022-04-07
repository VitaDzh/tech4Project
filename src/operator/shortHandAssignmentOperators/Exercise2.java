package operator.shortHandAssignmentOperators;

public class Exercise2 {
    public static void main(String[] args) {
        /*Create 2 int variables
      int a = 8, b = 3;
      Then, find their sum, subtraction, multiplication, division
      and remainder by using shorthand operators, and assign those
      values into a.
      1.Create variables
      2.Use shorhand assignments
      3. Print them out
         */

        int a = 8;
        int b = 3;
        System.out.println("+ " + (a += b)); // a = 11
        System.out.println("- " + (a -= b)); // a = 8
        System.out.println("* " + (a *= b)); // a = 24
        System.out.println("/ " + (a /= b)); // a = 8
        System.out.println("% " + (a %= b)); // a 2




    }
}
