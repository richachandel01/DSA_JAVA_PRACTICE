// Problem: Delete Node in BST

public class Day25_DeleteNodeInBST {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static TreeNode minValueNode(TreeNode node) {

        TreeNode current = node;

        while(current.left != null) {
            current = current.left;
        }

        return current;
    }

    public static TreeNode deleteNode(TreeNode root,
                                      int key) {

        if(root == null) {
            return null;
        }

        if(key < root.data) {

            root.left =
                    deleteNode(root.left, key);
        }
        else if(key > root.data) {

            root.right =
                    deleteNode(root.right, key);
        }
        else {

            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            TreeNode successor =
                    minValueNode(root.right);

            root.data = successor.data;

            root.right =
                    deleteNode(root.right,
                               successor.data);
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

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.right.right = new TreeNode(14);

        root = deleteNode(root, 10);

        inorder(root);
    }
}