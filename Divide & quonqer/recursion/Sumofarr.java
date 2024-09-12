public class Sumofarr {
    public static int sumofArr(int arr[], int i) {
        if (i == 1) {
            return arr[0];
        }
        int sum = sumofArr(arr, i - 1) + arr[i - 1];
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 15, 16, 17 };
        System.out.println(sumofArr(arr, arr.length));

    }
}