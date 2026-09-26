package Graph1;

import java.util.*;

public class HasPath {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int V=s.nextInt();

        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            int u=s.nextInt();
            int v=s.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        int u=s.nextInt();
        int v=s.nextInt();
        boolean visited[]=new boolean[graph.length];
        System.out.println(haspath(graph,u,v,visited));

    }
   static boolean haspath(ArrayList<Integer>[] graph,int src,int dest,boolean visited[]){
        if(src==dest)
            return true;


        visited[src]=true;

        for(int nei:graph[src]){
            if(!visited[nei]&&haspath(graph,nei,dest,visited)){
                return true;
            }
        }
        return false;
    }
}
