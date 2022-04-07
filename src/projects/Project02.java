package projects;

import java.util.Calendar;
import java.util.Scanner;

public class Project02 {
    public static void main(String[] args){

        //-----TASK 1------
        /*
        -Write a program that asks user to enter their 3 numbers
        -Then multiply these numbers and print the result in the format:
        -The product of the numbers entered is = {number1}*{number2}*{number3}
         */
        Scanner project02 = new Scanner(System.in);
        System.out.println("TASK 1");
        System.out.println("Please enter 3 numbers: ");
        int usersFirstNumber = project02.nextInt();
        int usersSecondNumber = project02.nextInt();
        int usersThirdNumber = project02.nextInt();
        int multiplying = usersFirstNumber * usersSecondNumber * usersThirdNumber;

        System.out.println("The product of the numbers entered is = " + multiplying);
        System.out.println();

        //-----TASK 2-----
        /*
        -Write a program that asks user to enter their first name, last name and year of birth.
        -Then calculate the age by subtracting the year of birth from current year we are in.
        -Print result in the format: {firstName} {lastName}’s age is = {currentYear} – {yearOfBirth}.
         */
        System.out.println("TASK 2");
        System.out.println("What is your first name? ");
        project02.nextLine();
        String firstName = project02.next();

        System.out.println("What is your last name? ");
        String lastName = project02.next();

        System.out.println("What is your year of birth? ");
        int yearOfBirth = project02.nextInt();
        int currentYear = 2022;

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBirth));
        System.out.println();


        //----TASK 3-----
        /*
        -Write a program that asks user to enter their full name and weight as kg.
        -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
        -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
         */
        System.out.println("TASK 3");
        System.out.println("What is your full name? ");
        project02.nextLine();
        String fullName = project02.nextLine();

        System.out.println("What is your weight? ");
        double kgWeight = project02.nextDouble();

        System.out.println(fullName + "'s weight is = " + (kgWeight * 2.205) + " lbs.");
        System.out.println();


        //----TASK 4----
        /*
        -Write a program that asks 3 students to enter their full name and age
        -Then print each student’s age with their full names as {fullName}’s age is {age}.
        -And, calculate the average age for these students and print result as The average age is {averageAge}.
        -And, find the eldest age and print result as The eldest age is {eldestAge}.
        -And, find the youngest age and print result as The youngest age is {youngestAge}.
         */
        System.out.println("TASK 4");
        project02.nextLine();
        System.out.println("What is your full name? ");
        String students1FullName = project02.nextLine();
        System.out.println("What is your age? ");
        int students1Age = project02.nextInt();

        project02.nextLine();
        System.out.println("What is your full name? ");
        String students2FullName = project02.nextLine();
        System.out.println("What is your age? ");
        int students2Age = project02.nextInt();

        project02.nextLine();
        System.out.println("What is your full name? ");
        String students3FullName = project02.nextLine();
        System.out.println("What is your age? ");
        int students3Age = project02.nextInt();

        System.out.println(students1FullName + "'s age is " + students1Age);
        System.out.println(students2FullName + "'s age is " + students2Age);
        System.out.println(students3FullName + "'s age is " + students3Age);
        System.out.println("The average age is " + ((students1Age + students2Age + students3Age) / 3) );
        System.out.println("The eldest age is " + Math.max(Math.max(students1Age, students2Age), students3Age));
        System.out.println("The youngest age is " + Math.min(Math.min(students1Age, students2Age), students3Age));



    }
}
