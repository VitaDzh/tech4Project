package exceptions;

public class TryCatchFinallyBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(3 / 0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Anyway will print a message");
        }

        System.out.println("End of the program!");




    }
}
