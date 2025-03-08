package exceptions;


import java.io.FileReader;
import java.io.IOException;
public class InputOutputExce {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("file.txt")) {  
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                data = file.read();
            }
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
