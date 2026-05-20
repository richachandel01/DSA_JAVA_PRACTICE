// Problem: Missing Number

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day07_MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        System.out.println("Missing Number: " + missingNumber(nums));
    }
}