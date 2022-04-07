package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {

        /*
Write a program that generates a random number bt -50 and 50
And check if number is positive first
If number is positive, print "Number is positive"
then also check if number is odd and print "Number is positive and odd"

NOTE: if number is not positive, then you don't need to check if it is odd

PSEUDO
1.Generate a random number bt -50 and 50
2.Check if it is positive, and print message
3.If positive, also check if it is odd and print message
 */

   int random = (int) (Math.random() * 101 -50);
        System.out.println(random);
   if(random > 0){
       //is the number positive here - YES, then check if it is odd
       System.out.println("\"Number is positive\"");
       if(random % 2 != 0){ //checking if it is ODD, can not be divided by 2
           System.out.println("\"Number is positive and odd\"");
       }else{ //If number can be odd and positive at the same time ? - NO, SO they are connected, SO the rest is ELSE
           System.out.println("Number is positive and Even");
       }
   } else{ //checking the number only NEGATIVE
       System.out.println("NEGATIVE");
   }
/*
if (n > 0){
    System.out.println("Positive");
    if(n % 2 != 0){
    System.out.println("positive and odd")
    } else{ System.out.println ("Positive and even")}

}else if (n<0){
    System.out.println("Negative");
    if(n % 2 == 0){
    System.out.println("Negative and even");
    }else{
    System.out.println("Negative and even");
    }
    }else{ //Zero is here and it can also be even
    System.out.println("Zero and even");
}

 */





    }
}
