// Problem: Lowest Common Ancestor of Binary Tree

public class Day23_LowestCommonAncestor {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        if(root == null ||
           root == p ||
           root == q) {

            return root;
        }

        TreeNode left =
                lowestCommonAncestor(root.left, p, q);

        TreeNode right =
                lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {

            return root;
        }

        return left != null ? left : right;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;          // 5
        TreeNode q = root.right;         // 1

        TreeNode lca =
                lowestCommonAncestor(root, p, q);

        System.out.println(
                "Lowest Common Ancestor: "
                + lca.data);
    }
}