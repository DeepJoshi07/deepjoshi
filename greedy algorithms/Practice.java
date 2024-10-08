import java.util.*;

public class Practice {
    static class Job{
        int id;
        int profit;
        int deadline;

        public Job(int i,int p,int d){
            this.id = i;
            this.profit = p;
            this.deadline = d;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,0,5,8,5};
        int arr1[]={2,4,6,7,9,9};

        int activities[][] = new int[arr.length][3];
        for(int i = 0; i < arr.length;i++){
           
            activities[i][0] = i;
            activities[i][1] = arr[i];
            activities[i][2] = arr1[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        int maxact = 1;
        int lastact = activities[0][2];
        for(int i = 1;i < arr.length;i++){
            if(activities[i][1] >= lastact){
                maxact++;
                al.add(i);
                lastact = activities[i][2];
            }
        }
        System.out.println("the maximum activities are = "+maxact);
        for(int i = 0;i < al.size();i++){
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();


        // quetion 2

        int value[] ={60,100,120};
        int weight[] ={10,20,30};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        
        for(int i = 0;i < weight.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int totalvalue = 0;
        int capacity = W;

        for(int i = ratio.length-1;i >= 0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                capacity -= weight[idx];
                totalvalue += value[idx];
            }else{
                totalvalue += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("the total value is = "+ totalvalue);



        // quetion 3

        int a[] ={1,2,3};
        int b[] ={2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);
        int maxdiff = 0;
        for(int i = 0; i < a.length;i++){
            maxdiff += Math.abs(a[i]-b[i]);
        }

        System.out.println("the maximum absolute difference is = " +maxdiff);



        // question 4
        int pair[] []= {{5,24},{39,60},{5,28},{27,40},{50,90}};
        
        int pair_in[] []= new int [pair.length][3];
        for(int i = 0;i < pair.length;i++){
            pair_in[i][0] = i;
            pair_in[i][1] = pair[i][0];
            pair_in[i][2] = pair[i][1];
        }

        Arrays.sort(pair_in,Comparator.comparingDouble(o -> o[1]));
        
        int count_pairs = 1;
        int lastpair = pair_in[0][2];
        for(int i = 1;i < pair_in.length-1;i++){
            if(lastpair <= pair_in[i][1]){
                lastpair = pair_in[i][1];
                count_pairs++;
            }
        }
        System.out.println("the number of pairs is = "+ count_pairs);


        // Indian coin

        Integer notes[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 610;
        int count = 0;

        Arrays.sort(notes, Comparator.reverseOrder());
        ArrayList<Integer> note = new ArrayList<>();
        for(int i = 0;i < notes.length;i++){
            if(notes[i] <= amount){
                while(notes[i] <= amount){
                    note.add(notes[i]);
                    amount -= notes[i];
                    count++;
                }
            }
        }
        System.out.println("the total notes are = "+count);
        System.out.println(note);


        // Job sequencing problem

        int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        int time = 0;

        ArrayList<Job> jobarr = new ArrayList<>();
        for(int i = 0;i < jobinfo.length;i++){
            jobarr.add(new Job(i,jobinfo[i][1],jobinfo[i][0]));
        }

        Collections.sort(jobarr, (obj,obj2) -> obj2.profit - obj.profit);

        ArrayList<Integer> sequ = new ArrayList<>();
        for(int i = 0;i < jobarr.size();i++){
            Job curr = jobarr.get(i);
            if(curr.deadline > time){
                sequ.add(curr.id);
                time += curr.deadline;
            }
        }
        System.out.println("Maximum jobs can be done are = "+sequ.size());
        System.out.print("job "+sequ+" ");
        System.out.println();



        // Chocola problem
        int n = 4;
        int m = 6;
        Integer horizontal[] = {4,1,2};
        Integer vertical [] = {2,1,3,1,4};

        Arrays.sort(horizontal,Collections.reverseOrder());
        Arrays.sort(vertical,Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;
        
        while(h < horizontal.length && v < vertical.length){
            if(horizontal[h] >= vertical[v]){
                hp++;
                cost += (horizontal[h] * vp);
                h++;
            }else{
                vp++;
                cost += (vertical[v] * hp);
                v++;
            }
        }
        while(h < horizontal.length){
            cost += (horizontal[h] * vp);
            h++;
            hp++;
        }
        while(v < vertical.length){
            cost += (vertical[v] * hp);
            v++;
            vp++;
        }
        System.err.println("our minimum cost is = "+ cost);
    }
}
