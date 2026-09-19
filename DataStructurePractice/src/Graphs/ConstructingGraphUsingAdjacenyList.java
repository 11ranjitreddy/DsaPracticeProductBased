package Graphs;
import  java.util.*;
public class ConstructingGraphUsingAdjacenyList {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        ArrayList<Integer> [] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<v;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
            graph[dest].add(src);
        }

        for(int i=0;i<v;i++)
            System.out.println(i+"-> "+graph[i]);
    }
}
