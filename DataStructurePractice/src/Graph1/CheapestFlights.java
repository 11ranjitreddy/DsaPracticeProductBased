package Graph1;

import  java.util.*;
public class CheapestFlights {

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

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        ArrayList<Edge> graph=new ArrayList<>();

        int e=s.nextInt();
        for(int i=0;i<e;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            int wei=s.nextInt();

            graph.add(new Edge(src,dest,wei));
        }

        int src=s.nextInt();
        int dest=s.nextInt();
        int k=s.nextInt();

        int dist[]=new int[V];
        for(int i=0;i<V;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[src]=0;


        for(int i=0;i<=k;i++){
            int temp[]=dist.clone();

            for(Edge edge:graph){
                int u=edge.src;
                int v=edge.dest;
                int w=edge.wei;

                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<temp[v]){
                    temp[v]=dist[u]+w;
                }
            }
            dist=temp;

        }
 if(dist[dest]==Integer.MAX_VALUE)
     System.out.println(-1);
 else
     System.out.println(dist[dest]);

    }
}
