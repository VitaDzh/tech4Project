package loops.doWhileLoops;

import java.util.Random;

public class UnderstandingOfDoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean(); // will come as true or false. If true -it is infinite

        //While Loop
        while(b){
            System.out.println("It is true");
            b = random.nextBoolean();
        }
        System.out.println("End of the program!");


        // Do while Loop
        boolean b2 = false;
        do {
            System.out.println("true");
            }
            while (b2) ;








        }

    }

