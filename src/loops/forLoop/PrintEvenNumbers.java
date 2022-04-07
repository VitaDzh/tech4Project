package loops.forLoop;

public class PrintEvenNumbers {
    public static void main(String[] args) {
/*
        Write a Java program to print only even numbers
        from bt 0 to 10 (0 and 10 are included)
 */
        /*
        for(int i = 0; i <=10; i += 2 ){ // it only works with start point 0, if your start point is ODD it will not work
            System.out.println(i);
        }
        */

        //SECOND WAY
        for(int i =0; i <= 10; i += 2){
        if(i % 2 == 0)System.out.println(i);    // this is the best when u do not have created method
        }
        /*
        THIRD WAY
        for(int i =0; i <= 10; i += 2){
        if(MathHelper.isEven(i)) System.out.println(i);
        }
        FOURTH WAY
        for(int i = 0; i <= 10; i++){ // 1, 2
        System.out.println(i++); // 1, 2
        }
         */






    }
}
