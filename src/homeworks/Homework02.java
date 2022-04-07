package homeworks;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args){

        /* Task-1
        1.Write a program that asks user to enter their first name, last name,
          age, email address, phone number, and address in separate statements.
        2.Store data given from user in proper data types
        3. And, then print the data provided by user
         */

        Scanner usersInput = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = usersInput.next();
        System.out.println("Last Name: ");
        String lastName = usersInput.next();
        usersInput.nextLine();
        System.out.println("Age: ");
        int age = usersInput.nextInt();
        usersInput.nextLine();
        System.out.println("emailAddress: ");
        String emailAddress = usersInput.nextLine();
        System.out.println("phoneNumber: ");
        String phoneNumber = usersInput.nextLine();
        System.out.println("Address: ");
        String address = usersInput.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". John's age is " + age
                + ". John's email\n" + "address is " + emailAddress + ", phone number " + phoneNumber + ", and address is "
                + address + ".");


        /* Task-2
        1.Write a program that asks user their favorite book, color, and number in separate statements.
        2.Store those data in proper data types then print given data by user ONLY in one print statement
        but it should be in 3 separate lines
         */
        System.out.println("\nWhat is your favorite book? ");
        String favBook = usersInput.next();
        System.out.println("What is your favorite color? ");
        String favColor = usersInput.next();
        System.out.println("What is your favorite number? ");
        int favNumber = usersInput.nextInt();
        System.out.println("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);








    }

}
