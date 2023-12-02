package practice.test;

public class LinkedListManual {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head=null;


    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }

        temp.next=newNode;
        return;
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }

    public void insertAfter(int bef,int data){
        Node node=new Node(data);
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.data!=bef){
            temp=temp.next;
        }
        if(temp.data==bef){
            node.next=temp.next;
        temp.next=node;
        }
        
        return;
    }
    public void removeLast(){
        if(head==null){
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public void removeFirst(){
        if(head==null){
            return;
        }
        Node tNode=head;
        head=head.next;
        tNode.next=null;
        return;
    }

    public void reverse(){
        if(head==null|| head.next==null){
            return;
        }
        Node prev=head;
        Node current=head.next;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;
        return;
    }


    public static void main(String[] args) {
        LinkedListManual list =new LinkedListManual();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.add(3);
        list.add(4);
        list.display();
        list.reverse();
        list.display();
    }
}
