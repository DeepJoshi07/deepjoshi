import java.util.Arrays;

public class ClimbingStairs {
    public static int countways(int num,int ways[]){
        if(num == 0 ){
            return 1;
        }
        if(num < 0){
            return 0;
        }

        
        if(ways[num] != -1){
            return ways[num];
        }
        ways[num] = countways(num-1, ways) + countways(num-2, ways);
        return ways[num];
    }

    public static int countways_dp(int num){
        int dp[] = new int[num+1];
        dp[0] = 1;

        for(int i = 1; i <= num;i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return  dp[num];
    }
    public static void main(String[] args) {
        int num = 5;
        int ways[] = new int[num+1];
        Arrays.fill(ways, -1);
        System.out.println(countways(num,ways));
    }
    
}
