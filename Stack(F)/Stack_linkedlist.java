import java.util.*;

public class Stack_linkedlist {
    static class Stack{
        static class Node {
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node node = new Node(data);
            if(isEmpty()){
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }
        public static int peek(){
            if(isEmpty()){
                System.err.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
    }
    public static void main(String[] args) {
        
    }
}
