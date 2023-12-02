package practice.recursion;

public class DoubleLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void add(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        return;
    }

    public void print(){
        if(head==null){
            System.out.println("list is empty");
        }

        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void reverse(){
        if(head==null|| head.next==null){
            return;
        }
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=curr.prev;
            curr.prev=next;
            curr=next;     
        }
        Node t=head;
        head=tail;
        tail=t;
        t.next=null;
        head.prev=null;

    }

    public static void main(String[] args) {
        DoubleLL list=new DoubleLL();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        list.reverse();
        list.print();
    }
    
}
