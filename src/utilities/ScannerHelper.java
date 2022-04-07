package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter any number");
        int number = scan.nextInt();
        scan.nextLine();
        return number;
    }

    public static String getANameFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter a name: ");
        String name = scan.nextLine();
        scan.nextLine();
        return name;
    }


        public static String getAStringFromUser(){
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            return string;
        }

    }

