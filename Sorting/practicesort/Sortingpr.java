package Sorting.practicesort;

public class Sortingpr {
    public static void quicksort(int []arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int pivotidx = pivot(arr,si,ei);
        quicksort(arr, si, pivotidx-1);
        quicksort(arr, pivotidx+1, ei);
    }

    public static int pivot(int []arr,int si,int ei){
        int pivot = si;
        int j = si;

        for(int k = si+1; k < ei; k++){
            if(arr[pivot] > arr[k]){
                j++;
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                
            }
        }
        int temp =arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        return j;
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(int []arr,int si,int ei,int mid){
        int temp[]=new int [ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(i = si,k = 0; k < temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }
    public static void bubblesort(int arr[]){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for(int i = 0; i < arr.length;i++){
            int minidx = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i = 1;i < arr.length;i++){
            int curr = arr[i];
            int previdx = i-1;

            while(previdx >= 0 && arr[previdx] > curr){
                arr[previdx+1] = arr[previdx];
                previdx-=1;
            }
            arr[previdx+1] = curr;
        }
    }

    public static void countsort(){}

    public static void printarr(int[]arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,6,1,7,3,2,5};
        // quicksort(arr,0,arr.length);
        // mergesort(arr, 0, arr.length-1);
        // bubblesort(arr);
        // selectionsort(arr);
        insertionsort(arr);
        printarr(arr);
    }
}
