import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    Node left, right;
    int data;

    Node(int d) {
        left = null;
        data = d;
        right = null;
    }

    static Node add(String str[]) {
        if (str[0].equals("-1")) {
            return null;
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
        return root;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        Node root = add(str);
    }
}
