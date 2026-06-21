// Problem: Search in Binary Search Tree

// Time Complexity: O(h)
// Space Complexity: O(h)

public class Day24_SearchInBST {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode searchBST(TreeNode root, int key) {

        if(root == null || root.data == key) {
            return root;
        }

        if(key < root.data) {
            return searchBST(root.left, key);
        }

        return searchBST(root.right, key);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        int key = 6;

        TreeNode result = searchBST(root, key);

        if(result != null) {
            System.out.println("Key Found: "
                    + result.data);
        } else {
            System.out.println("Key Not Found");
        }
    }
}




// Iterative Approach

// public static TreeNode searchBST(TreeNode root, int key) {

//     while(root != null) {

//         if(root.data == key) {
//             return root;
//         }

//         if(key < root.data) {
//             root = root.left;
//         } else {
//             root = root.right;
//         }
//     }

//     return null;
// }