// Problem: Frequency of Characters

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class Day02_FrequencyOfCharacters {

    public static void frequency(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : map.keySet()) {

            System.out.println(ch + " -> " + map.get(ch));
        }
    }

    public static void main(String[] args) {

        String str = "programming";

        frequency(str);
    }
}