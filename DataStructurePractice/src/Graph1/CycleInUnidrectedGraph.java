package Graph1;

import  java.util.*;
public class CycleInUnidrectedGraph {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Integer>graph[]=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<V;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        System.out.println(dfsCycle(graph));
    }

    static boolean dfsCycle(ArrayList<Integer>[] graph){
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(dfsCycleUtil(graph,i,visited,-1))
                    return true;
            }
        }
        return false;
    }
    public static boolean dfsCycleUtil(ArrayList<Integer>[] graph,int curr,boolean visited[],int parent){
        visited[curr]=true;

        for(int nei:graph[curr]){
            if(!visited[nei]) {
               if(dfsCycleUtil(graph, nei, visited, curr))
                   return true;
               else if(nei!=parent)
                   return true;
            }
        }
        return false;
    }
}
