// Problem: Detect Cycle in Undirected Graph (BFS)

import java.util.*;

public class Day31_DetectCycleInGraph {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean isCycle(int vertices, List<List<Integer>> adj) {

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (bfs(i, adj, visited))
                    return true;
            }
        }

        return false;
    }

    private static boolean bfs(int start,
                               List<List<Integer>> adj,
                               boolean[] visited) {

        Queue<Pair> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(new Pair(start, -1));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            for (int neighbor : adj.get(current.node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(new Pair(neighbor, current.node));

                } else if (neighbor != current.parent) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1);
        adj.get(1).add(3);

        System.out.println("Cycle Exists: "
                + isCycle(vertices, adj));
    }
}