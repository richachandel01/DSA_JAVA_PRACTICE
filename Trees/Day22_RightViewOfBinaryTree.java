// Problem: Right View of Binary Tree

import java.util.*;

public class Day22_RightViewOfBinaryTree {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static List<Integer> rightView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if(i == size - 1) {
                    result.add(current.data);
                }

                if(current.left != null) {
                    queue.offer(current.left);
                }

                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.right = new TreeNode(5);

        System.out.println(rightView(root));
    }
}