package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {

        /*
        Write a program ASKS user for 5 of their grades and print out
        their avrg. Take grades a sString
        Input:
        45
        50
        55
        60
        65
        output:
        55
         /*
        Scanner grades = new Scanner(System.in);
        System.out.println("PLs enter your 5 grades: " );
       /* String grade1 = "45", grade2 = "50", grade3 = "55", grade4 = "60", grade5 = "65";
        int g1 = Integer.parseInt(grade1), g2 = Integer.parseInt(grade2), g3 = Integer.parseInt(grade3),
                g4 = Integer.parseInt(grade4), g5 = Integer.parseInt(grade5);
        int g11 = grades.nextInt();
        int g22 = grades.nextInt();
        int g33 = grades.nextInt();
        int g44 = grades.nextInt();
        int g55 = grades.nextInt();

        System.out.println((g11+g22+g33+g44+g55) / 5);

        */

        /*
        Write a program that asks users their balance as a string and asks for 3 transactions as string and
        print out the end result as double
        Input:
        "What is your balance?"
        user 456.7
        "What is your next 3 transactions? "
        user: 34.1, 65.3, 28.4
        OUTPUT: "Your balance is x"
         */

        /* Scanner scan = new Scanner(System.in);
        System.out.println("What is your balance: ");
        String balance = scan.next();
        System.out.println("What is your next 3 transactions ");

        String t1 = scan.next(), t2 = scan.next(), t3 = scan.next();

        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(t1);
        Double t2D = Double.valueOf(t2);
        Double t3D = Double.valueOf(t3);

        System.out.println("Your balance is now = " + (balanceD - t1D - t2D - t3D)
        );

        //Other way SHORTER. Since we use values only once we do not need to store them .we just print them out
        System.out.println("Your balance is now = " + (Double.valueOf(balance) -
        Double.valueOf(scan.next()) - Double.valueOf(scan.next()) - Double.valueOf(scan.next())));
         */


        /*
        Write a program ASK user for full name, age, phone number then
        enter their 3 kids age as string then print out everything plus
        the oldest kid, youngest and the age difference between oldest
        and youngest.

        Program: "Please enter your name"
        User: John Doe
        Program: "Please enter your age:
        User: 45
        Program: "Please enter your phone number:
        User: (123) 123 1234
        Program: "Enter the ages of your kids"
        User:
        12
        22
        17
        Program:
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scan.nextLine();
        System.out.println("Pls enter your age: ");

        String age = scan.next();
        System.out.println("Phone number: ");

        scan.next();
        String phoneNum = scan.nextLine();
        System.out.println("Enter name of your kids: ");

        String age1 = scan.next();
        String age2 = scan.next();
        String age3 = scan.next();
        int age01 = Integer.parseInt(age1), age02 = Integer.parseInt(age2), age03 = Integer.parseInt(age3);
        System.out.println("Your name is, " + name + "your phone number is " + phoneNum + " \nYou are " + age + " years old, "
                + "Your oldest kid is " + Math.max((Math.max(Integer.parseInt(age1), Integer.parseInt(age2))), Integer.parseInt(age3)) +
                " years old" + ",\nyour youngest is " + Math.min((Math.min(Integer.parseInt(age1), Integer.parseInt(age2))),
                Integer.parseInt(age3)) + " difference between youngest and oldest is " + Math.abs((Math.max((Math.max(Integer.parseInt(age1), Integer.parseInt(age2))), Integer.parseInt(age3))) -
                (Math.min((Math.min(Integer.parseInt(age1), Integer.parseInt(age2))), Integer.parseInt(age3)))) + " \nyears");


        /*
         /*
        Write a program ASK user for full name, age, phone number then
        enter their 3 kids age as string then print out everything plus
        the oldest kid, youngest and the age difference between oldest
        and youngest.
        Program: "Please enter your name"
        User: John Doe,     User: Akin Kaya,
        Program: "Please enter your age:"
        User: 45,           User: 29
        Program: "Please enter your phone number:"
        User: (123) 123 1234, User: (864) 123 4531
        Program: "Enter the ages of your kids"
        User:
        12,         15.7
        22,         -32
        17,         Abc
        Program:
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.
         */

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter your name:");
//        String fullName = input.nextLine();
//
//        System.out.println("Please enter your age:");
//        String age = input.next();
//        input.nextLine(); // clearing the spaces!!!
//
//        System.out.println("Please enter your phone number:");
//        String phoneNumber = input.nextLine();
//
//        System.out.println("Enter the ages of your kids");
//        String age1 = input.next(), age2 = input.next(), age3 = input.next();
//        int age1Int = Integer.parseInt(age1), age2Int = Integer.parseInt(age2), age3Int = Integer.parseInt(age3);
//
//        int oldestKid = Math.max(age3Int, Math.max(age1Int, age2Int));
//        int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));
//
//        int ageDifference = Math.abs(oldestKid - youngestKid);
//
//
//        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
//                ", \nYou are " + age + " years old, Your oldest kid is " + oldestKid + " years old, your" +
//                "\nyoungest is " + youngestKid + ", difference between oldest and youngest is " + ageDifference +
//                "\nyears.");
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your age:");
        String age = input.next();
        input.nextLine(); // clearing the spaces!!!

        System.out.println("Please enter your phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your kids");

        int age1Int = Integer.parseInt(input.next()),
                age2Int = Integer.parseInt(input.next()),
                age3Int = Integer.parseInt(input.next());

        int oldestKid = Math.max(age3Int, Math.max(age1Int, age2Int));
        int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                ", \nYou are " + age + " years old, Your oldest kid is " + oldestKid + " years old, your" +
                "\nyoungest is " + youngestKid + ", difference between oldest and youngest is " +
                Math.abs(oldestKid - youngestKid) + "\nyears.");


 */

    }
    }
