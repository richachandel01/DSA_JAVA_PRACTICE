// Problem: Check if String is Palindrome

// Approach:
// Compare characters from start and end

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day01_PalindromeString {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        boolean result = isPalindrome(str);

        System.out.println("Is Palindrome: " + result);
    }
}