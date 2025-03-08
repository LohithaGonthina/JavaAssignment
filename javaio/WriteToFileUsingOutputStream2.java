package javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFileUsingOutputStream2 {
    
    public static void main(String[] args) {
        String text = "Hello, this is a text file written using OutputStream.";
        
        try (OutputStream outputStream = new FileOutputStream("output.txt")) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
