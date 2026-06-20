import java.util.*;

public class Day24_VerticalOrderTraversal {

    static class TreeNode {

        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static class Pair {

        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        TreeMap<Integer, List<Integer>> map =
                new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while(!queue.isEmpty()) {

            Pair current = queue.poll();

            map.putIfAbsent(current.hd,
                    new ArrayList<>());

            map.get(current.hd)
                    .add(current.node.data);

            if(current.node.left != null) {

                queue.offer(
                        new Pair(
                                current.node.left,
                                current.hd - 1));
            }

            if(current.node.right != null) {

                queue.offer(
                        new Pair(
                                current.node.right,
                                current.hd + 1));
            }
        }

        result.addAll(map.values());

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

        System.out.println(verticalOrder(root));
    }
}