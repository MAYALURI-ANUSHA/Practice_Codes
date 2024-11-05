import java.util.*;
public class Merge_Two_Sorted_LinkedList_UserDefined{
class Node{
    Node head,tail,temp,next;
    int data;
    Node(int d){
        data=d;
        next=null;
    }
    void add(int d){
        Node newN=new Node(d);
        if(head==null){
            head=newN;
            tail=newN;
        }
        else{
            tail.next=newN;
            tail=tail.next; //tail=newN;
        }}
        void print(Node h){
            temp=h;
            for(;temp!=null;temp=temp.next)
            System.out.print(temp.data+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Node L1=new Node(0);
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            L1.add(sc.nextInt());
        }
        Node L2=new Node(0);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            L2.add(sc.nextInt());
        }
        L1.merge(L1.head,L2.head);
    }
    void merge(Node temp1,Node temp2){
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                System.out.print(temp1.data+"->");
                temp1=temp1.next;
            }
            else{
                System.out.print(temp2.data+"->");
                temp2=temp2.next;
            }
        }
    }
}