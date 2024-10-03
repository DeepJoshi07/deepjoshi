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

    public static void countsort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] temp= new int [max+1];
        for(int i = 0; i < arr.length;i++){
            temp[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0 ; i < temp.length;i++){
            if(temp[i] > 0){
                arr[idx++] = i;
                temp[i]--;
            }
        }
    }

    private static void heapify(int arr[],int idx,int size){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxidx = idx;

        if(left < size && arr[left] > arr[maxidx]){
            maxidx = left;
        }

        if(right < size && arr[right] > arr[maxidx]){
            maxidx = right;
        }

        if(maxidx != idx){
            int temp = arr[idx];
            arr[idx] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr,maxidx,size);
        }
    }

    public static void heapsort(int arr[],int idx,int size){
        for(int i = size/2; i >= 0;i++){
            heapify(arr,idx,size);
        }
        for(int i = size-1;i >= 0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

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
        // insertionsort(arr);
        // countsort(arr);
        heapsort(arr, 0, arr.length);
        printarr(arr);
    }
}
