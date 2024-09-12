package Hi_queues;

import java.util.*;

public class Queue_questions {
    public static void first_re_ch(String str){
        int arr[]= new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            arr[ch -'a']++;

            while(!q.isEmpty() && arr[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void interleave(Queue<Integer>q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();

        for(int i = 0;i < size/2;i++){
            firsthalf.add(q.remove());
        }

        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }

    public static void reverse_q(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
         // first repeating letter

        String ch ="aabccxb";
        first_re_ch(ch);

        // interleave

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
       
        interleave(q1);
        while(!q1.isEmpty()){
            System.err.print(q1.remove()+" ");
        }
        System.out.println();

        // reverse of Queue

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        reverse_q(q2);
        while(!q2.isEmpty()){
            System.out.print(q2.remove()+" ");
        }
        System.out.println();
    }
}
