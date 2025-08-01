//Write a program to read a text file in java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_a_text_file_133  {
    public static void main(String[] args) throws FileNotFoundException  {
        File file= new File("destination.txt");
        Scanner reader=new Scanner(file);

        System.out.println("Contents of the file: ");
        while(reader.hasNextLine()){
            String data= reader.nextLine();
            System.out.println(data);
        }
    }
}
