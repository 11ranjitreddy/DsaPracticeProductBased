package Graph1;

import  java.util.*;
public class TopologicalSorting {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        ArrayList<Integer> [] graph=new ArrayList[V];

        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<V;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
        }

        topologysort(graph);
    }

    public static void topologysort(ArrayList<Integer>[] graph){
        Stack<Integer> stack=new Stack<>();
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topology(graph,i,visited,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
    public static void topology(ArrayList<Integer>[] graph,int curr,boolean visited[],Stack<Integer>stack){
        visited[curr]=true;


        for(int nei:graph[curr]){
            if(!visited[nei]){
                topology(graph,nei,visited,stack);
            }
        }
        stack.push(curr);
    }
}
