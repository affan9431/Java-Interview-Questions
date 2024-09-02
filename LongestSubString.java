import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubString {

    /**
     * This method finds the length of the longest substring without repeating
     * characters.
     * It uses a sliding window approach with two pointers and a HashSet to track
     * the characters.
     */
    public static void maxSubstring() {
        String str;
        System.out.println("Enter the String: ");

        // Read the input string from the user
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sc.close();

        int start = 0; // Pointer for the beginning of the sliding window
        int maxLength = 0; // Variable to store the maximum length of the substring
        Set<Character> set = new HashSet<>(); // Set to store unique characters in the current window

        int end = 0; // Pointer for the end of the sliding window
        while (end < str.length()) {
            // If the current character is not in the set, add it and update maxLength
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end)); // Add the character to the set
                maxLength = Math.max(maxLength, set.size()); // Update the maxLength if necessary
                end++; // Move the end pointer to the right
            } else {
                // If the current character is already in the set, remove the character at start
                // pointer
                set.remove(str.charAt(start));
                start++; // Move the start pointer to the right
            }
        }

        // Output the maximum length of the substring without repeating characters
        System.out.println("The maximum length is: " + maxLength);
    }

    public static void main(String[] args) {
        maxSubstring(); // Call the method to find and print the maximum substring length
    }
}
