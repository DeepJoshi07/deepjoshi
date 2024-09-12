package Hi_queues;
import java.util.*;
public class Deques {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(12);
        dq.addLast(20);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
