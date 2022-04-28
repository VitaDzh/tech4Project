package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDate {
    public static void main(String[] args) {
        /*
        Create a file called as studentList.txt
        After creating, put a wait for 5 seconds, and delete it
         */
        File studentList = new File("studentList.txt");
        try{
            studentList.createNewFile();
            Thread.sleep(5000);

            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Data");
            fileWriter.close(); // saves changes . DO NOT EVER FORGET
            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            studentList.delete();
        }



    }
}
