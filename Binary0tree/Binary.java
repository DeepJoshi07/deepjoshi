import java.util.LinkedList;
import java.util.Queue;

public class Binary{
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static int idx = -1;
    public static Node buildtree(int arr[]){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        
        Node node = new Node(arr[idx]);
        node.left = buildtree(arr);
        node.right =buildtree(arr);

        return node;
    }

    public static void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node){
        if(node == null){
            return ;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public static void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public static void levelorder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()){
            Node cnode = q.remove();
            if(cnode == null){
                System.err.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(node.data+" ");
                if(cnode.left != null){
                    q.add(cnode.left);
                }
                if(cnode.right != null){
                    q.add(cnode.right);
                }
            }
        }
            
        }
        public static int height(Node node){
            if(node == null){
                return 0;
            }
            int left = height(node.left);
            int right = height(node.right);
            int height = Math.max(left,right) + 1 ;

            return height;
        }

        public static int count_of_nodes(Node node){
            if(node == null){
                return 0;
            }
            int left = height(node.left);
            int right = height(node.right);
            int count = left + right + 1;

            return count;
        }
        

        public static int sum_of_nodes(Node node){
            if(node == null){
                return 0;
            }
            int left = height(node.left);
            int right = height(node.right);
            int sum = left + right + node.data;

            return sum;
        }
        static class Info{
            int height;
            int diam;

            public Info(int h,int d){
                this.height = h;
                this.diam = d;
            }
        }
    
        public static Info diameter(Node node){
            if(node == null){
                return new Info(0,0);
            }
            Info left = diameter(node.left);
            Info right = diameter(node.right);
            int height = Math.max(left.height , right.height)+1;
            int diam = Math.max(Math.max(left.diam,right.diam),left.height+right.height+1);

            return new Info(height, diam);
        }
        public static void k_level_nodes(Node node,int k){
            if(node == null){
                return;
            }
            if(k == 0){
                System.out.print(node.data+" ");
            }
            k_level_nodes(node.left, k-1);
            k_level_nodes(node.right, k-1);
           
        }

        public static Node lowest_comman_anciester(Node node,int data1,int data2){
            if(node == null || node.data == data1 || node.data == data2){
                return node;
            }
            Node left =lowest_comman_anciester(node.left, data1, data2);
            Node right =lowest_comman_anciester(node.right, data1, data2);
            if(right == null){
                return left;
            }
            else if(left == null){
                return right;
            }else{
                return node;
            }
        }

        public static int minimum_distance(Node root,int n1,int n2){

            Node lca = lowest_comman_anciester(root, n1, n2);
            int dist1 = lca_distance(lca,n1);
            int dist2 = lca_distance(lca,n2);
            return dist1 + dist2 ;
        }

        public static int lca_distance(Node node,int data){
            if(node == null){
                return -1;
            }
            if(node.data == data){
                return 0;
            }
            int left = lca_distance(node.left, data);
            int right = lca_distance(node.right, data);

            if(left == -1 && right == -1){
                return -1;
            }else if(left == -1){
                return right+1;
            }else{
                return left+1;
            }
        }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = new Node(10);
        root.left = new Node(15);
        root.right= new Node(20);
        root.left.right= new Node(25);
        root.right.left= new Node(30);
        root.left.left= new Node(35);
        root.right.right= new Node(40);

       Node node =lowest_comman_anciester(root, 25, 30);
        System.out.println(node.data);
    //     k_level_nodes(root, 2);
        System.out.println(lca_distance(node, 25));
        System.out.println(lca_distance(node, 30));
        System.out.println(minimum_distance(root, 25, 30));
    }
}