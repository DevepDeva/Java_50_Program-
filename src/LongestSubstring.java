// Program for Find the length of the longest substring without repeating characters using two pointer approach

import java.util.HashSet;
import java.util.Set;


public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        Set<Character> charSet = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If the current character is already in the set,
            // we need to shrink the window from the left until it's unique again.
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set and update the maximum length.
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("Length of longest substring for \"" + s1 + "\": " + lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Length of longest substring for \"" + s2 + "\": " + lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println("Length of longest substring for \"" + s3 + "\": " + lengthOfLongestSubstring(s3)); // Output: 3

        String s4 = "";
        System.out.println("Length of longest substring for \"" + s4 + "\": " + lengthOfLongestSubstring(s4)); // Output: 0
    }
}
