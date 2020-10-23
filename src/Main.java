import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        Node root = null;
        for(int i = 0; i < count; i++){
            root = Node.insertNode(root, new Node(s.nextInt()));
        }
        root.printTree();
    }
}

class Node{
    int val;
    Node right, left;

    public Node(int val){
        this.val = val;
    }

    static Node insertNode(Node root, Node node){
        if(root == null)
            return node;
        Node trace = root;
        while(true){
            if(node.val >= trace.val){
                if(trace.right == null){
                    trace.right = node;
                    return root;
                }
                else{
                    trace = trace.right;
                }
            }
            else{
                if(trace.left == null){
                    trace.left = node;
                    return root;
                }
                else{
                    trace = trace.left;
                }
            }
        }
    }

    void printTree(){
        System.out.print(val+" ");
        if(this.left != null)
            this.left.printTree();
        if(this.right != null)
            this.right.printTree();
    }
}

class TimeToStrike{
    public static void solve(){
        Scanner s = new Scanner(System.in);
        int acount = s.nextInt();
        int bcount = s.nextInt();
        int [] a = new int[acount], aa = new int [acount];
        int [] b = new int[bcount];
        Arrays.sort(aa);
        Arrays.sort(b);
        
    }
}

