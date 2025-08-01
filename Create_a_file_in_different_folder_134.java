//Write a program to create a file in different folder

import java.io.File;
import java.io.IOException;

public class Create_a_file_in_different_folder_134 {
    public static void main(String[] args) throws IOException {
        // Specify the directory and file name
        String folderPath = "C:\\Users\\Keerthana\\Desktop\\Training\\Example";
        String fileName = "newfile.txt";

        // Create the directory if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs(); // creates all necessary parent directories
        }

        // Create the file in the specified folder
        File file = new File(folder, fileName);

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
            System.out.println("Location: " + file.getAbsolutePath());
        } else {
            System.out.println("File already exists at: " + file.getAbsolutePath());
        }
    }
}

