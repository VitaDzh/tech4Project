package ifElseStatements;

public class FindGreatestOf2Numbers {
    public static void main(String[] args) {
        //Find the random between 0 and 10
        //Math.random() returns between 0.0 and 1.0 (0.0 is included but not 1.0)
        //How many numbers I need than multiply and print out
        //What is greater
        int num1 = (int)(Math.random() * 11), num2 = (int)(Math.random() * 11);
        System.out.println(num1);
        System.out.println(num2);




        if(num1 > num2){
            System.out.println("The greatest is " + num1);
        }
        else{ //here we have num1==num2, num2>num1
            System.out.println("The greatest is " + num2);
        }

// Find great


    }
}
