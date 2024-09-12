import java.util.*;
import java.util.Stack;

public class Stack_Questions {
    public static void pushatbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.add(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s,data);
        s.add(top);
    }

    public static String reverse_String(String s){
        Stack<Character> c = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            c.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!c.isEmpty() ){
            char ch = c.pop();
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void reverse_stack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top =s.pop();
        reverse_stack(s);
        pushatbottom(s, top);
    }

    public static void stock_span(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1;i < stocks.length;i++){
            int stock = stocks[i];
            while(!s.isEmpty() && stocks[s.peek()] < stock ){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevhigh = s.peek();
                span[i] = i - prevhigh; 
            }
            s.push(i);
        }
    }

    public static boolean isValidParanthesses(String s){
        Stack<Character> s1 = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s1.push(ch);
            }else{
                if(s1.isEmpty()){
                    return false;
                }
                if(s1.peek() == '(' && ch == ')' ||
                  s1.peek() == '{' && ch == '}' || 
                  s1.peek() == '[' && ch == ']' ){
                    s1.pop();
                  }else{
                    return false;
                  }
            }
        }
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    // ((a+b))
    public static boolean duplicat_parentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            // ((a+(b-c)))
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void maxArea(int arr[]){
        int maxarea = 0;
        int nsr[] = new int [arr.length];
        int nsl[] = new int [arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = 0;i < arr.length;i++){
            int curr = arr[i];

            if(!s.isEmpty() && arr[s.peek()] >= curr){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for(int i = arr.length-1;i >= 0;i--){
            int curr = arr[i];

            if(!s.isEmpty() && arr[s.peek()] >= curr){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0; i < arr.length;i++){
            int h = arr[i];
            int w = nsr[i] - nsl[i] - 1;
            int cuurarea = h*w;
            maxarea = Math.max(cuurarea,maxarea);
        }
        System.out.println("max area in histogram = "+ maxarea);
    }
    public static void main(String[] args) {
        int []arr={6,8,0,1,3};
        Stack <Integer>s = new Stack<>();
        int nextgrater[]= new int[arr.length];

        for(int i = arr.length-1;i >= 0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextgrater[i] = -1;
            }else{
                nextgrater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0;i < nextgrater.length;i++){
            System.out.print(nextgrater[i]+" ");
        }
        System.out.println();

        // push at bottom
        Stack<Integer> s1 = new Stack<>();
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);

        pushatbottom(s1, 10);
        System.out.println(s1);
        while(!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
        System.out.println();

        // reverse a String
        String st ="Deep is here";
        String newst = reverse_String(st);
        System.out.println(newst);

        // reverse Stack

        Stack<Integer> s2 = new Stack<>();
        s2.add(20);
        s2.add(30);
        s2.add(40);
        s2.add(50);
        reverse_stack(s2);
        while(!s2.isEmpty()){
            System.out.print(s2.pop()+" ");
        }
        System.out.println();

        // stock span

        int stocks[] = {100, 80, 60, 70, 60, 100};
        int span[] = new int[stocks.length];

        stock_span(stocks, span);

        for(int i = 0; i < span.length;i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();

        // valid Paranthesis

        String str ="{[()]}";
        System.out.println(isValidParanthesses(str));

        // Duplicat parentheses

        String str2 ="";
        System.out.println(duplicat_parentheses(str));

        // Hisrogram

        int height[] ={2,1,5,6,2,3};
        maxArea(height);

        
    }
    
}
