package recursion;

import java.util.*;

public class Fibonachhi {
    public static int fibonachhi(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonachhi(n - 2) + fibonachhi(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(fibonachhi(number));
        for (int a = 0; a <= number; a++) {
            System.out.print(fibonachhi(a) + " ");
        }
    }

}
