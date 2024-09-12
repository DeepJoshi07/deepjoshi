import java.util.*;

public class Mergesort2 {
    public static void printarr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + ", ");
        }
    }

    public static void mergesort2(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort2(arr, si, mid);
        mergesort2(arr, mid + 1, ei);
        merge2(arr, si, mid, ei);
    }

    public static void merge2(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mass", "mucury" };
        mergesort2(arr, 0, arr.length - 1);
        printarr(arr);
    }

}
