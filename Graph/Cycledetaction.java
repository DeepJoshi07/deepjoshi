import java.util.*;
public class Cycledetaction {
    static class Ege{
        int src;
        int dest;

        public Ege(int s,int d){
            this.src = s;
            this.dest = d;
        }
    } 

    public static void insert(ArrayList<Ege>graph[]){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Ege(0,1));
        // graph[0].add(new Ege(0,2));
        graph[0].add(new Ege(0,3));

        graph[1].add(new Ege(1,0));
        graph[1].add(new Ege(1,2));

        // graph[2].add(new Ege(2,0));
        graph[2].add(new Ege(2,1));

        graph[3].add(new Ege(3,0));
        graph[3].add(new Ege(3,4));

        graph[4].add(new Ege(4,3));
    }
    public static boolean detectCycle(ArrayList<Ege>[]graph){
        boolean[]visited = new boolean[graph.length];
        for(int i = 0;i < graph.length;i++){
            if(!visited[i]){
                return detectCycleUtil(graph,visited,i,-1);
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Ege>[]graph,boolean[]visited,int curr,int par){
        visited[curr] = true;
        for(int i = 0;i < graph[curr].size();i++){
            Ege e = graph[curr].get(i);
            if(!visited[e.dest]){
                if(detectCycleUtil(graph,visited,e.dest,curr)){
                    return true;
                }
            }else if(visited[e.dest] && par != e.dest){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Ege>[]graph = new ArrayList[v];
        insert(graph);
        System.out.println(detectCycle(graph));
        
    }
}
