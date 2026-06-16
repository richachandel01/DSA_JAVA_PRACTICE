// Problem: Diameter of Binary Tree

// Time Complexity: O(n)
// Space Complexity: O(h)

public class Day20_DiameterOfBinaryTree {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static int diameter = 0;

    public static int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter,
                           leftHeight + rightHeight);

        return 1 + Math.max(leftHeight,
                           rightHeight);
    }

    public static int diameterOfBinaryTree(TreeNode root) {

        diameter = 0;

        height(root);

        return diameter;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = diameterOfBinaryTree(root);

        System.out.println("Diameter of Tree: "
                           + result);
    }
}