// Problem: Reverse Linked List

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day08_ReverseLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while(current != null) {

            Node nextNode = current.next;

            current.next = prev;

            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void printList(Node head) {

        while(head != null) {

            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}