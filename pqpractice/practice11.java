import java.util.*;

public class practice11 {
    public static int maxprofit(int array[]) {
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i; j <= array.length - 1; j++) {
                profit = array[j] - array[i];
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }

        }
        return maxProfit;
    }

    public static boolean sameValue(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int indexNum(int array[], int target) {
        int count = 0;
        while (count < array.length) {
            if (array[count] == target) {
                break;
            }
            count++;
        }
        if (array[count] != target) {
            count = -1;
        }
        return count;
    }

    public static void main(String args[]) {
        // int stockPrice[] = { 12, 3, 56, 50, 44, 9 };
        // // System.err.println("Your max profit is = " + maxprofit(stockPrice));
        // int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println(sameValue(numbers));
        int nums[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 5;
        System.err.println("your target's index number is = " + indexNum(nums, target));
    }

}
