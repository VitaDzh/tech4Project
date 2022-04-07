package utilities;

public class MathHelper {

    //Create a method that takes 3 ints and returns the max
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3)); //in return methods there is always return keyword
    }
    //method overloading
        public static double maxOfThree(double num1, double num2, double num3) {
            return Math.max(num1, Math.max(num2, num3)); //in return methods there is always return keyword

        //method overloading - same method names, but different arguments
    }

    /*
    Create a method that takes 3 byte numbers and return the smallest
     */

    public static byte minOfThree (byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num2, num3));
    }
  /*
  pls create a method that takes an int as an argument and
  returns the true if it is even
     */
   public static boolean isEven(int a) {
       return a % 2 == 0;
   }
   // we do not need to use if else, because if it is true
       // it will return true. if it is false it will return false

       /*
       create method called isOdd() that takes one int parameter and returns
       true if the number is odd, false otherwise
        */
       public static boolean isOdd(int a) {
           return a % 2 != 0;
       }
//
    public static boolean isPositive(int a){
          // if(a > 0) return true;
           //else return false;
           return a > 0;
    }
// create a method called isNegative
    public static boolean isNegative(int a){
           return a < 0;
    }

    //Create another method called isZero
    public static boolean isZero (int a){
           return a == 0;
    }

   }



