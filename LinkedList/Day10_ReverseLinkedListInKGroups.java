// Problem: Reverse Linked List in K Groups

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day10_ReverseLinkedListInKGroups {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverseKGroup(Node head, int k) {

        Node current = head;
        int count = 0;

        while(current != null && count < k) {

            current = current.next;
            count++;
        }

        if(count == k) {

            current = reverseKGroup(current, k);

            while(count-- > 0) {

                Node temp = head.next;

                head.next = current;
                current = head;
                head = temp;
            }

            head = current;
        }

        return head;
    }

    public static void printList(Node head) {

        while(head != null) {

            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseKGroup(head, 2);

        printList(head);
    }
}