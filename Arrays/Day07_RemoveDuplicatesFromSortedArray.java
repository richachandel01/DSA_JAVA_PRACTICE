// Problem: Remove Duplicates from Sorted Array

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day07_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int index = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {

                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4};

        int length = removeDuplicates(nums);

        System.out.println("Unique Elements Count: " + length);

        for(int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}