package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        System.out.println("-------TASK 1-------------");
        /*
        Create a String array and store below:
        Name of the Array - students
        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam
        sort and print
         */
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted arrays = " + Arrays.toString(students));

        /*
        Task2
        Print the first and last names after it is sorted
         */
        System.out.println("----------TASK 2--------------");
        System.out.println("First name = " + students[0] + "\n" + "Last name is = " + students[students.length - 1]);

        /*
        Task 3
         */
        System.out.println("--------TASK 3--------");
        //Count how many names starts with A

        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].startsWith("A")) count++;
        }
        System.out.println(count + " names starts with \"A\"");


        int count1 = 0;
        for (String student : students) {
            if (student.charAt(0) == 'A') count1++;
        }
        System.out.println("Names with A = " + count1);
        System.out.println();

        System.out.println("------TASK 4--------");
        /*
        TASK 4
        Count how many names contains a-A ot e-E
        Expected: 5
         */
        int count3 = 0;
        for (String name : students) {
            //name = name.toLowerCase();  WE CAN STORE IT THIS WAY. BECAUSE WE USE IT TWICE, NOT ONLY ONCE
            if (name.toLowerCase().contains("a") || name.toLowerCase().contains("e")) count3++;
        }
        System.out.println("FOR EACH LOOP: " + count3 + " names contains \"A\" or \"E\" ");


        int count4 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].toLowerCase().contains("a") || students[i].toLowerCase().contains("e")) count4++;
        }
        System.out.println("FORI LOOP: " + count4 + " names contains \"A\" or \"E\" ");

        System.out.println("----------TASK 5---------");
        /*
        TASK 5
        How many names has at least 5 chars
        Expected 3
         */
        int countAtLeast5 = 0;
        for (String name : students) {
            if (name.length() > 4) countAtLeast5++;
        }
        System.out.println("FOR EACH: " + countAtLeast5);


        int atLeast5 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].length() >= 5) atLeast5++;
        }
        System.out.println("FORI LOOP: " + atLeast5);

        /*

        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */


        /*
        TASK 6
        Check if this Array has an element that is == "Jennifer"
        If it has print true
         */
        boolean hasJennifer = false;
        for (String name : students) {
            if(name.equalsIgnoreCase("Jennifer")) {
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer);

        //[Jennifer, Adam, Alex, James, John, Jordan, Lionel, Tom]
        //Second way is not always good considering performance but would always work
        int countJennifer = 0;

        for (String student : students) {
            if(student.equalsIgnoreCase("Jennifer")) countJennifer++;
        }
        System.out.println(countJennifer > 0);




    }
}













