package ifElseStatements.ifElseIFStatement;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        /*
Ask user to enter their age and weight and if they are older than
18 print out "You are old enough to drive" else "You are not old enough
for driving", if they are heavier than 150 pounds print out "You are heavier
than 150 pounds" else "You are lighter than 150 pounds"

input:
age = 15, weight = 159
output:
"You are not old enough for driving"
"You are heavier than 150 pounds"
1.Create Scanner
2.Ask age and weight
3. Create if else statement for age and weight
4. Put the proper action for all possibilities
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your age: ");
        int age1 = scan.nextInt();
        int age2 = scan.nextInt();
        System.out.println("Enter your weight: ");
        double weight1 = scan.nextDouble();
        double weight2 = scan.nextDouble();

        if (age1 >= 18) {
            System.out.println("\"You are old enough to drive\"");
        } else {
            System.out.println("You are not old enough\n" +
                    "for driving\"");
        }
        if (weight1 > 150.0) {
            System.out.println("BAD");
        } else if (weight1 == 150.0) {
            System.out.println("u r 150 lb");
        } else {
            System.out.println("Good for u");
        }


    }
}
