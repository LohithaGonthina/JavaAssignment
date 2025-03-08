package javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileUsingBufferedWriter8 {
    public static void main(String[] args) {
        String text = "This is a text written using BufferedWriter.";
        
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputBufferedWriter.txt"))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
