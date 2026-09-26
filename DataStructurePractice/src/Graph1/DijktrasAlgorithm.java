package Graph1;

import java.util.*;

public class DijktrasAlgorithm {

    public static class Edge {
        int src;
        int dest;
        int wei;

        Edge(int src, int dest, int wei) {
            this.src = src;
            this.dest = dest;
            this.wei = wei;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        public int compareTo(Pair p) {
            return this.distance - p.distance;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            int src = s.nextInt();
            int dest = s.nextInt();
            int wei = s.nextInt();

            graph[src].add(new Edge(src, dest, wei));
            graph[dest].add(new Edge(dest, src, wei));
        }
        dijktras(graph, 0);
    }

    public static void dijktras(ArrayList<Edge>[] graph, int source) {
        int dist[] = new int[graph.length];
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++)
            dist[i] = Integer.MAX_VALUE;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                for (Edge nei : graph[curr.node]) {
                    int u = nei.src;
                    int v = nei.dest;
                    int w = nei.wei;
                    if (dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++)
            System.out.print(dist[i] + " ");
    }
}
