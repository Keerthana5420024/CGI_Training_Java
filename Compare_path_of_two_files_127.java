//Write a program to compare a path of two files in java

import java.io.File;

public class Compare_path_of_two_files_127 {
    public static void main(String[] args) {
        File file1 = new File("example.txt");
        File file2 = new File("copy.txt");

        // Compare using absolute path
        String path1 = file1.getAbsolutePath();
        String path2 = file2.getAbsolutePath();

        System.out.println("Path of file 1: " + path1);
        System.out.println("Path of file 2: " + path2);

        if (path1.equals(path2)) {
            System.out.println("Both files have the same path.");
        } else {
            System.out.println("The file paths are different.");
        }
    }
}

