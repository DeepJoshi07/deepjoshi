public class Insertioncount {
    public static int insertioncount(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;
        int ans = 0;
        ans += insertioncount(arr, si, mid);
        ans += insertioncount(arr, mid + 1, ei);
        ans += merge(arr, si, mid, ei);
        return ans;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int pairs = 0;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                if (si == 0) {
                    pairs += mid - si;
                } else {
                    pairs += (mid - si + 1);
                }

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
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return pairs;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 6, 4, 1, 3, 5 };
        System.out.println(insertioncount(arr, 0, arr.length - 1));
    }

}
