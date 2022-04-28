package recursion;

public class _02_ProductOfNumbers {

    /*

     */
    public static int recursiveProduct(int n){
        if(n > 1) return n * recursiveProduct(n-1);
        return 1;
    }

    public static int recursiveProduct2(int n){
        if(n <= 0) return 0;
        if(n==1) return 1;
        return n * recursiveProduct(n-1);

    }


    public static void main(String[] args) {
        System.out.println(recursiveProduct(5));
    }





}
