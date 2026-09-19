package Graphs;
 import  java.util.*;

public class ConstructingGraphUsingEdge {
    public static class Edge {
        int src, dest, wei;

        Edge(int src, int dest,int wei) {
            this.src = src;
            this.dest = dest;
            this.wei = wei;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int E=s.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++)
            graph[i] = new ArrayList<>();

        for(int i=0;i<E;i++);
        {
            int src=s.nextInt();
            int dest=s.nextInt();
            int wei=s.nextInt();

            graph[src].add(new Edge(src,dest,wei));
            graph[dest].add(new Edge(dest,src,wei));
        }
        for(int i=0;i<v;i++){
            System.out.print(i+" ");
            for(Edge e:graph[i]){
                System.out.print(e.dest+" "+e.wei);
            }
        }
    }
}