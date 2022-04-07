package loops.nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++ ){
            System.out.println(i);

            for(int j = 1; j <= 5; j++){
                System.out.println("\t" + j);
            }
        }
/*
        1
           5
           4
           3
        2
           5
           4
           3
        3
           5
           4
           3

 */
        for (int i = 1; i <= 3; i++){
            System.out.println(i);
            for(int j = 5; j >= 3; j-- ){
                System.out.println("\t" + j);
            }
        }








    }
}
