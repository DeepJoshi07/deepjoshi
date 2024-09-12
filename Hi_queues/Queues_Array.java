package Hi_queues;

public class Queues_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size =n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear= rear+1;

            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear;i++){
                arr[i] = arr[i+1];
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    static class Circuler_queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        public Circuler_queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }

            return value;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        // Queue q = new Queue (5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // for(int i = 0 ;  i < q.size;i++){
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        // }

        Circuler_queue cq = new Circuler_queue(5);
        cq.add(5);
        cq.add(10);
        cq.add(15);
        cq.add(20);
        cq.add(25);
       System.out.println( cq.remove());
        cq.add(35);
       System.out.println(cq.remove()); 
        cq.add(45);
        System.out.println();
        while(!cq.isEmpty()){
            System.err.println(cq.peek());
            cq.remove();
        }
        System.out.println();
    }
}
