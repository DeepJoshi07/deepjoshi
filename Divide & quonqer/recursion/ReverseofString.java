package recursion;

public class ReverseofString {
    public static void reverseOfstring(String any, int i) {
        if (i == 0) {
            char cha = any.charAt(0);
            System.out.print(cha + " ");
            return;
        }
        char ch = any.charAt(i);
        System.out.print(ch + " ");
        reverseOfstring(any, i - 1);
    }

    public static void main(String[] args) {
        String name = "Deep_Joshi";
        reverseOfstring(name, name.length() - 1);
    }

}
