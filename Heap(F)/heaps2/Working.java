import java.util.*;

import ArrayList.Arraylist;
public class Working {
    Arraylist <Integer> al = new Arraylist();

    public void add(int data){
        al.add(data);
        int x = al.size()-1;
        int parent = (x-1)/2;

        while(al.get(x) > al.get(parent)){
            int temp = al.get(x);
            al.set(x, al.get(parent));
            al.set(parent, temp);

            x = parent;
            parent = (x-1)/2;
        }
    }

    public int peek(){
        return al.get(0);
    }

    private void heapify(int idx){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int minidx = idx;

        if(left < al.size() && al.get(left) < al.get(minidx)){
            minidx = left;
        }

        if(right < al.size() && al.get(right) < al.get(minidx)){
            minidx = right;
        }

        if(minidx != idx){
            int temp = al.get(idx);
            al.set(idx, al.get(minidx));
            al.set(minidx,temp);

            heapify(minidx);
        }
    }

    public int remove(){
        int data = al.get(0);
        al.set(0, al.get(al.size()-1));
        al.set(al.size()-1,data);

        al.remove(al.size()-1);

        heapify(0);
        return data;
    }
    public static void main(String[] args) {
        
    }
}
