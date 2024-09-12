import java.util.HashMap;
import java.util.HashSet;

public class Hashsetquetions {
    public static String path(HashMap<String,String>hm){
        HashMap<String,String> hm1 = new HashMap<>();
        
        for(String value:hm.keySet()){
            hm1.put(hm.get(value),value);
        }
        for(String value:hm.keySet()){
            if(!hm1.containsKey(value)){
                return value;
            }
        }
        return null;
       
    }
    public static void main(String[] args) {
        
        // iteration
        HashSet<String> hs = new HashSet<>();
        hs.add("Ahmedabad");
        hs.add("Bengluru");
        hs.add("Chennai");
        hs.add("Delhi");
        hs.add("Gandhinagar");

        for(String value:hs){
            System.out.print(value+" ");
        }
        System.out.println();

        // count distinct element

        HashSet<Integer> hs1 = new HashSet<>();
        int []arr = {1,2,3,2,3,4,1,5,6,9,9};

        for(int number:arr){
            hs1.add(number);
        }
        System.out.println(hs1.size());

        // Unioun & intersection

        int arr1 []={1,2,3,4};
        int arr2 []={3,4,5,6};

        HashSet<Integer> hs2 = new HashSet<>();
        for(Integer value:arr1){
            hs2.add(value);
        }
        for(Integer value:arr2){
            hs2.add(value);
        }
        System.out.println(hs2);

        // intersection

        HashSet<Integer> hs3 = new HashSet<>();
        for(Integer value:arr1){
            hs3.add(value);
        }
        for(int i = 0; i < arr2.length;i++){
            if(hs3.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.println();
        // find path from tickets

        HashMap<String,String> hm = new HashMap<>();
        hm.put("Chennai","Bengluru");
        hm.put("Mumbai","Delhi");
        hm.put("Goa","Chennai");
        hm.put("Delhi","Goa");
        
        String start = path(hm);
        System.out.print(start+"--> ");
        for(String value:hm.keySet()){
            System.out.print(hm.get(start)+"--> ");
            start = hm.get(start);
        }




    }
}
