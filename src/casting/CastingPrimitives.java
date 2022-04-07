package casting;

public class CastingPrimitives {
    public static void main(String[] args) {

        /*
        double > float > long > int > char > short > byte -EXPLICIT(when assigning a smaller data type into a bigger)
        int=char
         */
        int myInt =  32;
        long myLong = myInt; // implicit casting smaller into bigger

        myInt = (int) myLong; //explicit casting bigger into a smaller Data Type

        int mySecondInt = 'B'; // implicit casting
        char myChar = (char) 56; // explicit casting . So, we do not need to explicit because int and char are equal
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4;


        short myShort = (short)myChar;
        char myThirdChar = (char) myShort; //short is smaller, char is the bigger. it should hold the data.

        /*
        32767
        -32768
        2147483647
        -2147483648
        char does not have a negative value. u can not put negative values into a char.
         */
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char testing = 78; // if value is positive we do not have to cast
        char test = (char) -78; // if negative u cast to char

        byte number1 = 45;
        int number2 = number1; // automatically, it is implicit

        int num1 = 5;
        double num2 = num1; // automatically, because it converts smaller into bigger

        double d1 = 100.00;
        float f1 = (float) d1; // we have a bigger data type and we want bigger data type to convert into smaller data type

        short a = 5;
        byte b = (byte)a;

        float q = 7;
        int h = (int)q;

        int l = 7;
        short k = (short)l; // from smaller to bigger. I want to convert int to short, so I use short to cast

        byte numb1 = 5;
        int numb2 = numb1; // implicit we don't it put parenthesis

        double num3 = 13.6;
        float num4 = (float) num3;

        int num5 = 45;
        short num6 = 34;
        char c = (char) num5; //we are converting to char
        c = (char) num6; // chars always positive, that's why we always cast it











    }
}
