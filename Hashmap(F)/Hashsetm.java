import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hashsetm {
    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>();

        // hs.add(30);
        // hs.add(10);
        // hs.add(40);
        // hs.add(50);
        // hs.add(20);

        // System.out.println(hs);
        // System.out.println(hs.size());
        // System.out.println(hs.isEmpty());
        // hs.remove(10);
        // System.out.println(hs.contains(20));
        // hs.clear();

        // LinkedSet
        // LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        // ls.add(40);
        // ls.add(50);
        // ls.add(10);
        // ls.add(30);
        // ls.add(20);

        // System.out.println(ls);
        // ls.remove(10);
        // System.out.println(ls.contains(10));
        // System.out.println(ls.size());
        // System.out.println(ls.isEmpty());
        // ls.clear();

        // TreeSet

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(10);

        System.out.println(ts);
        ts.remove(50);
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains(20));
        ts.clear();
    }
    
}
