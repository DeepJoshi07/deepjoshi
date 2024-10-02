

public class Practicelinkedlist {
    
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    
        public static boolean isempty(){
            return head == null;
        }

        public static void addfirst(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = tail = newNode;
                return;
            }
            size++;
            newNode.next = head;
            head = newNode;
        }

        public static void addlast(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = tail = newNode;
                return;
            }
            size++;
            tail.next = newNode;
            tail = newNode;
        }
        public static int removefirst(){
            if(isempty()){
                return -1;
            }
            int temp = head.data;
            head = head.next;
            size--;
            return temp;
        }

        public static int removelast(){
            if(isempty()){
                return -1;
            }
            Node temp = head;
            size--;
            while(temp.next.next != null){
                temp = temp.next;
            }
            int data = tail.data;
            temp.next = null;
            tail = temp;
            return data;
        }

        public static void printlist(){
            if(isempty()){
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void insert(int data, int idx){
           Node newNode = new Node(data);
            if(isempty()){
                head = tail = newNode;
                return;
            }
            Node temp = head;
            int i = 0;
            while(i < idx-1){
                temp = temp.next;
                i++;
            }
            size++;
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public static int find_key(int key){
            if(isempty()){
                return -1;
            }
            Node temp = head;
            int idx = 0;
            while(temp != null){
                if(temp.data == key){
                    return idx;
                }
                temp = temp.next;
                idx++;
            }
            return -1;
        }

        public static int find_key_rec(int key){
            return helper(head,key);
        }
        public static int helper(Node head,int key){
            if(isempty()){
                return -1;
            }
        
            if(head.data == key){
                return 0;
            }
           int idx = helper(head.next,key);
           if(head == tail){
             return -1;
           }
           return idx+1;
        }
        public static void reverselist(){
            if(isempty()){
                System.out.println("list is empty");
                return;
            }
            Node prev = null;
            Node curr = head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public static boolean isPlindrome(){
            if(isempty()){
                return true;
            }
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node curr = slow.next;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node head2 = prev;
            Node temp = head;
            while(head2 != null){
                if(temp.data != head2.data){
                    return false;
                }
                temp = temp.next;
                head2 = head2.next;
            }
            return true;

        }
        public static boolean isCycle(Node root){
            if(isempty()){
                return false;
            }
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
               
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
        public static void removeCycle(Node head){
            if(isempty()){
                return ;
            }
            if(isCycle(head)){
                Node slow = head;
                Node fast = head.next;
                Node prev = head;
                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                    prev = prev.next.next;
                    if(slow == fast){
                        break;
                    }
                }
                tail = prev;
                prev.next = null;
            }else{
                System.out.println("there is no Cycle");
                return;
            }
        }
        
        // zigzang
        public static void zigzag(){
            if(isempty()){
                return;
            }
            Node slow = head;
            Node fast = head.next;
            if(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node curr = slow;
            Node next;
            Node prev = null;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node head2 = prev;
            Node temp2 = head2;
            while(head2.next != null){
                Node temp = head.next;
                temp2 = head2.next;
                head.next = head2;
                head2.next = temp;
                head2 = temp2;
               
            }
        }
        public static int delete_Nth_nodefromend(int idx){
            if(isempty()){
                return -1;
            }
            int i = 0;
            Node behind = head;
            Node ahead = head.next;
            while(i < size-idx){
                behind = behind.next;
                ahead = ahead.next;
                i++;
            }
            size--;
            int data = ahead.data;
            behind.next = ahead.next;
            return data;

        }
    


    public static void main(String[] args) {
        // LinkedList li = new LinkedList();
        // li.addfirst(10);
        // li.addlast(20);
        // li.addfirst(30);
        // li.addlast(40);
        // li.addfirst(50);

        // li.printlist();
        // li.removelast();

        // li.printlist();
        // li.removefirst();

        // li.printlist();
        // System.out.println(li.size);
        // li.insert(40, 1);
        // li.insert(50, 2);
        // li.printlist();
        // System.out.println(li.find_key(50));
        // System.out.println(li.find_key_rec(50));
        // li.reverselist();
        // li.printlist();
        // li.delete_Nth_nodefromend(2);
        // li.printlist(); 
        // System.out.println();

        // LinkedList list2 = new LinkedList();
        // list2.addlast(10);
        // list2.addlast(20);
        // // list2.addlast(30);
        // list2.addlast(20);
        // list2.addlast(10);
        // list2.printlist();
        // System.out.println(list2.isPlindrome());

    //    head = new Node(10);
    //    head.next = new Node(20);
    //    head.next.next = new Node(30);
    //    head.next.next.next = new Node(40);
    //    head.next.next.next.next = new Node(50);
    //    head.next.next.next.next.next = head.next.next;
    //    removeCycle(head);
    //    System.out.println(isCycle(head));

    Practicelinkedlist list3 = new Practicelinkedlist();
        list3.addlast(10);
        list3.addlast(20);
        list3.addlast(30);
        list3.addlast(40);
        list3.addlast(50);
        list3.addlast(60);

        zigzag();
        list3.printlist();

        
        

    }
}
