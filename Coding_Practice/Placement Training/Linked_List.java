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