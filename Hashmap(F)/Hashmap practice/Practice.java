import java.util.HashMap;
import java.util.*;

public class Practice {
    public static String getStart(HashMap<String,String> hm ){
        HashMap<String,String> rev = new HashMap<>();
        for(String key : hm.keySet()){
            rev.put(hm.get(key),key);
        }
        for(String key : hm.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        
        return null;
    }
    public static void main(String[] args) {
        int nums[] ={3,3,2,5,1,3,1,5,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums){
            if(hm.containsKey(num)){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }else{
                hm.put(num,1);
            }
        }

        for(Integer key:hm.keySet()){
            if(hm.get(key) > nums.length/3){
                System.out.println(key);
            }
        }

        // queation 2

        String str1 ="heart";
        String str2 = "earth";

        HashMap<Character,Integer> anagaram = new HashMap<>();

        for(int i = 0;i < str1.length();i++){
            anagaram.put(str1.charAt(i),anagaram.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i = 0;i < str2.length();i++){
            anagaram.remove(str1.charAt(i));
        }
        if(anagaram.isEmpty()){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        // count uniqe element

        int el[] = {1,2,3,2,1,1,4,5,8,9,9,7};
        HashSet <Integer> hs = new HashSet<>();
        for(int num: el){
            hs.add(num);
        }
        System.out.println("The count of distinct element is = "+hs.size());


        // unioun

        int u1[] = {1,2,3,4,5,6};
        int u2[] = {5,6,7,8,9,10};

        HashSet<Integer> u = new HashSet<>();
        for(int num: u1){
            u.add(num);
        }
        for (int num : u2) {
            u.add(num);
        }
        System.out.println(u);


        // insertoin

        u.clear();

        for(int num: u1){
            u.add(num);
        }
        System.err.print("Insertion = ");
        for(int num: u2){
            if(u.contains(num)){
                System.out.print(num+" ");
            }else{
                u.add(num);
            }
        }
        System.out.println();



        // itenrary for tickets

        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chan","ben");
        tickets.put("mum","del");
        tickets.put("goa","chan");
        tickets.put("del","goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String des: tickets.keySet()){
            System.out.print("-->"+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();



        // Largest sum in sub array
        int sub_sum [] = {15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> subSum = new HashMap<>();

        int sum = 0;
        int length = 0;
        for(int i = 0;i < sub_sum.length;i++){
            sum += sub_sum[i];
            if(subSum.containsKey(sum)){
                length = Math.max(length,i - subSum.get(sum));
            }else{
                subSum.put(sum,i);
            }
        }
        System.out.println("maximum length of subarray where sum is 0 = "+length);



        // Sub array sum equal to K

        int s_Array []= {10,2,-2,-20,10};
        int k = -10;
        int sum2 = 0;
        HashMap<Integer,Integer> hmk = new HashMap<>();
        int count = 0;
        hmk.put(0,1);
        for(int i = 0; i < s_Array.length;i++){
            sum2 += s_Array[i];
            if(hmk.containsKey(sum2-k)){
                count += hmk.get(sum2-k);
            }
                
            hmk.put(sum2,hmk.getOrDefault(sum2,0)+1);
            
        }
        System.out.println("number of such array(sub) where sum equal to "+k+" = "+count);
    }
}
