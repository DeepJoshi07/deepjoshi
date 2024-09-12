import java.util.*;
public class Hash_map {
    public static void main(String[] args) {
        // HashMap<Integer,Integer> hm = new HashMap<>();

        // hm.put(1,100);
        // hm.put(2,200);
        // hm.put(3,300);
        // hm.put(4,400);
        // hm.put(5,500);

        // Set<Integer> keys = hm.keySet();
        // System.out.println("Keys: "+keys);
        // for(Integer value: hm.keySet()){
        //     System.out.println(hm.get(value));
        // }
        // System.out.println(hm.containsKey(4));
        // System.out.println(hm.isEmpty());
        // System.out.println(hm.size());
        // System.out.println(hm.remove(5));
        // System.out.println(hm);

    //     LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();

    //     lm.put("delhi",1);
    //     lm.put("mumbai",2);
    //     lm.put("Ahmedabad",5);
    //     lm.put("benglore",3);
    //     lm.put("haidrabad",4);

    //     System.out.println(lm);
    //     Set<String> set = lm.keySet();
    //     System.out.println(set);
    //     for(String value:lm.keySet()){
    //         System.err.print(lm.get(value)+",");
    //     }
    //     System.out.println();
    //    System.out.println(lm.remove("Ahmedabad"));
    //    System.out.println(lm.get("benglore"));
    //    System.out.println(lm.isEmpty());
    //    System.out.println(lm.size());
       
            TreeMap<Integer, String> tm = new TreeMap<>();
            tm.put(4,"hocky");
            tm.put(2,"kabbadi");
            tm.put(1,"cricket");
            tm.put(3,"bedmintan");
            tm.put(5,"football");

            System.out.println(tm);
            for(Integer value:tm.keySet()){
                System.out.print(tm.get(value)+",");
            }
            System.out.println();
            System.out.println(tm.size());
            System.out.println(tm.isEmpty());
            System.out.println(tm.containsKey(3));
            System.out.println(tm.remove(2));
            System.out.println(tm);
    }
}
