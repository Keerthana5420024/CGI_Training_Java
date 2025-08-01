//Write a program in java to write to file

import java.io.FileWriter;
import java.io.IOException;

public class Write_to_a_file_124 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt"); // Creates or overwrites the file
        writer.write("Hello, this is a sample text written to the file."); // Writing content
        writer.close(); // Closing the FileWriter
        System.out.println("Successfully wrote to the file.");
    }
}
