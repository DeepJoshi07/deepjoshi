import java.util.*;
public class CycleDirected {
    static class Ege{
        int src;
        int dist;

        public Ege(int s,int d){
            this.src = s;
            this.dist = d;
        }
    }

    public static void addingraph(ArrayList<Ege>graph[]){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Ege(0, 2));
        // graph[1].add(new Ege(1, 0));
        // graph[2].add(new Ege(2, 3));
        // graph[3].add(new Ege(3, 0));


        graph[0].add(new Ege(0, 1));
        graph[0].add(new Ege(0, 2));
        graph[1].add(new Ege(1, 3));
        graph[2].add(new Ege(2, 3));
    }

    public static boolean isCycle(ArrayList<Ege>graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0;i < graph.length;i++){
            if(!vis[i]){
                return isCycleUtil(graph,i,vis,stack);
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Ege>graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0;i < graph[curr].size();i++){
            Ege e = graph[curr].get(i);
            if(stack[e.dist]){
                return true;
            }
            if(!vis[e.dist] && isCycleUtil(graph, e.dist, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Ege>graph[] = new ArrayList[v];
        addingraph(graph);
        System.out.println(isCycle(graph));
    }
}
