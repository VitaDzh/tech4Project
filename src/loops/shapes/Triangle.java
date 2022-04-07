package loops.shapes;

public class Triangle {
    public static void main(String[] args) {


        /*
        A
        AA
        AAA
        AAAA
        AAAAA
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("A");
        }
        System.out.println();
    }


    }
}
