package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>alist = new ArrayList<>();
        alist.add(15);
        alist.add(25);
        alist.add(35);
        alist.addFirst(5);
        alist.addLast(45);
        System.out.println(alist.size());
        System.out.println(alist);
        alist.removeLast();
        System.out.println(alist);
        alist.remove(2);
        
        System.out.println(alist);
    }
}
// add
// addFirst
// addLast
// removeFirst
// removeLast
// remove
// size
// 
