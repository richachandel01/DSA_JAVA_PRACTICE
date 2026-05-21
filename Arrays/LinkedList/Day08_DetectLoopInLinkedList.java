// Problem: Detect Loop in Linked List

// Floyd Cycle Detection Algorithm

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day08_DetectLoopInLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating loop
        head.next.next.next.next = head.next;

        boolean result = detectLoop(head);

        System.out.println("Loop Detected: " + result);
    }
}