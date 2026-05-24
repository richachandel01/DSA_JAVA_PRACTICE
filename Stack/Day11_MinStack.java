// Problem: Min Stack

// Time Complexity:
// push()  -> O(1)
// pop()   -> O(1)
// getMin()-> O(1)

import java.util.Stack;

public class Day11_MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Day11_MinStack() {

        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if(minStack.isEmpty() ||
           val <= minStack.peek()) {

            minStack.push(val);
        }
    }

    public void pop() {

        if(stack.peek().equals(minStack.peek())) {

            minStack.pop();
        }

        stack.pop();
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }

    public static void main(String[] args) {

        Day11_MinStack minStack = new Day11_MinStack();

        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);

        System.out.println("Minimum Element: " +
                            minStack.getMin());

        minStack.pop();

        System.out.println("Top Element: " +
                            minStack.top());

        System.out.println("Minimum Element: " +
                            minStack.getMin());
    }
}