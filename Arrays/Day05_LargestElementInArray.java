// Problem: Find Largest Element in Array

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day05_LargestElementInArray {

    public static int largestElement(int[] arr) {

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int result = largestElement(arr);

        System.out.println("Largest Element: " + result);
    }
}