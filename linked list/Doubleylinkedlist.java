public class Doubleylinkedlist {
     static class Node{
        int data;
        Node next,prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void addfirst(int data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;

    }

    public void printdll(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int removefirst(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return -1;
        }
        if(size == 1){
            int temp = head.data;
            head = tail = null;
            size--;
            return temp;
        }
        size--;
        int temp = head.data;
        head = head.next;
        head.prev = null;
        return temp;
    }

    public static void reversdll(){
        if(head == tail){
            return;
        }
        Node next;
        Node curr = head;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }
    public static void main(String[] args) {
        
    }
}
