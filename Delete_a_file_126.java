//Write a program to delete a file

import java.io.File;
import java.io.IOException;

public class Delete_a_file_126 {
    public static void main(String[] args) throws IOException {
        File file = new File("tempfile.txt");

        // Create the file
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
