import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Binary_Tree_Right_View {
    Node root;

Node constructTree(String[] nodes) {
    if (nodes == null || nodes.length == 0)
        return null;

    Queue<Node> queue = new LinkedList<>();
    int index = 0;
    root = new Node(Integer.parseInt(nodes[index++]));
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        if (index < nodes.length) {
            String leftValue = nodes[index++];
            if (!leftValue.equals("N")) { // Check if it's not a null node
                current.left = new Node(Integer.parseInt(leftValue));
                queue.add(current.left);
            }
        }
        if (index < nodes.length) {
            String rightValue = nodes[index++];
            if (!rightValue.equals("N")) { // Check if it's not a null node
                current.right = new Node(Integer.parseInt(rightValue));
                queue.add(current.right);
            }
        }
    }

    return root;
}


    // Function to print the right view of the binary tree
    void BinaryRightView(Node root,int max_level,int level){
        if(root==null)
            return;
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level=level;
            
        }
        BinaryRightView(root.left,max_level,level+1);
        BinaryRightView(root.right,max_level,level+1);
        
    }

    // Driver code
    public static void main(String[] args) {
        Binary_Tree_Right_View tree = new Binary_Tree_Right_View();
        
        // Taking custom input from the user
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nodes = input.split(" ");

        // Constructing the binary tree
        tree.constructTree(nodes);

        // Printing the right view of the binary tree
        tree.BinaryRightView(tree.root,0,1);
    }
}
