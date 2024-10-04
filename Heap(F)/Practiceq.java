import java.util.*;

public class Practiceq {
    static class Position implements Comparable<Position>{
        int x, y;
        int dis_sqr;
        int idx;

        public Position(int x,int y,int dis_sqr,int idx){
            this.x = x;
            this.y = y;
            this.dis_sqr = dis_sqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Position p){
            return this.dis_sqr - p.dis_sqr;
        }
    }
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int s,int i){
            this.soldiers = s;
            this.idx = i;
        }

        @Override
        public int compareTo(Row r){
            if(this.soldiers == r.soldiers){
                return this.idx - r.idx;
            }else{
                return this.soldiers - r.soldiers;
            }
        }

    }

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int v,int i){
                this.val = v;
                this.idx = i;
            }

        @Override
        public int compareTo(Pair p){
            return p.val - this.val;
        }
        }
    public static void main(String []args){
        int pts[][] ={{3,3},{5,-1},{-2,4}};
        int l = 2;

        PriorityQueue <Position> pq = new PriorityQueue<>();

            for(int i = 0; i < pts.length; i++){
                int dis_sqr = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
                pq.add(new Position(3,3,dis_sqr,i));
            }

            for (int i = 0;i < l;i++){
                System.out.println("C"+pq.remove().idx);
            }

        // Quation 2
        int ropes[] ={2,3,3,4,6};
        PriorityQueue<Integer> rope_connect = new PriorityQueue<>();
            for(int i = 0; i < ropes.length;i++){
                rope_connect.add(ropes[i]);
            }

            int cost = 0;
            while(rope_connect.size() > 1){
                int min = rope_connect.remove();
                int min2 = rope_connect.remove();
                cost += min + min2;
                rope_connect.add(min+min2);
            }

            System.out.println("the cost of connecting all the ropes is = "+cost);

        // Question 3

        int [][]army ={{1,0,0,0},
                       {1,1,1,1}, 
                       {1,0,0,0},
                       {1,0,0,0} };
        int weak = 2;

        PriorityQueue <Row> ns = new PriorityQueue<>();
            for(int i = 0 ;i < army.length;i++){
                int count = 0;
                for(int j = 0;j < army[0].length;j++){
                    count += army[i][j] == 1 ? 1 : 0;
                }
                ns.add(new Row(count,i));
            }

            for(int i = 0 ;i < weak; i++){
                System.out.println("R"+ns.remove().idx);
            }
        
        // Quetion 4
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int [arr.length-k+1];
            PriorityQueue <Pair> pqp = new PriorityQueue<>();

                for(int i = 0;i < k;i++){
                    pqp.add(new Pair(arr[i],i));
                }
                res[0] = pqp.peek().val;

                for(int i = k; i < arr.length;i++){
                    while(pqp.size() > 0 && pqp.peek().idx <= (i-k)){
                        pqp.remove();
                    }
                    pqp.add(new Pair(arr[i],i));
                    res[i-k+1] = pqp.peek().val;
                }

                for(int i = 0; i < res.length;i++){
                    System.out.print(res[i]+" ");
                }
                System.out.println();

    }
}
