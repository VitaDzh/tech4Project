package exceptions;

public class Example02 {
    public static void main(String[] args) {
        int number = 45;


        //System.out.println(",zdkjghf");

        try{
            String s = null;
            System.out.println(s.startsWith("lkhj"));
            System.out.println(number / 0); // 15
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End of the program!");


    }
}
