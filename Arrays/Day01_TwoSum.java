// Problem: Two Sum
// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// Approach:
// Use HashMap to store number and its index.
// Check if target - current element exists in map.

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class Day01_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}