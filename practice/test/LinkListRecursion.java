package practice.test;

public class LinkListRecursion {
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
        }
    }
    Node head=null;

    public Node reverseRecursion(Node head){
        if(head.next==null){
            return head;
        }
        Node newhead=reverseRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }
    public Node reversRecursion(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead=reversRecursion(head.next);
        

        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public void add(char data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return;
    }
    public void display(){
        if(head==null){
            System.out.println("empty list");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkListRecursion list =new LinkListRecursion();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.display();
        System.out.println(list.head.data);
        list.head=list.reversRecursion(list.head);
        
        list.display();
    
    }
}
