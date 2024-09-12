import java.util.*;

public class Heap {
    static class Student implements Comparable<Student>{
        int rollno;
        String name;
        int id;

        public Student(int rollno,int id,String name){
            this.name = name;
            this.id=id;
            this.rollno=rollno;
        }

        @Override
        public int compareTo(Student s1){
            return this.rollno - s1.rollno;
        }
    }

   
    
    public static void main(String[] args) {
        PriorityQueue<Student>pq = new PriorityQueue<>();
        pq.add (new Student(4,101,"Deep"));
        pq.add (new Student(2,102,"Rahul"));
        pq.add (new Student(1,103,"Raina"));
        pq.add (new Student(3,104,"Rinku"));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-->"+ pq.peek().id +"-->"+ pq.peek().rollno);
            pq.remove();
        }

    }
}
