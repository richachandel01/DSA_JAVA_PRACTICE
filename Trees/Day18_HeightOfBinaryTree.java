// Problem: Height (Maximum Depth) of Binary Tree

// Time Complexity: O(n)
// Space Complexity: O(h)

public class Day18_HeightOfBinaryTree {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);

        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(8);

        int result = height(root);

        System.out.println("Height of Tree: " + result);
    }
}