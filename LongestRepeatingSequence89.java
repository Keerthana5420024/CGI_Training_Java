//Program to find the longest repeating sequence in a string

import java.util.*;

public class LongestRepeatingSequence89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        int maxLen = 0;
        int endIndex = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (s.charAt(i-1) == s.charAt(j-1) && dp[i-1][j-1] < (j - i)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        String result = s.substring(endIndex - maxLen, endIndex);
        System.out.println("Longest repeating sequence: " + result);
    }
}

