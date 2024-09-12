package Hi_queues;
import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
            q.add(12);
            q.add(22);
            q.add(33);
            q.add(44);
            q.add(55);
            System.out.println(q);
            System.out.println(q.remove());
            System.out.println(q.isEmpty());
            System.out.println(q.peek());
        
    }
    
}
