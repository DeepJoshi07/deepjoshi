package recursion;

public class Numtostring {
    public static void numtoString(String arr[], int num) {
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;
        System.out.print(arr[lastdigit] + " ");
        num = num / 10;
        numtoString(arr, num);
    }

    public static void main(String[] args) {
        int num = 2002;
        String arr[] = { "Zero", "One", "Two", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine", "Ten" };
        numtoString(arr, num);
    }

}
