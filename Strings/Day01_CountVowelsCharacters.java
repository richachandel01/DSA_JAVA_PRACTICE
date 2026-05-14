// Problem: Count Vowels and Characters in a String

// Approach:
// Traverse the string
// Check if character is vowel

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day01_CountVowelsCharacters {

    public static void countVowelsAndCharacters(String str) {

        int vowels = 0;
        int characters = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {

                characters++;

                if(ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u') {

                    vowels++;
                }
            }
        }

        System.out.println("Total Characters: " + characters);
        System.out.println("Total Vowels: " + vowels);
    }

    public static void main(String[] args) {

        String str = "Hello World";

        countVowelsAndCharacters(str);
    }
}