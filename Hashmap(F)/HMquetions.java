import java.util.*;
public class HMquetions{

    public static boolean isanagram(String str1,String str2){
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0;i < str1.length();i++){
            char ch = str1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }

        for(int i = 0;i < Math.min(str2.length(),str1.length());i++){
            char ch = str2.charAt(i);
            if(hm.containsKey(ch)){
                hm.remove(ch);
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[] = {1,2,1,3,4,5,1,2,3,2,1};
        // for(int i = 0;i< arr.length;i++){
        //     if(hm.containsKey(arr[i])){
        //         hm.put(arr[i],hm.get(arr[i])+1);
        //     }else{
        //         hm.put(arr[i],1);
        //     }
        // }

        // second way

        for(int i = 0;i < arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }

        // output

        for(Integer value:hm.keySet()){
            if(hm.get(value) > arr.length/3){
                System.out.print(value);
            }
        }
        System.out.println();

        // Quetion 2(Anagram)

        String str1 ="race";
        String str2 ="hare";

        System.out.println(isanagram(str1, str2));


    }
}