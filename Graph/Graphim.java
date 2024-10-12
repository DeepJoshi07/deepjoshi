import java.util.ArrayList;

public class Graphim{
    static class Ege{
        int src;
        int dist;
        int wt;

        public Ege(int s,int d,int w){
            this.src = s;
            this.dist = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Ege> graph = new ArrayList[v];

        for(int i = 0;i < v;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Ege(0, 1, 5));


        graph[1].add(new Ege(1, 0, 5));
        graph[1].add(new Ege(1, 2, 1));
        graph[1].add(new Ege(1, 3, 3));


        graph[2].add(new Ege(2, 1, 1));
        graph[2].add(new Ege(2, 3, 1));
        graph[2].add(new Ege(2, 4, 2));


        graph[3].add(new Ege(3, 1, 3));
        graph[3].add(new Ege(3, 2, 1));


        graph[4].add(new Ege(4, 2, 2));
    }
}