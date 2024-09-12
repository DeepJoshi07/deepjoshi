public class Linkedlist {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size = 0;
        public void add(int data){
            Node newnode = new Node(data);
            if(head == null){
                head =tail= newnode;
                return;
            }
            newnode = head;
            head = newnode;
            size++;
           
        }
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public void addFirst(int data){
            if(head == null){
                add(data);
                return;
            }
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
            size++;
        }
        public void addLast(int data){
            if(head == null){
                add(data);
                return;
            }
            Node newnode = new Node(data);
            tail.next = newnode;
            tail = newnode; 
            size++;
        }
        public int removefirst(){
            if(head==null){
                return -1;
            }
            if(size == 1){
                head =tail =null;
            }
            int temp = head.data;
            head = head.next;
           size--;
            return temp;
            
        }
        public int removeLast(){
            if(head == null){
                return -1;
            }
            if(size == 1){
                int temp = head.data;
                head = tail = null;
                return temp;
            }
            Node temp = head.next.next;
            Node prev = head;
            while(temp != null){
                temp = temp.next;
                prev = prev.next;
            }
            int value = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return value;

        }
        public void insert(int index,int data){
           if(head == null){
                add(data);
                return;
            }
            Node newnode = new Node(data);
            Node prev = head;
            int i = 0;
            while(i < index-1){
                prev = prev.next;
                i++;
            }
            Node temp = prev.next;
            prev.next = newnode;
            newnode.next = temp; 
            size++;
            
        }
        public static boolean isCycle(){
            Node fast = head.next;
            Node slow = head;
            while(fast != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
        
        public boolean isPalindrome(Node head){
        
           Node mid = find_mid(head);
           Node prev = null;
           Node curr = mid.next;
           Node next;
           while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
           }
           Node right = prev;
           Node left = head;
           while(right != null){
            if(left.data != right.data){
                return false;
            }
            left =left.next;
            right = right.next;
           }
           return true;
         
        }
        public static Node find_mid(Node head){
            Node slow = head;
            Node fast = head.next;
            while(fast != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
            return slow;
        }
        public static int delete_Nth_node_from_end(int index ){
            if(isEmpty()){
                System.out.println("LL is Empty");
                return -1;
            }
            Node prev = head;
            Node delete_node = head.next;
            int i = 0;
            int d_idx = size - index;
            while (i < d_idx ) {
                prev = prev.next;
                i++;
                delete_node = delete_node.next;
            }
            int value = delete_node.data;
            prev.next = delete_node.next;
            return value;
        }
        public static void reverse_ll(){
            Node curr = tail = head;
            Node prev = null;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                
                curr = next;
            }
            head = prev;
            
        }
        public int find_key(int key){
            if(isEmpty()){
                System.out.println("LL is empty");
                return -1;
            }
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                i++;
                temp = temp.next;
            }
            return -1;
        }
        public int find_key_rec(Node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            
            int idx = find_key_rec(head.next,key);

            if(idx == -1){
                return -1;
            }
            return idx + 1;
        }


        public static void removeCycle(){
            if(isEmpty()){
                System.out.println("LL is Empty");
                return;
            }
            if(!isCycle()){
                return ;
            }
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                if(fast == slow){
                    return;
                }
                slow = slow.next;
                fast = fast.next.next;
            }

            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;

        }
        public static void printlist(){
            if(head == null){
                System.out.println("list is Empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ ", ");
                temp = temp.next;
            }
            System.out.println();
        }
       
    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(60);
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(5);
        printlist();
        System.out.println(delete_Nth_node_from_end(2));
        printlist();
        

        // list.find_mid(head);
        // boolean result =list.isPalindrome(head);
        // System.out.println(result);
        // list.reverse_ll();
        // System.out.println(list.isPalindrome(head));
        // list.printlist();
        // list.tail.next = head.next.next.next;
        // boolean result = list.isCycle(head);
        // System.out.println(result);
        // list.addFirst(15);
        // list.addLast(25);
        // list.addFirst(5);
        // list.addLast(45);
        // list.printlist();
        // list.removeLast();
        // list.removefirst();
        // list.printlist();
        // list.insert(2, 20);
        // list.printlist();
    }
    
}
