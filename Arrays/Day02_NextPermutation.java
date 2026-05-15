// Problem: Next Permutation

// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class Day02_NextPermutation {

    public static void nextPermutation(int[] nums) {

        int index = -1;

        // Step 1: Find breakpoint
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: Reverse whole array if no breakpoint
        if(index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find next greater element
        for(int i = nums.length - 1; i > index; i--) {
            if(nums[i] > nums[index]) {

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 4: Reverse remaining array
        reverse(nums, index + 1, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {

        while(start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}