import java.util.*;
public class Tries {
    static class Node{
        Node children [] = new Node [26];
        boolean isEndOfWord = false;

        Node(){
            for(int i = 0;i < children.length;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0;i < word.length();i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length();i++){
            int index = key.charAt(i) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isEndOfWord == true;
    }

    public static boolean wordBreak(String s){
        if(s.length() == 0){
            return true;
        }
        for(int i = 1;i <= s.length();i++){
            if(search(s.substring(0,i)) &&
            wordBreak(s.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean searchPrefix(String s){
        Node curr = root;
        for(int i = 0;i < s.length();i++){
            int index = s.charAt(i) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public static int substrings(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0;i < 26;i++){
            if(root.children[i] != null){
                count += substrings(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        // String words[] = {"the","a","there","their","any","thee"};

        // for(int i = 0;i < words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("ther"));




        // WordBreak
        // String words2[] = {"i","like","samsung","sam","mobile","ice"};
        // for(int i = 0;i < words2.length;i++){
        //         insert(words2[i]);
        //     }
        // String s = "ilikesamsungmobile";
        // System.out.println(wordBreak(s));



        // Search the prefix
        // System.out.println(searchPrefix("lie"));



        // Uniqe substrings
        String s1 = "ababa";
        for(int i = 0;i < s1.length();i++){
            String suffix = s1.substring(i);
            insert(suffix);
        }
        System.out.println(substrings(root));

        
    }
    
}
