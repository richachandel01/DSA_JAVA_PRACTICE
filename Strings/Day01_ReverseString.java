// Problem: Reverse a String

// Approach:
// Convert string into character array
// Swap characters from start and end

// Time Complexity: O(n)
// Space Complexity: O(n)

public class Day01_ReverseString {

    public static String reverseString(String str) {

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "Richa";

        String reversed = reverseString(str);

        System.out.println("Reversed String: " + reversed);
    }
}