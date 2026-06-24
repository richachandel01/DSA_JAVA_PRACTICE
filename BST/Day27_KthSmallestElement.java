// Problem: Kth Smallest Element in BST

public class Day27_KthSmallestElement {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static int count = 0;
    static int answer = -1;

    public static int kthSmallest(TreeNode root, int k) {

        count = 0;
        answer = -1;

        inorder(root, k);

        return answer;
    }

    private static void inorder(TreeNode root, int k) {

        if(root == null) {
            return;
        }

        inorder(root.left, k);

        count++;

        if(count == k) {
            answer = root.data;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        int k = 3;

        System.out.println(
                "Kth Smallest Element: "
                + kthSmallest(root, k));
    }
}