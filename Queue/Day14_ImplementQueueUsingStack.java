// Problem: Implement Queue Using Stack

// Time Complexity:
// enqueue -> O(1)
// dequeue -> O(1) Amortized

// Space Complexity: O(n)

import java.util.Stack;

public class Day14_ImplementQueueUsingStack {

    Stack<Integer> input;
    Stack<Integer> output;

    public Day14_ImplementQueueUsingStack() {

        input = new Stack<>();
        output = new Stack<>();
    }

    public void enqueue(int x) {

        input.push(x);
    }

    public int dequeue() {

        if(output.isEmpty()) {

            while(!input.isEmpty()) {

                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {

        if(output.isEmpty()) {

            while(!input.isEmpty()) {

                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean isEmpty() {

        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {

        Day14_ImplementQueueUsingStack queue =
                new Day14_ImplementQueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Front: " + queue.peek());
    }
}