//Write a program to find the occurrence of a character in a string

import java.util.Scanner;

public class CharOccurrence86 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Character '" + ch + "' occurred " + count + " times.");
    }
}
