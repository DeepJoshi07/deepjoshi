import java.util.*;

public class Working2 {
    static class Heap{
        ArrayList<Integer> al = new ArrayList<>();
        public void insert(int data){
            al.add(data);

            int kid = al.size()-1;
            int par = (kid-1)/2;

            while(al.get(kid) <= al.get(par)){
                int temp = al.get(kid);
                al.set(kid,al.get(par));
                al.set(par,temp);

                kid = par;
                par = (kid-1)/2;
            }
        }
        public int peek(){
            return al.get(0);
        }
        private void heapify(int idx){
            int smallest = idx;
            int left = 2*idx+1;
            int right = 2*idx+2;

            if(left < al.size() && al.get(idx) >= al.get(left)){
                smallest = left;
            }
            if(right < al.size() && al.get(idx) >= al.get(right)){
                smallest = right;
            }

            if(smallest != idx){
                int temp = al.get(idx);
                al.set(idx,al.get(smallest));
                al.set(smallest,temp);

                heapify(smallest);
            }
        }
        public int delete(){
            int data = al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1,data);

            al.remove(al.size()-1);

            heapify(0);
            return data;
        }
    }
    static class Pair implements Comparable<Pair>{
        int x,y,sqr_r,idx;

        public Pair(int x,int y,int sqr_r,int idx){
            this.x = x;
            this.y = y;
            this.sqr_r = sqr_r;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p){
            return this.sqr_r - p.sqr_r;
        }
    }

    static class Soldiers implements Comparable<Soldiers>{
        int count_soldiers;
        int idx;

        public Soldiers(int c,int idx){
            this.count_soldiers = c;
            this.idx = idx;
        }
        @Override
        public int compareTo(Soldiers s){
            if(this.count_soldiers == s.count_soldiers){
                return this.idx - s.idx;
            }else{
                return this.count_soldiers - s.count_soldiers;
            }
        }
    }

    static class Two implements Comparable<Two>{
        int value,idx;

        public Two(int x,int y){
            this.value =x;
            this.idx = y;
        }
        @Override
        public int compareTo(Two t){
            return t.value- this.value;
        }
    }
    public static void main(String[] args) {
       int pair[][] = {{3,3},{5,-1},{-2,4}};
       int k = 2;
       PriorityQueue<Pair> pqp = new PriorityQueue<>();
       for(int i = 0;i < pair.length;i++){
            int sqr_r = pair[i][0]*pair[i][0]+pair[i][1]*pair[i][1];
            pqp.add(new Pair(pair[i][0],pair[i][1],sqr_r,i));
       }

       for(int i = 0;i < k;i++){
        System.out.print("C"+pqp.remove().idx+" ");
       }
       System.out.println();
        

    //    weakest soldier

       int soldier[][] ={{1,0,0,0},
                         {1,1,1,1},
                         {1,0,0,0},
                         {1,0,0,0}};
       int weakest_lines =2;

       PriorityQueue<Soldiers> s = new PriorityQueue<>();
       for(int i = 0;i < soldier.length;i++){
        int count_soldiers = 0;
            for(int j = 0;j < soldier[0].length;j++){
                count_soldiers += soldier[i][j] == 1? 1 : 0;
            }
            s.add(new Soldiers(count_soldiers, i));
       }

       for(int i = 0; i < weakest_lines;i++){
            System.out.print("S"+s.remove().idx+" ");
       }
       System.out.println();



    //    sliding window maximum

       int nums[] ={1,2,3,4,5,6,7,8,9,10};
       int size = 3;
       int res [ ] = new int [nums.length-size+1];

       PriorityQueue<Two> t = new PriorityQueue<>();
       for(int i = 0;i < size;i++){
            t.add(new Two(nums[i],i));
       }

       res[0] = t.peek().value;
       for(int i = size;i < nums.length;i++){
            while(t.size() > 0 && t.peek().idx <= (i-size)){
                t.remove();
            }
            t.add(new Two(nums[i],i));
            res[i-size+1] = t.peek().value;
       }

       for(int i = 0 ; i < res.length;i++){
            System.out.print(res[i]+" ");
       }
       System.out.println();
    }
}
