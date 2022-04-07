package loops.whileLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        Write a program that prints numbers from 1 to 7(inc)
         */

        for(int i = 1; i <= 7; i++){
            System.out.println(i);
        }
        int a = 1;
        while(a <= 7){
            System.out.println(a);
            a++; // if we will not put a++, th program will print 1111111111 ....infinite i
        }








    }
}
