//Program to find the longest substring without repeating characters

import java.util.*;

public class LongestSubstring88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 0;
        String longest = "";

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                if (j - i > maxLen) {
                    maxLen = j - i;
                    longest = s.substring(i, j);
                }
            } else {
                set.remove(s.charAt(i++));
            }
        }

        System.out.println("Longest substring without repeating characters: " + longest);
    }
}
