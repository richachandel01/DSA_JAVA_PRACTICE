// Problem: Merge Intervals

// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

public class Day03_MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for(int[] interval : intervals) {

            if(interval[0] <= current[1]) {

                current[1] = Math.max(current[1], interval[1]);

            } else {

                result.add(current);
                current = interval;
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] result = merge(intervals);

        for(int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}