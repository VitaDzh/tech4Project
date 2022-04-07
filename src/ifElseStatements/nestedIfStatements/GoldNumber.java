package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {

/*
Write a program that generates a random number bt -50 and 50
if number is positive, then we will win 10 points
if number is more than 25, then we will win extra 10 points
if number is -7, then we will win extra 10 points
lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
1. Create random
2.
//positive check
//more than 25
//-7
//7
//negative
//less than -25
*/


        int random = (int)(Math.random() * 101) -50;
        System.out.println(random);
        if(random > 0 ){
            System.out.println("won 10 points");
            if(random > 25){
                System.out.println("won extra 10 points");
            }
            else if(random == 7){ //if they CANNOT be present at the same time they are linked (use if else if else)

                System.out.println("extra 100 points");
            }
        }
        if(random < 0) {
            System.out.println("0 points");
            //if they CANNOT be present at the same time they are linked (use if else if else)
            if (random == -7) {
                System.out.println("won extra 10 points");
            }else if (random == -25) {
                    System.out.println("0 points");
                }
            }
        }


    }

