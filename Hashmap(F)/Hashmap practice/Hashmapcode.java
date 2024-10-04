import java.util.*;
public class Hashmapcode{
static class Hashmap<K,V> {
    private class Node{
        K key;
        V value;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    private int n;
    private int N;
    private LinkedList<Node> bucket[];
    @SuppressWarnings("unchecked")

    public Hashmap(){
        this.N = 4;
        this.bucket = new LinkedList[N];
        for(int i = 0;i < bucket.length;i++){
            bucket[i] = new LinkedList<>();
        }
    }
    private int Hashfunction(K key){
        return Math.abs(key.hashCode()) % N;
    }

    private int searchInll(K key,int bi){
        LinkedList<Node> ll = bucket[bi];
        int di = 0;

        for(int i = 0; i < ll.size();i++){
            Node node = ll.get(i);
            if(node.key == key){
                return di;
            }
            di++;
        }
        return -1;
    }

    public void put(K key,V value){
        int bi = Hashfunction(key);
        int di = searchInll(key, bi);

        if(di != -1){
            Node node = bucket[bi].get(di);
            node.value = value;
        }else{
           bucket[bi].add(new Node(key,value));
           n++;
        }

        double lembda = (double) n/N;
        if(lembda > 2){
            rehash();
        }
    }
    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node> oldlist[] = bucket;
        bucket = new LinkedList[N*2];

        for(int i = 0; i < bucket.length;i++){
            bucket[i] = new LinkedList<>();
        }

        for(int i = 0; i < oldlist.length;i++){
            LinkedList<Node> ll = oldlist[i];
            for(int j = 0; j < ll.size();j++){
                Node node = ll.get(j);
                put(node.key,node.value);
            }
        }
    }

    public boolean containsKey(K key){
        int bi = Hashfunction(key);
        int di = searchInll(key, bi);

        if(di != -1){
            return true;
        }else{
            return false;
        }
    }

    public V remove(K key){
        int bi = Hashfunction(key);
        int di = searchInll(key, bi);

        if(di != -1){
            Node node = bucket[bi].get(di);
            bucket[bi].remove(di);
            n--;
            return node.value;
        }else{
            return null;
        }
    }

    public V get (K key){
        int bi = Hashfunction(key);
        int di = searchInll(key, bi);

        if(di != -1){
            Node node = bucket[bi].get(di);
            return node.value;
        }else{
            return null;
        }
    }
    
    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();

        for(int i = 0; i < bucket.length; i++){
            LinkedList<Node> ll = bucket[i];
           for (Node node : ll) {
                keys.add(node.key);
           }
        }
        return keys;
    }
}
    public static void main(String[] args) {
        Hashmap <String,Integer> hm = new Hashmap<>();
        hm.put("india",128);
        hm.put("chaina",151);
        hm.put("usa",34);
        hm.put("pak",28);
        hm.put("japan",5);
        for (String string : hm.keySet()) {
            System.out.println(hm.get(string));
        }
        System.out.println(hm.remove("pak"));
        System.out.println(hm.containsKey("pak"));



    }
}
