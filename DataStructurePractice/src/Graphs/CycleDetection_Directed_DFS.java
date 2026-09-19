package Graphs;

import java.sql.Statement;
import java.util.*;

public class CycleDetection_Directed_DFS {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         int v=s.nextInt();
         ArrayList<Integer> graph[]=new ArrayList[v];
         for(int i=0;i<v;i++)
             graph[i]=new ArrayList<>();

         for(int i=0;i<v;i++){
             int src=s.nextInt();
             int dest=s.nextInt();
             graph[src].add(dest);
         }
         System.out.println(hasCycle(graph));
    }
    public static boolean hasCycle(ArrayList<Integer>[] graph){
        int state[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(state[i]==0){
                if(dfsCycle(graph,i,state))
                    return true;
            }
        }
        return false;
    }
    public static boolean dfsCycle(ArrayList<Integer>[] graph,int curr,int state[]){
        state[curr]=1;
        for(int nei:graph[curr]){
            if(state[nei]==0){
                if(dfsCycle(graph,nei,state)){
                    return true;
                }
            }else if(state[nei]==1)
                return true;
        }
        state[curr]=2;
        return false;

    }
}
