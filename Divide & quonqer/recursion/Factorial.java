package recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        int facto = n * factorial(n - 1);
        return facto;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));
    }

}
