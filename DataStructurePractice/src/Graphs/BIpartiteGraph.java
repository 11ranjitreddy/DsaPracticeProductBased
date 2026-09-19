package Graphs;

import  java.util.*;

public class BIpartiteGraph {
    public static  void main(String args[]){
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
        System.out.println(isBipartite(graph));
    }
    public static boolean isBipartite(ArrayList<Integer>[]graph){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++)
            col[i]=-1;

        Queue<Integer>q =new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1)
                q.add(i);

            while (!q.isEmpty()){
                int curr=q.remove();

                for(int nei:graph[curr]){
                    if(col[nei]==-1){
                        int nextcolour=col[curr]==0?1:0;
                        col[nei]=nextcolour;
                        q.add(nei);

                    }else if(col[nei]==col[curr])
                        return false;
                }
            }
        }
        return true;
    }
}
