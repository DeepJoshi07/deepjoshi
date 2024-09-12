import java.util.*;

public class Stack_Deque {
    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isempty(){
            return dq.isEmpty();
        }


        public static void push(int data){
            if(isempty()){
                dq.add(data);
                return;
            }
            dq.addLast(data);
        }


        public static int pop(){
            if(isempty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return dq.removeLast();
        }


        public static int peek(){
            if(isempty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return dq.peekLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.peek());

        while(!s.isempty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
}
