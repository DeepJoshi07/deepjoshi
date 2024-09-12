package recursion;

public class Occrance {
    public static void occurance(int arr[], int key, int i) {
        if (i == -1) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        occurance(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        int i = arr.length - 1;
        occurance(arr, key, i);

    }

}
