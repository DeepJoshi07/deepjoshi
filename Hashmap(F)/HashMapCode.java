import java.util.LinkedList;
import java.util.*;

public class HashMapCode{
   
    static class HashMap<K,V>{
        private int n;
        private int N;
        private LinkedList<Node>arr[];
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n =0;
            this.N = 4;
            this.arr = new LinkedList[4];
            for(int i = 0;i < arr.length;i++){
               this.arr[i] = new LinkedList<>();
            }
        }
        private int HashMapFunction(K key){
            return Math.abs(key.hashCode())%N;
        }
       
        private int searchinll(K key,int index){
            LinkedList <Node> ll = arr[index];
            int di = 0;
            for(int i =0;i < ll.size();i++){
                Node node = ll.get(i);
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key,V value){
            int bi = HashMapFunction(key);
            int di = searchinll(key, bi);

            if(di != -1){
                Node node = arr[bi].get(di);
                node.value = value;
            }else{
                arr[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (n/N);
            if(lambda > 2){
                rehashing();
            }
        }

        private void rehashing(){
            LinkedList<Node>oldarr[]=arr;
            N = N*2;
            arr = new LinkedList[N];

            for(int i = 0;i < arr.length;i++){
                arr[i] = new LinkedList<>();
            }

            for(int i = 0;i < oldarr.length;i++){
                LinkedList<Node> ll = oldarr[i];
                for(int j = 0;j < ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public V get(K key){
            int index = HashMapFunction(key);
            int di =searchinll(key, index);

            if(containsKey(key)){
                Node node = arr[index].get(di);
                return node.value;
            }
            return null;
        }
        public boolean containsKey(K key){
            int index = HashMapFunction(key);
            int di = searchinll(key, index);

            if(di != -1){
                return true;
            }
            return false;
        }
        public V remove(K key){
            int index = HashMapFunction(key);
            int di = searchinll(key, index);

            if(containsKey(key)){
                Node node = arr[index].get(di);
                arr[index].remove(di);
                return node.value;
            }
            return null;
        }
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0;i < arr.length;i++){
                LinkedList<Node> ll = arr[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
  public static void main(String[] args) {
    
  }
}
