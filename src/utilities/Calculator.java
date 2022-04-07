package utilities;

public class Calculator {
    /*
    What do we need to create a method
    1. proper name
    2. decide it is accessibility level (public). u can call it in any package
    3. decide it is accessibility way (U want to call it with Class name or Object name)
    --> static (if u want to call it with Class name)
    --> non-static (if u want to call with Object name)
    4. decide if it return something or not
    --> if yes, than what is it return
    --> if not return put void
    5. does it take any arguments (should we put anything in parentesis), how many
    NOTE: if your method is not void meaning it is returning something u must use return keyword in the body of the method
    NOTE: every method must have a body, what means must have curly braces
    NOTE: if your method returns int then the variable used next to return keyword body Must be an int(Should be used same data type)
    NOTE: we can have multiple methods sharing the same name in the same class, only if they have different arguments(amount, data types)
    NOTE: do not ever try to create method inside of another method

    Defining the accessibility of the methods
    - public --> u can use everywhere in the project
    - private --> u can use it only in the same class
    - default --> u can use it only in the same package
    - protected -->

    Deciding method to be static or non-static
    - if u want to call your method with class name, then declare as static method
    Math.max(), Math.min(), println(), print(), valueOf(), parseInt()
    - if u want to call it with Object name, then declare it non-static (do not mention static in your method name when u create it)
    Scanner --> scan.nextInt();
    NOTE: when u make method belongs to Object it is more specific
     */
    public static double divide(double num1, double num2) {
        return (num1 / num2);
    }

    public static int divide(int num1, int num2) {
        return (num1 / num2);
    }


    //Create a method that finds the sum of 2 int numbers and returns it
    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }

    //Create a method that finds the sum of 2 double numbers and returns it
    public static double sum(double num1, double num2) {
        return (num1 + num2);
    }

    //Create a method that finds the absolute difference of 2 int numbers and returns it
    public static double absolute(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    //Create a method that finds the absolute difference of 2 double numbers and returns it
    public static double absolute(double num1, double num2) {
        return Math.abs (num1 - num2);
    }

    //Create a method that finds the product of 2 int numbers and returns it
    public static double product(int num1, int num2) {
        return (num1 * num2);
    }

    //Create a method that finds the product of 2 double numbers and returns it
    public static double product(double num1, double num2) {
        return (num1 * num2);
    }

        public static void printMaxOf4 (int n1, int n2, int n3, int n4){
            System.out.println (Math.max (Math.max(Math.max(n1, n2), n3), n4));
        }
        public static int maxOf4 (int n1, int n2, int n3, int n4){
        return (Math.max (Math.max(Math.max(n1, n2), n3), n4));
        }

        public static double findAbsOf2(double n1, double n2) {

            if (n1 > n2) { //n1 - n2
                return n1 - n2;
            } else if (n2 > n1) { // n2 - n1
                return n2 - n1;
            } else {
                return 0; // we put it instead of else
                //n1 == n2 --> 0
            }
        }

            public static int findAbsOf2(int n1, int n2){
                return (n1 > n2) ? n1 - n2 : n2 -n1;
            }

         








    }

