package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Write a program that is gonna create 3 random numbers
        between 45 - 90. Print out all the numbers max, min, and middle between these numbers
        56, 78, 63
        output:
        num1 = 56
        num2 = 78
        num3 = 63
        num4 = 45
        min =
        max
        middle
        1.Create random numbers
        2. Find max and min
        3. Find middle
         */
        int num1 = (int) (Math.random() *46) + 45;
        int num2 = (int) (Math.random() *46) + 45;
        int num3 = (int) (Math.random() *46) + 45;

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int mid;

        if(num1 !=max && num1 != min){ // num1 is middle, if it is NOT max AND NOT min that means num1 is middle
         mid = num1;
        } else if(num2 !=max && num2 != min){ //num2 and num3 mid possibly is going to be here
            mid = num2;
        }else{ // num3 possibility is here
            mid = num3;
        }
        System.out.println("num1 = " + num1 +
                "num2 = " + num2 +
                "num3 = " +num3 );







    }
}
