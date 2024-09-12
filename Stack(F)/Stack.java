
import java.util.ArrayList;
import java.util.LinkedList;

public class Stack {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stackb {
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }

    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.removeLast();
    //     }

    //     public static void push(int data) {
    //         list.addLast(data);
    //     }

    
    static Node head = null;
    public static boolean isempty(){
        return head == null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
        
    }
    public static int peek(){
        if(isempty()){
            return -1;
        }
        return head.data;
    }
    }

    public static void main(String[] args) {
    //     Stackb s = new Stackb();
    //     s.push(20);
    //     s.push(30);
    //     s.push(15);
    //     System.out.println("----" + s.peek());
    //     s.push(22);
    //     s.push(38);
    //     while (!s.isEmpty()) {
    //         System.out.println(s.pop());
    //     }
    
        Stackb lista = new Stackb();

}


}
