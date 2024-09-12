import java.util.*;
public class Heap2 {
    static class heap{
        ArrayList<Integer> al = new ArrayList<>();
        public void add(int data){
            al.add(data);
    
            int x = al.size()-1;
            int par = (x-1)/2;
    
            while(al.get(x)< al.get(par)){
                int temp = al.get(x);
                al.set(x,al.get(par));
                al.set(par,temp);
    
                x = par;
                par = (x-1)/2;
            }
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;


            if(left < al.size() && al.get(minidx) > al.get(left)){
                minidx = left;
            }
            if(right < al.size() && al.get(minidx) > al.get(right)){
                minidx = right;
            }

            if(minidx != i){
                int temp = al.get(i);
                al.set(i,al.get(minidx));
                al.set(minidx,temp);

                heapify(minidx);
            }
        }
        public int remove(){
            int data = al.get(0);

            int temp = al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1,temp);

            al.remove(al.size()-1);
            heapify(0);
            return data;
        }

        public static void heapify_max(int arr[],int i,int size){
            int left = 2*i+1;
            int right = 2*i+2;
            int maxidx = i;

            if(left < size && arr[left] > arr[maxidx]){
                maxidx = left;
            }
            if(right < size && arr[right] > arr[maxidx]){
                maxidx = right;
            }

            if(maxidx != i){
                int temp = arr[i];
                arr[i] = arr[maxidx];
                arr[maxidx] = temp;

                heapify_max(arr, maxidx, size);
            }
        }

        public static void heapSort(int arr[]){
            int n = arr.length;
            for(int i = n/2;i >= 0;i--){
                heapify_max(arr,i,n);
            }

            for(int i = n-1;i > 0;i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify_max(arr,0,i);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
