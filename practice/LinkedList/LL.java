package practice.LinkedList;

public class LL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node head=null;
    public Node tail=null;
    public int size=0;

    public void addNode(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else{
            tail.next=node;
        }

        tail=node;
        size++;
    }

    public void display(){
        if(head==null){
            System.out.println("empty list...");
        }else{
            Node temp=head;
            while(temp !=null){
                System.out.print("  "+temp.data);
                
                temp=temp.next;
            }
        }
    }

    public void addFirst(int data){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node node=new Node(data);
        node.next=head;
        head=node;
        size++;
    }

    public void delete(int data){
        Node temp=head;
        Node prev=null;
        if(temp !=null && temp.data==data){
            head=temp.next;
            size--;
            return;
            
        }
        while(temp !=null && temp.data != data){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        if(temp==tail){
            tail=prev;
            tail.next=null;
            size--;
            return;
        }

        prev.next=temp.next;
        size--;
        return;
    }

    public void insertAfter(int prev, int data){
        Node newnNode=new Node(data);
        Node temp=head;
        while(temp != null && temp.data != prev){
            temp=temp.next;
        }

        if(temp==null){
            return;
        }
        if(temp == tail){
            temp.next=newnNode;
            tail=temp;
            size++;
            return;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
        size++;
    }

    public void insertBefore(int bef, int data){
        Node newNode=new Node(data);
        Node temp=head;
        Node prv=null;
        while(temp !=null && temp.data != bef){
            prv=temp;
            temp=temp.next;
        }
        if(temp == null){
            return;
        }
        if(temp == head){
            newNode.next=head;
            head=newNode;
            size--;
            return;
        }
        prv.next=newNode;
        newNode.next=temp;
        size--;

    }
    public void deleteDuplicate(){
        Node current=head;
        
    while(current!=null){
        Node next=current.next;
        while(next!=null && current.data==next.data){
            
            next=next.next;
        }
        current.next=next;
        
        
        if( next==null){
            System.out.println("entered");
            tail=current;
            tail.next=null;
            return;
        }
        current=next;
    }
    }

    public void reverseLL(){
        if(head==null){
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr != null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        Node temp=head;
        head=tail;
        tail=temp;

    }


    public static void main(String[] args) {
        LL list =new LL();
        list.display();
        list.addNode(23);
        list.addNode(50);
        list.addNode(80);
        list.addNode(80);
        list.insertAfter(50, 50);
        list.addNode(47);
        list.addNode(47);
        list.addNode(45);
        list.addNode(49);
        list.display();
        System.out.println("");
        list.deleteDuplicate();
        list.display();
        System.out.println("");
        list.reverseLL();
        list.display();
        System.out.println("");
        System.out.println(list.head.data);
        System.out.println(list.tail.data+"->");
        

        
    }
}
