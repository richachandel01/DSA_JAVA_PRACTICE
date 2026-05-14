// Problem: Maximum Subarray Sum (Kadane's Algorithm)

// Approach:
// Add elements continuously.
// If sum becomes negative, reset to 0.
// Track maximum sum.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day01_KadanesAlgorithm {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for(int num : nums) {

            currentSum += num;

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}