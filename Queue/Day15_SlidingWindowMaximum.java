// Problem: Sliding Window Maximum

// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.*;

public class Day15_SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        int index = 0;

        for(int i = 0; i < n; i++) {

            while(!deque.isEmpty() &&
                  deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            while(!deque.isEmpty() &&
                  nums[deque.peekLast()] < nums[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);

            if(i >= k - 1) {

                result[index++] =
                        nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
}