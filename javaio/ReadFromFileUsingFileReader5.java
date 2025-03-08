package javaio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileUsingFileReader5 {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("input.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
