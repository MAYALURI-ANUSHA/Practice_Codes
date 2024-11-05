//This code is used to segregate odd & even nodes in a SLL
//20-02-2024
public class Userdefined_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int v) {
            data = v;
            next = null;
        }
    }

    Node head, tail, temp, next;
    Node e_h, e_t, o_h, o_t;

    public static void main(String[] args) {
        Userdefined_LinkedList list = new Userdefined_LinkedList();
        // Call methods to insert elements, etc.
    }

    void e_insert(int even) {
        Node even_node = new Node(even);
        if (e_h == null) {
            e_h = even_node;
            e_t = e_h;
        }
    }

    // Define other methods as needed
}
