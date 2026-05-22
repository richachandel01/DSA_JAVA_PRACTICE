// Problem: Merge Two Sorted Linked Lists

// Time Complexity: O(n + m)
// Space Complexity: O(1)

public class Day09_MergeTwoSortedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node list1, Node list2) {

        Node dummy = new Node(-1);
        Node current = dummy;

        while(list1 != null && list2 != null) {

            if(list1.data <= list2.data) {

                current.next = list1;
                list1 = list1.next;

            } else {

                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        }

        if(list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void printList(Node head) {

        while(head != null) {

            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node merged = merge(list1, list2);

        printList(merged);
    }
}