package Graph1;

import java.util.*;
public class GraphRepresentationArrayList {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Integer>graph[]=new ArrayList[V];

        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<V;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(graph);

    }
    public static void dfs(ArrayList<Integer>[] graph){
        ArrayList<Integer> list=new ArrayList<>();


        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited,list);
            }
        }
        System.out.println(list);
    }
    public static void dfsUtil(ArrayList<Integer>[] graph,int curr,boolean visited[],ArrayList<Integer> list){
        visited[curr]=true;
        list.add(curr);
        for(int nei:graph[curr]){
            if(!visited[nei]){
                dfsUtil(graph,nei,visited,list);
            }
        }
    }


}
