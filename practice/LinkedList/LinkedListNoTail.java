package practice.LinkedList;

public class LinkedListNoTail {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node head;


    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node tempNode=head;
        Node lastNode=null;
        while(tempNode != null){
            lastNode=tempNode;
            tempNode=tempNode.next;
        }
        lastNode.next=newNode;
        return;
    }

    public void display(){
        if(head==null){
            System.out.println("empty list...");
        }
        Node temNode=head;
        while(temNode!=null){
            System.out.print(temNode.data+"\t");
            temNode=temNode.next;
        }
    }

    public void reverse(){
        if(head==null){
            return;
        }

        Node prev=head;
        Node cur=head.next;
        while(cur != null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=null;
        head=prev;      
        
    }

    public Node reverseRecursion(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead=reverseRecursion(head.next);
        

        head.next.next=head;
        head.next=null;
        return newHead;
    }





    public static void main(String[] args) {
        LinkedListNoTail list=new LinkedListNoTail();
        list.addLast(30);
        list.addLast(31);
        list.addLast(32);
        list.addLast(33);
        list.addLast(34);
        list.addFirst(29);
        list.display();
        list.head=list.reverseRecursion(list.head);
        System.out.println("");
        list.display();

    }
}
