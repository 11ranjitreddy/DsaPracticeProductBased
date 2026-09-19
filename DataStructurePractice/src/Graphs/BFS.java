package Graphs;

import  java.util.*;
public class BFS {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int E=s.nextInt();
        ArrayList<Integer> graph[]=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<E;i++)
        {
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
            graph[dest].add(src);


        }
//        for(int i=0;i<v;i++)
//            System.out.println(i+" "+graph[i]);

       System.out.println(bfs(graph));

    }
    public static ArrayList<Integer> bfs(ArrayList<Integer>[] graph){
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[graph.length];
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){

                q.add(i);

               visited[i]=true;
                while (!q.isEmpty()){
                    int curr=q.poll();
                    list.add(curr);
                    visited[curr]=true;

                    for(int nei:graph[curr]){
                        if(!visited[nei]){
                            list.add(nei);
                            visited[nei]=true;
                        }
                    }
                }
            }
        }
        return list;
    }
}
