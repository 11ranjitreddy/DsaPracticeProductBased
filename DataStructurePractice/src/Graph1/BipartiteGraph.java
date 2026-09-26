package Graph1;

import java.util.*;

public class BipartiteGraph {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        ArrayList<Integer> []graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
            graph[dest].add(src);
        }

        System.out.println(bipartite(graph));
    }

    public static boolean bipartite(ArrayList<Integer>[] graph){
        int col[]=new int[graph.length];
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<graph.length;i++)
            col[i]=-1;

          for(int i=0;i<graph.length;i++){
              if(col[i]==-1){
                  col[i]=0;

                  q.add(i);
                  while (!q.isEmpty()){
                      int curr=q.remove();

                      for(int nei:graph[curr]){
                          if(col[nei]==-1){
                              int nextcolor=col[curr]==0?1:0;
                              col[nei]=nextcolor;
                          }else if(col[nei]==col[curr])
                              return false;
                      }
                  }
              }
          }
          return true;
    }
}
