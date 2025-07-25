//Find the minimum element in an array

import java.util.Scanner;

public class MinElementArray82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Get array elements from user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find minimum element
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum element: " + min);

        sc.close();
    }
}

