package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*

         */
        boolean even = false;
        int firstEven = 1;
        for (int n: numbers) {
            if(n % 2 == 0) {
                even = true;
                firstEven = n;
                break;
            }
        }
        if(!even) System.out.println("There is no even number in this array");


        boolean evenn = false;
        boolean odd = false;

        for (int n: numbers) {
            if(n % 2 == 0 && !evenn) {
                evenn = true;
                System.out.println("even " + n);
            }
            else if(!odd){
                odd = true;
                System.out.println("odd " + n);
            }
            if(evenn && odd) break;
        }
    if(!evenn) System.out.println("There is no even");
    if(!odd) System.out.println("There is no odd");
    
    }
}
