package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {
        /*
        Write a program which will take two numbers as a STRING
        and get the avr of them and print it out
        Input: String num1 = "23";
        String num2 = "25";
        Output: 24
         */
        //First way
        String num1 = "23";
        String num2 = "25";
        int number1 = Integer.parseInt(num1); // Converting path: String-->Integer-->int
        int number2 = Integer.parseInt(num2);
        System.out.println((number1 + number2) / 2);

        //Second way
        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.valueOf(num2);
        //Integer num2Integer = Integer.parseInt(num2); String -->int-->Integer
        System.out.println("Average = " + (num1Integer + num2Integer)/2);

        // String to double, double to String
        /*

         */
        //me doing
        String save = "390";
        String day = "15.60";
       double save1 = Double.parseDouble(save); //we use parse with primitives, not valueOf
       double day1 = Double.parseDouble(day);
       String save01 = save1 + "";
       String day01 = day1 + "";
       String save001 = String.valueOf(save1);
       String day001 = String.valueOf(day1);

        System.out.println((int) (save1 / day1));
        System.out.println(save001 + " " + day001);


    }
}
