package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        // DataType/ClassName variableName = new DataType/ClassName (if it is needed); -->creating an object formula
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Where is your address");
        String userAdress = "\"" + inputReader.nextLine() + "\""; //variableName.methodName();
        System.out.println("User addres is = " .concat("\"" + userAdress.concat("\"")) + "\"");






    }
}
