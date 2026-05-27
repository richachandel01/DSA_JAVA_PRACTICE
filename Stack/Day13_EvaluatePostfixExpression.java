// Problem: Evaluate Postfix Expression

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

public class Day13_EvaluatePostfixExpression {

    public static int evaluatePostfix(String expression) {

        Stack<Integer> stack = new Stack<>();

        for(char ch : expression.toCharArray()) {

            // Operand
            if(Character.isDigit(ch)) {

                stack.push(ch - '0');
            }

            // Operator
            else {

                int value2 = stack.pop();
                int value1 = stack.pop();

                switch(ch) {

                    case '+':
                        stack.push(value1 + value2);
                        break;

                    case '-':
                        stack.push(value1 - value2);
                        break;

                    case '*':
                        stack.push(value1 * value2);
                        break;

                    case '/':
                        stack.push(value1 / value2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String expression = "231*+9-";

        int result =
                evaluatePostfix(expression);

        System.out.println("Evaluation Result: "
                            + result);
    }
}