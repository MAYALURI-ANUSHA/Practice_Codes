package ACCENTURE;

import java.util.*;
public class Problem_7 {

    static Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    static Node insert(Node head,int data){
        Node new_Node=new Node(data);
        if(head==null){
            head=new_Node;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new_Node;
        }
        return head;
    }

    public static Node rev(Node h){
         return h;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Node n=new Node(-1);
        
    }
}
