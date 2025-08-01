//Write a program to read from a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_from_a_file_125 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("output.txt"); // File to read from
        Scanner reader = new Scanner(file);

        System.out.println("Contents of the file:");
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }

        reader.close(); // Close the Scanner
    }
}
