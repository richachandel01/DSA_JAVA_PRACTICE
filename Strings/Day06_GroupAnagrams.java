// Problem: Group Anagrams

import java.util.*;

public class Day06_GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);

            map.putIfAbsent(sorted, new ArrayList<>());

            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}