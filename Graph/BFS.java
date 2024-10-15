import java.util.*;



public class BFS {
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
    public static void bfs2(ArrayList<Ege>graph[]){
        boolean arr[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!arr[curr]){
                System.out.print(curr+" ");
                arr[curr] = true;
                for(int i = 0; i < graph[curr].size();i++){
                    Ege el = graph[curr].get(i);
                    q.add(el.dest);
                }
            }
        }

    }

    public static void bsf(ArrayList<Ege>[]graph){
        boolean visited [] = new boolean[graph.length];
        for(int i = 0;i < graph.length;i++){
            if(!visited[i]){
                bfsutil(graph,visited);
            }
        }
    }

    public static void bfsutil(ArrayList<Ege>[]graph,boolean visited[]){
       
        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] = true;

                for(int i = 0;i < graph[curr].size();i++){
                    Ege el = graph[curr].get(i);
                    q.add(el.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Ege> []graph = new ArrayList[v];
        creategraph(graph);
        bfs2(graph);
    }
    
}
