import java.util.*;

public class BipartiteGraph {
    static class Ege{
        int src;
        int dist;

        public Ege(int s,int d){
            this.src = s;
            this.dist = d;
        }
    }

    public static void addinGraph(ArrayList<Ege>graph[]){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Ege(0,1));
        graph[0].add(new Ege(0,2));

        graph[1].add(new Ege(1,0));
        graph[1].add(new Ege(1,3));

        graph[2].add(new Ege(2,0));
        graph[2].add(new Ege(2,4));

        graph[3].add(new Ege(3,1));
        // graph[3].add(new Ege(3,4));

        graph[4].add(new Ege(4,2));
        // graph[4].add(new Ege(4,3));
    }

    public static boolean isBipartite(AbstractList<Ege>graph[]){
        int []color = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
       
        for(int i = 0;i < graph.length;i++){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0;j < graph[curr].size();j++){
                        Ege e = graph[curr].get(j);
                        if(color[e.dist] == -1){
                            int nextcol = color[curr] == 0 ? 1 : 0;
                            color[e.dist] = nextcol;
                            q.add(e.dist);
                        }else if(color[curr] == color[e.dist]){
                            return false;
                        }
                    }
                    
                }
            }
            }
           
       return true;
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Ege>graph[] = new ArrayList[V];
        addinGraph(graph);
        System.out.println(isBipartite(graph));
    }
    
}
