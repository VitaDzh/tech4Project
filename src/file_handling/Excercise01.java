package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Excercise01 {
    public static void main(String[] args) {

        /*
        TASK
        Create a new txt file called objects
        Write below data in it
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
        Print objects that has r or R as a letter
        EXPECTED OUTPUT
        Computer
        Chair
        Screen
        Remote
         */

        File objectsList = new File("objects.txt");


        try {
            FileWriter objects = new FileWriter("objects.txt");
            objects.write("Computer\n");
            objects.write("Phone\n");
            objects.write("Table\n");
            objects.write("Chair\n");
            objects.write("Mouse\n");
            objects.write("Screen\n");
            objects.write("Remote\n");
            objects.close();

            Scanner scanner = new Scanner(objectsList);
            //
            for (int i = 1; scanner.hasNextLine(); i++) {
                String next = scanner.nextLine();  // u have to store, because if u use nextLine it checkes nextLine and when u use nextLine  in sout it prints next line word

                if(next.toLowerCase().contains("r"))
                    System.out.println(next); // while it has a nextLine give me the nextLine for input
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            objectsList.delete();
        }


    }
}
