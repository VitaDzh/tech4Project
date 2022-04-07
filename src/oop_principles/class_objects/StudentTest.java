package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        /*
        Create a student object with below information
        firstName = John
        lastName = Doe
        age = 45
         */

        System.out.println("TASK 1");
       Student s1 = new Student();
       s1.firstName = "John";
       s1.lastName = "Doe";
       s1.age = 45;
       s1.dateOfBirth = "01/01/1977";
       s1.gender = "male";
       s1.address = "Chicago";
       s1.weight = 170.5;
       s1.height = 5.7;
       s1.email = "johndoe@gmail.com";
       s1.id = 1001;

        System.out.println(s1);

        System.out.println("TASK 2");
        //Create another student
        Student s2 = new Student();
        s2.firstName = "Lionel";
        s2.lastName = "Messi";
        s2.age = 34;
        s2.dateOfBirth = "01/01/1988";
        s2.gender = "male";
        s2.address = "Paris";
        s2.weight = 150;
        s2.height = 4.9;
        s2.email = "lionel@gmail.com";
        s2.id = 1002;

        System.out.println(s2);

        Student s3 = new Student();
        s3.firstName = "Alex";
        s3.lastName = "Morgan";
        s3.age = 20;
        s3.dateOfBirth = "01/01/2002";
        s3.gender = "male";
        s3.address = "Chicago";
        s3.weight = 165;
        s3.height = 5.5;
        s3.email = "alex@gmail.com";
        s3.id = 1003;

        System.out.println(s3);

        Student s4 = new Student();
        s4.firstName = "Jessie";
        s4.lastName = "Smith";
        s4.age = 15;
        s4.dateOfBirth = "01/01/2007";
        s4.gender = "female";
        s4.address = "Miami";
        s4.weight = 160;
        s4.height = 5.7;
        s4.email = "jessie@gmail.com";
        s4.id = 1004;

        System.out.println(s4);

        Student s5 = new Student();
        s5.firstName = "Kaly";
        s5.lastName = "Ngo";
        s5.age = 16;
        s5.dateOfBirth = "01/01/2006";
        s5.gender = "female";
        s5.address = "Berlin";
        s5.weight = 150;
        s5.height = 5.3;
        s5.email = "kelly@gmail.com";
        s5.id = 1005;

        System.out.println(s5);
        System.out.println("\n");

        System.out.println("Created AList");
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        System.out.println(listOfStudents);
        System.out.println("\n");

        System.out.println("Printing throught LOOP");
        for (Student listOfStudent : listOfStudents) {
            System.out.println(listOfStudent);
        }
        System.out.println("\n");

        //Count how many from Chi
        System.out.println("TASK 3");
        int count = 0;
        for (Student listOfStudent : listOfStudents) {
            if(listOfStudent.address.equalsIgnoreCase("Chicago"))
                count++;
        }
        System.out.println(count);

        /*
        Task-3
        Count how many students are male and female
         */
        System.out.println("TASK 4");
        int maleCount = 0, femaleCount =0, teens = 0;
        for (Student listOfStudent : listOfStudents) {
            if(listOfStudent.gender.toLowerCase().startsWith("m")) maleCount++;
            else femaleCount++;
            if(listOfStudent.age >=13 && listOfStudent.age <=19) teens++;
        }
        System.out.println("male " + maleCount + "\nfemale " + femaleCount);

        System.out.println(teens);

        /*
        TASK 5. Print all info of each student in separate lines
         */

        for (Student listOfStudent : listOfStudents) {
            System.out.println(listOfStudent.firstName);
            System.out.println(listOfStudent.lastName);
            System.out.println(listOfStudent.age);
            System.out.println(listOfStudent.dateOfBirth);
            System.out.println(listOfStudent.gender);
            System.out.println(listOfStudent.address);
            System.out.println(listOfStudent.height);
            System.out.println(listOfStudent.weight);
            System.out.println(listOfStudent.email);
            System.out.println(listOfStudent.id);
            listOfStudent.eat();
            listOfStudent.study();
        }

        System.out.println("Printing using method");
        listOfStudents.forEach(listOfSt -> {
            System.out.println(listOfSt.firstName);
            System.out.println(listOfSt.lastName);
            System.out.println(listOfSt.age);
            System.out.println(listOfSt.dateOfBirth);
            System.out.println(listOfSt.gender);
            System.out.println(listOfSt.address);
            System.out.println(listOfSt.height);
            System.out.println(listOfSt.weight);
            System.out.println(listOfSt.email);
            System.out.println(listOfSt.id);
        });

    }
}
