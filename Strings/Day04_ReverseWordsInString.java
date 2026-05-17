// Problem: Reverse Words in a String

// Time Complexity: O(n)
// Space Complexity: O(n)

public class Day04_ReverseWordsInString {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if(i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        String result = reverseWords(s);

        System.out.println(result);
    }
}