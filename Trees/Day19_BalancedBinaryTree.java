// Problem: Balanced Binary Tree

// Time Complexity: O(n)
// Space Complexity: O(h)

public class Day19_BalancedBinaryTree {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isBalanced(TreeNode root) {

        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);

        if(leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.right);

        if(rightHeight == -1) {
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        System.out.println("Is Balanced: "
                            + isBalanced(root));
    }
}