// Problem: Palindrome Linked List

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day10_PalindromeLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {

        if(head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;

        while(secondHalf != null) {

            if(firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static Node reverse(Node head) {

        Node prev = null;

        while(head != null) {

            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " +
                            isPalindrome(head));
    }
}