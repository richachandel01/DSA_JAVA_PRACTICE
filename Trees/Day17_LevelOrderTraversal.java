// Problem: Level Order Traversal (BFS)

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class Day17_LevelOrderTraversal {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static void levelOrder(TreeNode root) {

        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {

            TreeNode current = queue.poll();

            System.out.print(current.data + " ");

            if(current.left != null) {
                queue.offer(current.left);
            }

            if(current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Level Order Traversal:");

        levelOrder(root);
    }
}