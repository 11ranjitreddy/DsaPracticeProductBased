package Graphs;

import  java.util.*;

public class CycleDetection_DFS_Undirected {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        ArrayList<Integer>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<v;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
            graph[dest].add(src);
        }


        System.out.println(hasCycle(graph));
    }
    public static boolean hasCycle(ArrayList<Integer>[] graph){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(dfscycle(graph,i,visited,-1))
                    return true;
            }
        }
        return false;

    }
    public static boolean dfscycle(ArrayList<Integer>[] graph,int curr,boolean visited[],int parent){
        visited[curr]=true;
        for(int nei:graph[curr]){
            if(!visited[nei]){
                if(dfscycle(graph,nei,visited,curr))
                    return true;
                else if(nei!=parent)
                    return true;
            }
        }
        return false;
    }
}
