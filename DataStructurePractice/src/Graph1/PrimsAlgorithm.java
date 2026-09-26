package Graph1;

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
      public   int compareTo(Pair p){
            return this.cost-p.cost;
        }
    }
    public static void prims(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalcost=0;

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.vert]){
                visited[curr.vert]=true;
                finalcost+=curr.cost;

                for(Edge nei:graph[curr.vert]){

                    int v=nei.dest;
                    int w=nei.wei;
                    if(!visited[v]){
                        pq.add(new Pair(v,w));
                    }
                }
            }
        }
        System.out.println(finalcost);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<V;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            int wei=s.nextInt();
            graph[src].add(new Edge(src,dest,wei));
            graph[dest].add(new Edge(dest,src,wei));
        }
        prims(graph);


    }

}
