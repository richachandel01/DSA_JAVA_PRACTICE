// Problem: Infix to Postfix Conversion

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

public class Day13_InfixToPostfix {

    public static int precedence(char ch) {

        if(ch == '+' || ch == '-') {
            return 1;
        }

        if(ch == '*' || ch == '/') {
            return 2;
        }

        if(ch == '^') {
            return 3;
        }

        return -1;
    }

    public static String infixToPostfix(String expression) {

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char ch : expression.toCharArray()) {

            // Operand
            if(Character.isLetterOrDigit(ch)) {

                result.append(ch);
            }

            // Opening bracket
            else if(ch == '(') {

                stack.push(ch);
            }

            // Closing bracket
            else if(ch == ')') {

                while(!stack.isEmpty() &&
                      stack.peek() != '(') {

                    result.append(stack.pop());
                }

                stack.pop();
            }

            // Operator
            else {

                while(!stack.isEmpty() &&
                      precedence(ch)
                      <= precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {

            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String expression = "(A+B)*C";

        String postfix =
                infixToPostfix(expression);

        System.out.println("Postfix Expression: "
                            + postfix);
    }
}