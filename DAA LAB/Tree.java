import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    public class Node {
        Node left, right;
        int data;
        
        Node(int d) {
            left = null;
            data = d;
            right = null;
        }
        
        void add(String str[]) {
            if (str[0].equals("-1")) {
                return;
            }
            Node root = new Node(Integer.parseInt(str[0]));
            int i = 1;
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            while (!q.isEmpty() && i < str.length) {
                Node curr = q.poll();
                if (!str[i].equals("-1")) {
                    curr.left = new Node(Integer.parseInt(str[i]));
                    q.add(curr.left);
                }
                i++;
                if (!str[i].equals("-1")) {
                    curr.right = new Node(Integer.parseInt(str[i]));
                    q.add(curr.right);
                }
                i++;
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        Tree tree = new Tree();
        Node root = tree.new Node(0);
        root.add(str);
    }
}