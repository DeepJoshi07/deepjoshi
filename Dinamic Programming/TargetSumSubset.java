import java.util.*;
public class TargetSumSubset {
    public static boolean targetSumSubset(int num[],int target){
        boolean dp[][] = new boolean[num.length+1][target+1];
        for(int i = 0;i < num.length+1;i++){
            dp[i][0] = true;
        }
        for(int i = 1;i < dp.length;i++){
            for(int j = 1;j < dp[0].length;j++){
                int curr = num[i-1];
                if(curr <= j){
                    dp[i][j] = dp[i-1][j-curr] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        printdp(dp);
        return dp[num.length][target];
    }
    public static void printdp(boolean arr[][]){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {4,2,7,1,3};
        int target = 10;
        System.out.println(targetSumSubset(num,target));
    }
}
