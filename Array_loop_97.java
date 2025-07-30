//Writa a program on java array loop

import java.util.Scanner;

public class Array_loop_97 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are: ");
        for(int a:arr){
            System.out.println(a);
        }
    }
}
