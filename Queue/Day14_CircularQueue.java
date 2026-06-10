// Problem: Circular Queue

// Time Complexity:
// enqueue -> O(1)
// dequeue -> O(1)

// Space Complexity: O(n)

public class Day14_CircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public Day14_CircularQueue(int capacity) {

        this.capacity = capacity;
        queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {

        return size == capacity;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public void enqueue(int value) {

        if(isFull()) {

            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;

        queue[rear] = value;

        size++;
    }

    public int dequeue() {

        if(isEmpty()) {

            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];

        front = (front + 1) % capacity;

        size--;

        return value;
    }

    public int getFront() {

        if(isEmpty()) {
            return -1;
        }

        return queue[front];
    }

    public static void main(String[] args) {

        Day14_CircularQueue queue =
                new Day14_CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: "
                + queue.getFront());

        System.out.println("Dequeued: "
                + queue.dequeue());

        System.out.println("Front: "
                + queue.getFront());
    }
}