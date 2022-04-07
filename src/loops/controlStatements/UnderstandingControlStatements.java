package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {

        /*
        Write a program to print all nums from 1 to 25
         */
        for (int i = 1; i <= 25; i++){
            System.out.println(i);
        }

        for (int i = 1; i <= 25; i++){
            if(i % 10 != 0)
            System.out.println(i);
        }

        //using continue control statement to skip numbers that can be divided by 10
        for(int i = 1; i <= 25; i++){
            if(i % 10 == 0) continue;
            else System.out.println(i);
        }

//
        for(int i = 1; i <= 25; i++) {
            if (i % 10 == 0) {
                continue;
            } else System.out.println(i);
            if (i >= 15) {
                break;
            }
        }











    }
}
