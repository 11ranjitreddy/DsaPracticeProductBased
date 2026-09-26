package Graph1;

import java.util.*;

public class GraphRepresentation {
    public static class Edge{
        int src;
        int dest;
        int wei;
        Edge(int src,int dest,int wei){
            this.src=src;
            this.dest=dest;
            this.wei=wei;
        }
    }


    public static ArrayList<Edge>[] createGraphUsingEdgeWeight(int V){
        ArrayList<Edge>[] graph=new ArrayList[V];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<V;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            int w=s.nextInt();
            graph[u].add(new Edge(u,v,w));
            graph[v].add(new Edge(v,u,w));
        }
        return graph;
    }

    public static void bfs(ArrayList<Edge>[] graph){
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                q.add(i);
                visited[i]=true;

                while (!q.isEmpty()){
                    int curr=q.poll();
                      list.add(curr);

                    for(Edge nei:graph[curr]){
                        if(!visited[nei.dest]){
                            q.add(nei.dest);

                            visited[nei.dest]=true;
                        }
                    }
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Edge>[] graph=createGraphUsingEdgeWeight(V);

         bfs(graph);

    }
}
