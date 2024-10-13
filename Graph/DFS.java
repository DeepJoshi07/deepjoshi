import java.util.*;

public class DFS {
     static class Ege{
        int src;
        int dest;
        int wt;

        public Ege(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creategraph(ArrayList<Ege>graph[]){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Ege(0, 1, 1));
        graph[0].add(new Ege(0, 2, 1));

        graph[1].add(new Ege(1, 0, 1));
        graph[1].add(new Ege(1, 3, 1));

        graph[2].add(new Ege(2, 0, 1));
        graph[2].add(new Ege(2, 4, 1));

        graph[3].add(new Ege(3, 1, 1));
        graph[3].add(new Ege(3, 4, 1));
        graph[3].add(new Ege(3, 5, 1));

        graph[4].add(new Ege(4, 2, 1));
        graph[4].add(new Ege(4, 3, 1));
        graph[4].add(new Ege(4, 5, 1));

        graph[5].add(new Ege(5, 3, 1));
        graph[5].add(new Ege(5, 4, 1));
        graph[5].add(new Ege(5, 6, 1));

        graph[5].add(new Ege(6, 5, 1));
    }
    public static void dfs2(ArrayList<Ege>graph[],boolean[] visited,int curr){
       
        visited[curr] = true;
        System.out.print(curr+" ");

        for(int i = 0;i < graph[curr].size();i++){
            Ege e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph,visited,e.dest);
            }
        }

    }

    public static void dfs(ArrayList<Ege>graph[]){
        boolean[] visited = new boolean[graph.length];
        for(int i = 0;i < graph.length;i++){
            if(!visited[i]){
                dfsutil(graph, visited, i);
            }
        }
    }

    public static void dfsutil(ArrayList<Ege>graph[],boolean[] visited,int curr){
        visited[curr] = true;
        System.out.println(curr+" ");

        for(int i = 0;i < graph[curr].size();i++){
            Ege e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfsutil(graph,visited,e.dest);
            }
        }
    }

    public static boolean haspath(ArrayList<Ege>graph[],int src,int dest,boolean arr[]){
        if(src == dest){
            return true;
        }
        arr[src] = true;

        for(int i = 0;i < graph[src].size();i++){
            Ege e = graph[src].get(i);
            if(!arr[e.dest] && haspath(graph,e.dest,dest,arr)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Ege> []graph = new ArrayList[v];
        creategraph(graph);
        dfs2(graph, new boolean[v],0);
        System.out.println();
        System.out.println(haspath(graph, 0, 10, new boolean[v]));
    }
}
