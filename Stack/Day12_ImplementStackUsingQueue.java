// Problem: Implement Stack Using Queue

// Time Complexity:
// push() -> O(n)
// pop()  -> O(1)

// Space Complexity: O(n)

import java.util.LinkedList;
import java.util.Queue;

public class Day12_ImplementStackUsingQueue {

    Queue<Integer> queue;

    public Day12_ImplementStackUsingQueue() {

        queue = new LinkedList<>();
    }

    public void push(int x) {

        queue.add(x);

        int size = queue.size();

        while(size > 1) {

            queue.add(queue.remove());
            size--;
        }
    }

    public int pop() {

        return queue.remove();
    }

    public int top() {

        return queue.peek();
    }

    public boolean isEmpty() {

        return queue.isEmpty();
    }

    public static void main(String[] args) {

        Day12_ImplementStackUsingQueue stack =
                new Day12_ImplementStackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: " +
                            stack.top());

        System.out.println("Popped Element: " +
                            stack.pop());

        System.out.println("Top Element: " +
                            stack.top());
    }
}