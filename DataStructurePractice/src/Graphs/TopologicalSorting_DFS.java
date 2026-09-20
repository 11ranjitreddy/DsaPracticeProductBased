package Graphs;

import  java.util.*;

public class TopologicalSorting_DFS {
    public static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();

        ArrayList<Integer>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<v;i++){
            int src=s.nextInt();
            int des=s.nextInt();
            graph[src].add(des);
        }
        topology(graph);
    }
    public static void topology(ArrayList<Integer>[] graph){
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topodfs(graph,i,visited,s);
            }
        }
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topodfs(ArrayList<Integer>[] graph,int curr,boolean visited[],Stack<Integer>stack){
        visited[curr]=true;

        for(int nei:graph[curr]){
            if(!visited[nei]){
                topodfs(graph,nei,visited,stack);
            }
        }
        stack.push(curr);
    }
}
