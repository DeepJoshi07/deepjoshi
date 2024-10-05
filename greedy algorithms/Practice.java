import java.util.*;

public class Practice {
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
    }
}
