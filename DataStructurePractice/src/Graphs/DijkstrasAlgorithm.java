package Graphs;

import  java.util.*;

public class DijkstrasAlgorithm {
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
    public static class Pair implements  Comparable<Pair>{
        int node;
        int distanc;
        Pair(int node,int distanc){
            this.node=node;
            this.distanc=distanc;
        }
        public int compareTo(Pair p){
           return this.distanc-p.distanc;
        }
    }
 public static void  main(String args[]){
       Scanner s=new Scanner(System.in);
       int v=s.nextInt();
       int e=s.nextInt();
       ArrayList<Edge> [] graph=new ArrayList[v];
       for(int i=0;i<graph.length;i++)
           graph[i]=new ArrayList<>();

       for(int i=0;i<e;i++){
           int src=s.nextInt();
           int dest=s.nextInt();
           int wei=s.nextInt();
           graph[src].add(new Edge(src,dest,wei));
           graph[dest].add(new Edge(dest,src,wei));
       }
       dijktras(graph,0);
 }
 public static void dijktras(ArrayList<Edge>[] graph,int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++)
            dist[i]=Integer.MAX_VALUE;
        dist[src]=0;

        boolean visited[]=new boolean[graph.length];

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
              if(!visited[curr.node]){
                  visited[curr.node]=true;

            for(Edge nei:graph[curr.node]){
                int u=nei.src;
                int v=nei.dest;
                int w=nei.wei;
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.add(new Pair(v,dist[v]));
                }
            }}
        }
        for(int i=0;i<dist.length;i++)
            System.out.println(i+" "+dist[i]);

 }
}
