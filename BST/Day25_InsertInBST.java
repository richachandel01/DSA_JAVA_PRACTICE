// Problem: Insert into BST

public class Day25_InsertInBST {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode insert(TreeNode root, int key) {

        if(root == null) {
            return new TreeNode(key);
        }

        if(key < root.data) {
            root.left = insert(root.left, key);
        }
        else if(key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public static void inorder(TreeNode root) {

        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        insert(root, 6);
        insert(root, 14);

        inorder(root);
    }
}