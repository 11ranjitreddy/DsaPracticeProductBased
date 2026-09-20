package Graphs;

import java.util.*;

public class BellManFordAlgorithm {

    public static  class Edge{
        int src;
        int dest;
        int wei;
        Edge(int src,int dest,int wei){
            this.src=src;
            this.dest=dest;
            this.wei=wei;
        }
    }
    public  static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();
        ArrayList<Edge> graph=new ArrayList<>();


        for(int i=0;i<e;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            int wei=s.nextInt();
            graph.add(new Edge(src,dest,wei));
        }
         bellman(graph,v,0);
    }
    public static void bellman(ArrayList<Edge> graph,int V,int src){
        int dist[]=new int[V];
        for(int i=0;i<V;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[src]=0;

        for(int i=0;i<V-1;i++){

            for(Edge e:graph){
                int u=e.src;
                int v=e.dest;
                int w=e.wei;

                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
           for(Edge e:graph){
               int u=e.src;
               int v=e.dest;
               int w=e.wei;

               if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                   return;
               }
           }
           for(int i=0;i<V;i++)
               System.out.println(i+" "+dist[i]);
    }

}
