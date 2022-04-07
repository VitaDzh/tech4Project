package operator.arithmeticOperators;

public class Exercise1 {
    public static void main(String[] args){

        //create 2 int variables one bigger than the other
        //then do 5 arithmetic operations for them


        int num1 = 21;
        int num2 = 4;

        int add = num1 + num2;
        int sub = num1 / num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(remainder);


        // Other way to do this and FASTER:
        int smallNum = 4;
        int bigNum = 21;
        // 20 is the closest number divided by 4, we will see the leftover immediately when we use remainder

        System.out.println("Addition = " + (bigNum % smallNum));




    }
}
