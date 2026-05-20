// Problem: String Compression

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day07_StringCompression {

    public static String compress(String str) {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for(int i = 0; i < str.length(); i++) {

            while(i < str.length() - 1 &&
                  str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }

            result.append(str.charAt(i));

            if(count > 1) {
                result.append(count);
            }

            count = 1;
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbcccc";

        System.out.println("Compressed String: " + compress(str));
    }
}