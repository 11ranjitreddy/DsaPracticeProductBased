package Graphs;

import java.util.*;

public class Has_Path_Using_DFS_Edge {
    public static class  Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);

     int v=s.nextInt();
     ArrayList<Edge> graph[]=new ArrayList[v];

     for(int i=0;i<v;i++)
         graph[i]=new ArrayList<>();

     for(int i=0;i<v;i++){
         int src=s.nextInt();
         int dest=s.nextInt();
         graph[src].add(new Edge(src,dest));
         graph[dest].add(new Edge(dest,src));
     }
     int source=s.nextInt();
     int destination=s.nextInt();
     boolean visited[]=new boolean[v];
     System.out.println(haspath(graph,source,destination,visited));

    }
    public static boolean haspath(ArrayList<Edge>[] graph,int src,int dest,boolean visited[]){
        if(src==dest)return true;
        visited[src]=true;

        for(Edge edge:graph[src]){
            if(!visited[edge.dest] && haspath(graph,edge.dest,dest,visited))
                return true;
        }
        return false;
    }
}
