// Problem: Reverse String

// Time Complexity: O(n)
// Space Complexity: O(n)

public class Day05_ReverseString {

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

        String result = reverseString(str);

        System.out.println("Reversed String: " + result);
    }
}