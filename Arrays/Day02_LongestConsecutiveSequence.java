// Problem: Longest Consecutive Sequence

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class Day02_LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {

            if(!set.contains(num - 1)) {

                int currentNum = num;
                int streak = 1;

                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence: " + result);
    }
}