import java.util.ArrayList;
import java.util.*;
public class Topology{
    static class Ege{
        int src;
        int dist;

        public Ege(int s,int d){
            this.src = s;
            this.dist = d;
        }
    }

    public static void add(ArrayList<Ege>[]graph){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Ege(2,3));

        graph[3].add(new Ege(3,1));

        graph[4].add(new Ege(4,0));
        graph[4].add(new Ege(4,1));

        graph[5].add(new Ege(5,0));
        graph[5].add(new Ege(5,2));
    }

    public static void topSort(ArrayList<Ege>[]graph){
        boolean vis[] = new boolean[graph.length];
        Stack <Integer> s = new Stack<>();

        for(int i = 0;i < graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph, vis, i, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }

    public static void topSortUtil(ArrayList<Ege>[]graph,boolean vis[],int curr,Stack <Integer> s){
        vis[curr] = true;

        for(int i = 0;i < graph[curr].size();i++){
            Ege e = graph[curr].get(i);
            if(!vis[e.dist]){
                topSortUtil(graph, vis, e.dist, s);
            }
            
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Ege> graph[] = new ArrayList[V];
        add(graph);
        topSort(graph);
    }
}