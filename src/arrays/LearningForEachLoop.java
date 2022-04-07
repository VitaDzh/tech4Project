package arrays;

public class LearningForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'a', ' ', 'b'};
        System.out.println(chars.length);

        /*
        Print each element with a message
        Element 1 = A
        Element 2 = B
         */

        //FORI Loop
        for(int i = 0; i<=2; i++){
            System.out.println("Element " + i + " = " + chars[i]);
        }
        //FOR EACH
        int i = 1;
        for(char element: chars){
            System.out.println("Element " + i + " = " + element);
            i++;
        }





    }
}
