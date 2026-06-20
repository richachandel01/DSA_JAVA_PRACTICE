import java.util.*;

public class Day24_BoundaryTraversal {

    static class TreeNode {

        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static List<Integer> result = new ArrayList<>();

    static boolean isLeaf(TreeNode node) {

        return node.left == null &&
               node.right == null;
    }

    static void addLeftBoundary(TreeNode root) {

        TreeNode curr = root.left;

        while(curr != null) {

            if(!isLeaf(curr)) {
                result.add(curr.data);
            }

            if(curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    static void addLeaves(TreeNode root) {

        if(root == null) {
            return;
        }

        if(isLeaf(root)) {
            result.add(root.data);
            return;
        }

        addLeaves(root.left);
        addLeaves(root.right);
    }

    static void addRightBoundary(TreeNode root) {

        Stack<Integer> stack = new Stack<>();

        TreeNode curr = root.right;

        while(curr != null) {

            if(!isLeaf(curr)) {
                stack.push(curr.data);
            }

            if(curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
    }

    public static List<Integer> boundaryTraversal(TreeNode root) {

        result.clear();

        if(root == null) {
            return result;
        }

        if(!isLeaf(root)) {
            result.add(root.data);
        }

        addLeftBoundary(root);
        addLeaves(root);
        addRightBoundary(root);

        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(boundaryTraversal(root));
    }
}