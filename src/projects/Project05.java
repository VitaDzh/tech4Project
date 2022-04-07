package projects;

import java.util.Scanner;
public class Project05 {

    public static void main(String[] args) {
        /*
        -Make sure that you have a package called as "projects"
        -Create a new class called as "Project05"
        -NOTE: complete all tasks in Project05 class
        -NOTE: give proper names for all of your variables
        -NOTE: feel free to use comments for your codes for explanations

        TASK-1
        Write a program that asks user to enter a String, and swaps
        first and last 4 characters of this String and print the modified String

        Test data:
        TechGlobal

        Expected output:
        obalGlTech

         */

        System.out.println("TASK 1"); // have to run program at least 3 times(with condition less than 8, 8 and > than 8, and EMPTY)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String s = scan.nextLine();
        if(s.length() < 8) System.out.println("This String does not have 8 characters");
        else  System.out.println(s.substring(s.length()-4) + s.substring(4, (s.length()-4)) + s.substring(0, 4));
        System.out.println();


/*
        Write a program that asks user to enter a sentence, and swaps first and last words of this
        sentence and print the modified sentence
        Test data:
        Selenium is an automation tool
        Expected output:
        tool is an automation Selenium
        NOTE: Write a program that handles any sentence
        NOTE: First check if the sentence has at least 2 words, if the sentence has only one or no word,
        then print message “This sentence does not have 2 or more words to swap”

 */
        System.out.println("TASK 2");
        System.out.println("Pls enter a sentence: ");
        String s2 = scan.nextLine().trim();  // do not forget TO TRIM
        if(!s2.contains(" ")) // str.trim().indexOf(' ') <= 0; output -1, because it does not exist
            System.out.println("This sentence does not have 2 or more words to swap");
        else System.out.println((s2.substring(s2.lastIndexOf(' ')+1)) + s2.substring(s2.indexOf(' '),
                s2.lastIndexOf(' ')+1) + s2.substring( 0, s2.indexOf(' ')+1));
        System.out.println();

        System.out.println("TASK 3");
        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";
        System.out.println(str1.replace("stupid", "nice") + "\n" +
                str2.replace("idiot", "nice") +
                "\n" +  str3.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println();


        System.out.println("TASK 4");
        System.out.println("Pls enter your name: ");
        String name = scan.nextLine();
        if(name.length() <= 2) System.out.println("Invalid input!!!");
        else {
            if(name.length() % 2 == 0)
                System.out.println("" + name.charAt(name.length()/2-1) + name.charAt(name.length()/2));
            else {
                System.out.println(name.charAt(name.length()/2));
            }
        }
        System.out.println();


        System.out.println("TASK 5");
        System.out.println("Pls enter a country name: ");
        String country = scan.nextLine();
        if(country.length() < 5) System.out.println("Invalid input!!!");
        else System.out.println( country.substring(2, country.length() - 2));
        System.out.println();

        System.out.println("TASK 6");
        System.out.println("Enter your full address: ");
        String address = scan.nextLine();
        String a = address.replaceAll("a", "*").replaceAll("e", "#").
                replaceAll("i", "+").replaceAll("u", "\\$").replaceAll("o", "@");
        System.out.println(a);

        System.out.println("TASK 7");

/*
        int num1 = (int)(Math.random()*26);
        int num2 = (int)(Math.random()*26);
        System.out.println(num1 + "\n" + num2);
        System.out.println();

        if(num1 < num2){
            for (int i = num1; i < num2; i++){
                if(i % 5 != 0){
                    System.out.println(i);
                }
            }
        }
        else
            for (int i = num2; i < num1; i++){
            if(i % 5 != 0){
                System.out.println(i);
            }
        }
 */


String str = "";   // without it we can not trim. we need to create String object to trim or substring
int num1 = (int)(Math.random()*26);
int num2 = (int)(Math.random()*26);
for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
    if(i % 5 != 0) str += i + " - ";
    }
        if(!str.isEmpty())System.out.print(str.substring(0, str.length()-3)); // we are cutting 3 last characters(space, dash, space)
        else System.out.println(str);


    }
}
















