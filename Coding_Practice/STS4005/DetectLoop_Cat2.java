import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
    static Node head;
    static Node tail;
    
    static void insert(int n){
        Node newNode=new Node(n);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
}
public class DetectLoop_Cat2 {
    boolean LoopDetect(Node n){
        Node hare=n;
        Node tortoise=n;
        while(hare!=null&&hare.next!=null){
            hare=hare.next.next;
            tortoise=tortoise.next;
            if(hare==tortoise){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Node.insert(sc.nextInt());
        }
        boolean Detect_Loop=new DetectLoop_Cat2().LoopDetect(Node.head);
        System.out.println(Detect_Loop);
    }
}
