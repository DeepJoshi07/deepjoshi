package Sorting;

public class Sort {
    public static void printlist(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int si, int ei ){
        if(si>=ei){
            return;
        }
        int pivot_index = pivot(arr,si,ei);
        quicksort(arr,si,pivot_index-1);
        quicksort(arr, pivot_index+1, ei);
    }
    public static int pivot(int arr[],int si,int ei){
        int i = si-1;
        int piv = ei;
        for(int j = si; j < ei;j++){
            if(arr[j]<=arr[piv]){
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
            
        }
        i++;
        int temp= arr[i];
        arr[i] = arr[piv];
        arr[piv] = temp;
        return i;
    }
    public static void heapify(int arr[],int idx,int size){
        int largest = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;

        if(left < size && arr[left] >= arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] >= arr[largest]){
            largest = right;
        }

        if(largest != idx){
            int temp = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, size);
        }
    }
    public static void heapsort(int arr[]){
        int n = arr.length;
        for(int i = n/2;i >= 0;i--){
            heapify(arr,i,n);
        }

        for(int i = n-1;i >= 0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int []arr ={25,10,5,35,30,20};
        // quicksort(arr,0,arr.length-1);
        heapsort(arr);
        printlist(arr);
    }
}
//hi how are you?