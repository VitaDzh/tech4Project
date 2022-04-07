package loops.forLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {

        /*
        numb from 1 to 10(includ)
        startPoint: 1
        endPoint: 10
        update: post increment
         */
        for(double i = 0; i <= 100; i += 0.5) { //
            System.out.println(i);
        }
        for(int i = 10; i >= 1; i--){ // from 10 to 1
            System.out.println(i);
        }
        for(int i = 100; i >= 0; i--){ // from 100 to 0
            System.out.println(i);
        }


        for(int i = 0; (i <=10) && (i % 2 == 0); i++ ){
            System.out.println(i);
        }








    }
}
