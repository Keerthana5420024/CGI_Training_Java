/*
 * Write a program to generate the pattern below
1
2 3
4 5 6
7 8 9 10
(Input: Number of lines)
 */

import java.util.Scanner;

public class numberpattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();

        int num = 1; 

        for(int i = 1; i <= lines; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
