//Write a program to get size of a given file in Bytes, KiloBytes and MegaBytes

import java.io.File;

public class Get_size_of_file_130 {
    public static void main(String[] args) {
        File file = new File("output.txt"); // Replace with your file name

        if (file.exists()) {
            long bytes = file.length(); // Size in bytes
            double kilobytes = bytes / 1024.0;
            double megabytes = bytes / (1024.0 * 1024);

            System.out.println("File name: " + file.getName());
            System.out.println("Size in Bytes: " + bytes + " B");
            System.out.println("Size in Kilobytes: " + String.format("%.2f", kilobytes) + " KB");
            System.out.println("Size in Megabytes: " + String.format("%.4f", megabytes) + " MB");
        } else {
            System.out.println("File does not exist.");
        }
    }
}

