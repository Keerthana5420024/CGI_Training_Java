//Write a program duplicate character in a String

import java.util.Scanner;

public class DuplicateCharacters85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1 && i != ' ') {
                System.out.println((char)i + " - " + freq[i] + " times");
            }
        }
    }
}
