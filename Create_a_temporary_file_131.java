//Write a program to create a temporary file

import java.io.File;
import java.io.IOException;

public class Create_a_temporary_file_131 {
    public static void main(String[] args) throws IOException {
        // Create a temporary file with prefix "tempfile" and suffix ".txt"
        File tempFile = File.createTempFile("tempfile", ".txt");

        System.out.println("Temporary file created: " + tempFile.getName());
        System.out.println("Path: " + tempFile.getAbsolutePath());

        // Delete the temp file when the program exits
        tempFile.deleteOnExit();
    }
}
