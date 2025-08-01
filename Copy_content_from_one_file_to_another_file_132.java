//Write a program to copy content from one file to another file in java

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_content_from_one_file_to_another_file_132 {
    public static void main(String[] args) throws IOException {
        // Source and destination files
        FileReader reader = new FileReader("source.txt");
        FileWriter writer = new FileWriter("destination.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch); // Copy character by character
        }

        // Close resources
        reader.close();
        writer.close();

        System.out.println("Content copied successfully from source.txt to destination.txt.");
    }
}

