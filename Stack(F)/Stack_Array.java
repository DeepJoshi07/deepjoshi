import java.util.*;

public class Stack_Array {
    static class Stack{
        static ArrayList<Integer> al = new ArrayList<>();
        public static boolean isEmpty(){
            return al.size() == 0;
        }
        public static void push(int data){
                al.add(data);
                return;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return al.get(al.size()-1);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int temp = al.removeLast();
            return temp;
        } 
    }
    public static void main(String[] args) {
        Stack s = new Stack();
    }
}
