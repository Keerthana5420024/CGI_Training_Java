/*
 * Write a program to generate star pattern
(Input: Number of lines)
 */

import java.util.Scanner;

public class star_pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        for(int i = 1; i <= lines; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
