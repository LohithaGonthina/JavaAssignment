package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFileUsingInputStream1 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("input.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
