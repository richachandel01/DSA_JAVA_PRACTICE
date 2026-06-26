// Problem: DFS Traversal of Graph

import java.util.*;

public class Day29_DFSTraversal {

    public static List<Integer> dfsTraversal(
            int vertices,
            List<List<Integer>> adj) {

        List<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[vertices];

        dfs(0, adj, visited, result);

        return result;
    }

    private static void dfs(
            int node,
            List<List<Integer>> adj,
            boolean[] visited,
            List<Integer> result) {

        visited[node] = true;

        result.add(node);

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {

                dfs(neighbor, adj, visited, result);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected Graph
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(0);

        adj.get(3).add(1);

        adj.get(4).add(1);

        System.out.println("DFS Traversal: "
                + dfsTraversal(vertices, adj));
    }
}