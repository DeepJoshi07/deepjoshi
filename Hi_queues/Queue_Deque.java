package Hi_queues;
import java.util.*;
public class Queue_Deque {
    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
        public static void add(int data){
            dq.addLast(data);
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.peekLast();
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.removeFirst();
        }
    }
    public static void main(String[] args) {
        
    }
}
