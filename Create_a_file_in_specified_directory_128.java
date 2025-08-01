//Write a program to create a file in specified directory

import java.io.File;
import java.io.IOException;

public class Create_a_file_in_specified_directory_128 {
    public static void main(String[] args) throws IOException {
        // Specify the directory and filename
        String directoryPath = "C:\\Users\\Keerthana\\Desktop\\Training\\Programming";
        String fileName = "myfile.txt";

        // Create File object with full path
        File file = new File(directoryPath, fileName);

        // Create the file
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
        } else {
            System.out.println("File already exists at: " + file.getAbsolutePath());
        }
    }
}

