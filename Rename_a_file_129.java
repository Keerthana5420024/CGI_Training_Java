//Write a program to rename a file

import java.io.File;

public class Rename_a_file_129 {
    public static void main(String[] args) {
        // Original file
        File oldFile = new File("example.txt");

        // New file name
        File newFile = new File("renamed_example.txt");

        // Rename operation
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}

