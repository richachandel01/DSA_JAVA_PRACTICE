// Problem: Valid Parentheses

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

public class Day03_ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{[()]}";

        boolean result = isValid(s);

        System.out.println("Valid Parentheses: " + result);
    }
}