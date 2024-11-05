//Node creation
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

//Insertion
if(head==null){
    head=newNode;
}
curr=head;
while(curr.next!=null){
    curr=curr.next;
}
