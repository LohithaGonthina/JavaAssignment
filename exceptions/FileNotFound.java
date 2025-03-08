package exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {
    public static void main(String[] args) {
        Scanner myReader = null;
        try {
            File myFile = new File("nonexistentfile.txt");
            myReader = new Scanner(myFile);  
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } finally {
            if (myReader != null) {
                myReader.close();
            }
        }
    }
}