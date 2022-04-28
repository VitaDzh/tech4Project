package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        File shoppingList = new File("shoppingList.txt");

        try{
          //  shoppingList.createNewFile();
            FileWriter shopping = new FileWriter("shoppingList.txt");
            shopping.write("Ice-cream\n");
            shopping.write("Fruits\n");
            shopping.write("Pen\n");
            shopping.write("Paper\n");
            shopping.write("Milk\n");
            shopping.close();
            Thread.sleep(5000);

            //How to read info from file
            Scanner scanner = new Scanner(shoppingList);

            for (int i = 1; scanner.hasNextLine(); i++) {
                System.out.println("Item " + i + " = " + scanner.nextLine()); // while it has a nextLine give me the nextLine for input
                Thread.sleep(2000);
            }
            // Second way to read info from file:
          /*  int index = 1;
            while(scanner.hasNextLine()){
                System.out.println("Item " + index++ + " = " + scanner.nextLine());
            }

           */

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
           // shoppingList.delete();
        }
    }
}
