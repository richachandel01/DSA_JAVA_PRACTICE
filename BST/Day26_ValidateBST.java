// Problem: Validate Binary Search Tree

// Time Complexity: O(n)
// Space Complexity: O(h)

public class Day26_ValidateBST {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(TreeNode root) {

        return validate(root,
                Long.MIN_VALUE,
                Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node,
                                    long min,
                                    long max) {

        if(node == null) {
            return true;
        }

        if(node.data <= min ||
           node.data >= max) {

            return false;
        }

        return validate(node.left,
                        min,
                        node.data)

                &&

               validate(node.right,
                        node.data,
                        max);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.right.right = new TreeNode(14);

        System.out.println(
                "Is Valid BST: "
                + isValidBST(root));
    }
}