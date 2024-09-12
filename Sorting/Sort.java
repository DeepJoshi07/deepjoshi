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
    public static void main(String[] args) {
        int []arr ={25,10,5,35,30,20};
        quicksort(arr,0,arr.length-1);
        printlist(arr);
    }
}
//deep joshi is my name.