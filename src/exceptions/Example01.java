package exceptions;

public class Example01 {
    public static void main(String[] args) {

        /*
        handle the exception and report with a message
         */
        String[] names = {"Alex", "John", "Max"};

        try{
            System.out.println(names[-5]);
        }
        catch(Exception e){
            e.printStackTrace();
        }



    }
}
