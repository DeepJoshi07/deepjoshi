public class Subsets {
    public static void printsubset(String any, String ans, int n) {
        if (n == any.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty Set");
            } else {
                System.out.println(ans);
            }
            return;
        }
        printsubset(any, ans + any.charAt(n), n + 1);
        printsubset(any, ans, n + 1);
    }

    public static void main(String[] args) {
        String any = "abcd";
        int n = 0;
        String ans = "";
        printsubset(any, ans, n);
    }
}