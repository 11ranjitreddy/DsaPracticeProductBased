package Graphs;

import java.util.*;
public class Has_Path_Using_DFS {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();

        ArrayList<Integer> graph[]=new ArrayList[v];
         for(int i=0;i<v;i++)
             graph[i]=new ArrayList<>();

        for(int i=0;i<e;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
            graph[dest].add(src);
        }
        boolean visited[]=new boolean[graph.length];
                int source=s.nextInt();
                int destination=s.nextInt();
        System.out.println(haspath(graph,visited,source,destination));
    }
    static boolean haspath(ArrayList<Integer>graph[],boolean visited[],int src,int dest){
        if(src==dest)
            return true;

        visited[src]=true;
        for(int n:graph[src]){
            if(!visited[n] && haspath(graph,visited,n,dest)){
                return true;
            }
        }
        return false;
    }
}
