// Problem: First Negative Number in Every Window of Size K

// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.*;

public class Day15_FirstNegativeNumberInEveryWindow {

    public static List<Integer> firstNegative(int[] arr, int k) {

        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        int j = 0;

        while(j < arr.length) {

            if(arr[j] < 0) {
                queue.offer(arr[j]);
            }

            if(j - i + 1 < k) {

                j++;

            } else if(j - i + 1 == k) {

                if(queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                }

                if(!queue.isEmpty() &&
                   arr[i] == queue.peek()) {

                    queue.poll();
                }

                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {12,-1,-7,8,-15,30,16,28};

        int k = 3;

        System.out.println(firstNegative(arr, k));
    }
}