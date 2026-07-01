// Problem: Topological Sort using DFS

import java.util.*;

public class Day33_TopologicalSort {

    public static List<Integer> topologicalSort(
            int vertices,
            List<List<Integer>> adj) {

        boolean[] visited = new boolean[vertices];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private static void dfs(
            int node,
            List<List<Integer>> adj,
            boolean[] visited,
            Stack<Integer> stack) {

        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, stack);
            }
        }

        stack.push(node);
    }

    public static void main(String[] args) {

        int vertices = 6;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);

        adj.get(4).add(0);
        adj.get(4).add(1);

        adj.get(2).add(3);

        adj.get(3).add(1);

        List<Integer> result =
                topologicalSort(vertices, adj);

        System.out.println("Topological Order: " + result);
    }
}