import java.util.HashMap;
import java.util.*;

public class Practice {
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
    }
}
