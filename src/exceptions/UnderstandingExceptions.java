package exceptions;

public class UnderstandingExceptions {
    public static void main(String[] args) {

        /*Unchecked exception are the ones u get when u run the program:
        for the compiler it is OK, do not show any problem
         */
        String name = "John";
        //How to handle the exception

        //How to handle the exception
        try{
            System.out.println(name.charAt(7)); //  System.out.println(name.charAt(7)); // exception
        }
        catch(StringIndexOutOfBoundsException exception){
            System.out.println("An exception is caught"); // we put all the info about exception we get: where, why, what exception
        }



        System.out.println("jhasgd,jfg"); // this will not be executed

    }
}
