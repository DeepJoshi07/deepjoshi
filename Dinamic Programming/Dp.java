import java.util.*;
public class Dp{
   
    public static int fibonachi(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2); 
    }


    // memoization

    public static int fibonachi_m(int n,int f[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fibonachi_m(n-1, f) + fibonachi_m(n-2, f);

        return f[n];
    }


    // tabulation

    public static int fibonachi_t(int fibo){
        int dp[] = new int[fibo+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i <= fibo;i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[fibo];
    }
    public static void main(String[] args) {
        int fibo = 6;
        System.out.println(fibonachi(fibo));



        int f[] = new int[fibo+1];
        System.out.println(fibonachi_m(fibo, f));


       
        System.out.println(fibonachi_t(fibo));
    }
}