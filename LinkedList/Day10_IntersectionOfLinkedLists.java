// Problem: Intersection of Linked Lists

// Time Complexity: O(n + m)
// Space Complexity: O(1)

public class Day10_IntersectionOfLinkedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node getIntersection(Node headA, Node headB) {

        Node a = headA;
        Node b = headB;

        while(a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        Node common = new Node(8);
        common.next = new Node(10);

        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = common;

        Node headB = new Node(4);
        headB.next = common;

        Node intersection = getIntersection(headA, headB);

        if(intersection != null) {
            System.out.println("Intersection Node: " +
                                intersection.data);
        }
    }
}