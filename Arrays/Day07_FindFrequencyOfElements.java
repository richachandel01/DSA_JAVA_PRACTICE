// Problem: Find Frequency of Elements

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class Day07_FindFrequencyOfElements {

    public static void frequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {

            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4,2};

        frequency(arr);
    }
}