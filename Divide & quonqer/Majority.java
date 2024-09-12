public class Majority {
    public static int majority(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }
        int mid = si + (ei - si) / 2;
        int ansA = majority(arr, si, mid);
        int ansB = majority(arr, mid + 1, ei);

        int countA = getcount(arr, si, mid, ansA);
        int countB = getcount(arr, mid + 1, ei, ansB);

        if (countA > countB) {
            return ansA;
        } else {
            return ansB;
        }
    }

    public static int getcount(int arr[], int si, int ei, int ans) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == ans) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 20, 10, 20, 20, 20, 30, 30, };
        System.out.println(majority(arr, 0, arr.length - 1));
    }

}
