import java.util.ArrayList;
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node right,left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static Node build_BST(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(node.data > value){
            node.left = build_BST(node.left, value);
        }else{
            node.right = build_BST(node.right, value);
        }

        return node;
    }

    public static boolean search_key(int key,Node node){
        if(node == null){
            return false;
        }

        if(node.data == key){
            return true;
        }

        if(node.data > key){
           return search_key(key, node.left);
        }else{
           return search_key(key, node.right);
        }

    }

    public static int max(Node node){
        if(node.right != null){
            return max (node.right);
        }else{
            return node.data;
        }
       
    }
    public static Node delete(Node node, int value){
        if(node == null){
            return null;
        }
        if(value > node.data){
            node.right = delete(node.right, value);
        }else if(value < node.data){
            node.left = delete(node.left, value);
        }else{
            if(node.left != null && node.right != null){
                int lmax = max(node.left);
                node.data = lmax;
                node.left = delete(node.left, lmax);
                return node;
            }else if(node.left != null){
                return node.left;
            }else if(node.right != null){
                return node.right;
            }else{
                return null;
            }
        }
        return node;
    }

    // public static void printrange(Node node,int a,int b){
    //     if(node == null){
    //         return;
    //     }
    //     if(node.data > a && node.data > b){
    //         printrange(node.left, a, b);
    //     }else if(node.data < a && node.data < b){
    //         printrange(node.right, a, b);
    //     }else{
    //         printrange(node.left, a, b);
    //         System.out.print(node.data+" ");
    //         printrange(node.right, a, b);
    //     }

    // }
    
    public static void all_paths(Node node,ArrayList<Integer>path){
        if(node == null){
            return;
        }
        path.add(node.data);
        if(node.left == null && node.right == null){
            printpath(path);
        }
        all_paths(node.left,path);
        all_paths(node.right,path);
        path.remove(path.size()-1);

    }

    public static void printpath(ArrayList<Integer>al){
        for(int i = 0;i < al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }
    public static Node createBST(int arr[],int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);
        return root;
    }

    public static Node createBST(ArrayList<Integer>al,int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(al.get(mid));
        root.left = createBST(al, si, mid-1);
        root.right = createBST(al, mid+1, ei);
        return root;
    }

    public static Node balanced_tree(Node node){
        ArrayList<Integer> al = new ArrayList<>();
        getinorder(node,al);

        node = createBST(al, 0, al.size()-1);
        return node;
    }

    public static void getinorder(Node root,ArrayList<Integer>al){
        if(root == null){
            return;
        }
        getinorder(root.left, al);
        al.add(root.data);
        getinorder(root.right, al);
    }
    public static void main(String[] args) {
        
        // Build BST

        int arr[]={5,1,3,4,2,7};
        Node root = null;
        for(int i = 0;i < arr.length;i++){
           root = build_BST(root, arr[i]);
        }

        // preorder(root);
        // System.out.println();

        // BST search

        // System.out.println(search_key(3, root));

        // Delete a node

        // delete(root, 3);
        // preorder(root);
        // System.out.println();

        // Print range

        // printrange(root, 2, 5);

        // All paths from root to leaf

        Node root2 = new Node(15);
        root.left = new Node(12);
        root.left.left = new Node(10);
        root.left.right = new Node(13);
        root.right = new Node(20);
        root.right.left = new Node(17);
        root.right.right = new Node(23);
        ArrayList<Integer> al = new ArrayList<>();
        all_paths(root,al);

        // sorted Array for balanced tree

        int arr1[] ={3,5,6,8,10,11,12};
        Node root3 =createBST(arr1,0,arr1.length-1);
        preorder(root3);
        System.out.println();

        // Balanced tree

        Node root4 = new Node(50);
        root4.left = new Node(30);
        root4.left.left = new Node(20);
        root4.left.left.left = new Node(10);
        root4.right = new Node(70);
        root4.right.right = new Node(80);
        root4.right.right.right = new Node(90);
    
        balanced_tree(root4);
        preorder(root4);
        

    }
}