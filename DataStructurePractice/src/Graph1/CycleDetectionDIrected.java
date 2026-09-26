package Graph1;


import java.util.*;
public class CycleDetectionDIrected {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();

        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
        }
        System.out.println(hascycle(graph));
    }
    public static boolean hascycle(ArrayList<Integer>[] graph){
        int state[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(state[i]==0){
                if(dfsUtil(graph,i,state))
                    return true;
            }
        }
        return false;
    }
    public static boolean dfsUtil(ArrayList<Integer>[] graph,int curr,int state[]){
        state[curr]=1;

        for(int nei:graph[curr]){
            if(state[nei]==0){
               if( dfsUtil(graph,nei,state))
                   return true;
            }else if(state[nei]==state[curr])
                return true;
        }
        state[curr]=2;
        return false;
    }
}
