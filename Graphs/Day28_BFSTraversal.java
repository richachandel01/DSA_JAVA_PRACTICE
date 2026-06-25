// Problem: BFS Traversal of Graph

import java.util.*;

public class Day28_BFSTraversal {

    public static List<Integer> bfsTraversal(
            int vertices,
            List<List<Integer>> adj) {

        List<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);

        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            result.add(node);

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(0);

        adj.get(3).add(1);

        adj.get(4).add(1);

        System.out.println(
                "BFS Traversal: "
                + bfsTraversal(vertices, adj));
    }
}