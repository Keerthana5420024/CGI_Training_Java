//Write a program in java to create a file

import java.io.File;
import java.io.IOException;

public class Create_a_file_123 {
    public static void main(String[] args) throws IOException {
        File myFile = new File("example.txt"); // Specify the file name
        if (myFile.createNewFile()) {
            System.out.println("File created: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
        } else {
            System.out.println("File already exists.");
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
        }
    }
}
