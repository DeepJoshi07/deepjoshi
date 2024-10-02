import java.util.*;
public class Heap {
    static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(int r,String n){
            this.rank = r;
            this.name = n;
        }
        @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(12);
        pq.add(30);
        pq.add(85);
        pq.add(22);
        
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();

        PriorityQueue <Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(15);
        pq2.add(12);
        pq2.add(30);
        pq2.add(85);
        pq2.add(22);
        
        while(!pq2.isEmpty()){
            System.out.print(pq2.peek()+" ");
            pq2.remove();
        }
        System.out.println();

        PriorityQueue <Student> spq = new PriorityQueue<>();
        spq.add(new Student(15,"Rahul"));
        spq.add(new Student(5,"Kohli"));
        spq.add(new Student(25,"Rohit"));
        spq.add(new Student(55,"Raina"));
        spq.add(new Student(35,"Dhoni"));

        while(!spq.isEmpty()){
            System.out.println(spq.peek().rank +"-->"+ spq.peek().name);
            spq.remove();
        }
        System.out.println();

        PriorityQueue <Student> spq2 = new PriorityQueue<>(Comparator.reverseOrder());
        spq2.add(new Student(15,"Rahul"));
        spq2.add(new Student(5,"Kohli"));
        spq2.add(new Student(25,"Rohit"));
        spq2.add(new Student(55,"Raina"));
        spq2.add(new Student(35,"Dhoni"));

        while(!spq2.isEmpty()){
            System.out.println(spq2.peek().rank +"-->"+ spq2.peek().name);
            spq2.remove();
        }
        System.out.println();
    }
}
