// Problem: Find Starting Point of Loop in Linked List

// Floyd Cycle Detection Algorithm

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day09_FindStartingPointOfLoop {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node detectStart(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {

                slow = head;

                while(slow != fast) {

                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating loop
        head.next.next.next.next = head.next;

        Node result = detectStart(head);

        if(result != null) {
            System.out.println("Loop Starts At: " + result.data);
        } else {
            System.out.println("No Loop");
        }
    }
}