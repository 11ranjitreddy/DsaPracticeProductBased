package Graphs;

import java.util.*;

public class PrimsAlgorithm {
    public static class Edge{
        int src;
        int dest;
        int wei;
        Edge(int src,int dest,int wei){
            this.src=src;
            this.dest=dest;
            this.wei=wei;
        }
    }
    public static class Pair implements Comparable<Pair>{
        int vert;
        int cost;
        Pair(int vert,int cost){
            this.vert=vert;
            this.cost=cost;
        }
        public int compareTo(Pair p){
            return this.cost-p.cost;
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Edge> graph[]=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<V;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            int w=s.nextInt();
            graph[u].add(new Edge(u,v,w));
            graph[v].add(new Edge(v,u,w));

        }
        boolean visited[]=new boolean[V];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalcost=0;

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.vert]){
                visited[curr.vert]=true;

                finalcost+=curr.cost;

               for(Edge edge:graph[curr.vert]){
                   int v=edge.dest;
                   int w=edge.wei;
                   if(!visited[v]){
                       pq.add(new Pair(v,w));
                   }
               }
            }


        }
        System.out.println(finalcost);
    }
}
