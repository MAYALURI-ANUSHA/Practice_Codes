class Node{
    int data;
    Node prev;
    Node(int value){
        this.data=value;
        this.prev=null;
    }
}
public class Ok {
    public static Node addNode(Node head,int data){
        Node p=new Node(data);
        p.prev=head;
        return p;
    }
    public static void displayN(Node head){
        Node p=head;
        while(p!=null){
            System.out.println(p.data);
            p=p.prev;
        }
    }
    public static void main(String[]args){
        Node head=null;
        int n=6;
        for(int i=0;i<n;i++){
            head=addNode(head,i);
        }
        displayN(head);
    }
}
