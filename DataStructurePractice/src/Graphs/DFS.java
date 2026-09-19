package Graphs;

import  java.util.*;
public class DFS {
    public static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static ArrayList<Integer> dfs(ArrayList<Edge>[] graph) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited,list);
            }
        }
        return list;
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean visited[],ArrayList<Integer> list){
        visited[curr]=true;
        list.add(curr);
        for(Edge nei:graph[curr]){
            if(!visited[nei.dest]){
                dfsUtil(graph,nei.dest,visited,list);
            }
        }
    }
    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();

        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();


        for(int i=0;i<e;i++)
        {
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(new Edge(src,dest));
            graph[dest].add(new Edge(dest,src));
        }
        System.out.println(dfs(graph));

//        for(int i=0;i<v;i++){
//            System.out.print(i+" ->");
//            for(Edge E:graph[i]){
//                System.out.print(E.dest+" ");
//            }
//            System.out.println();
//        }

    }
}
