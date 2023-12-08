package practice.Queue;


public class QueueLL {
    class Node{
        int data;
        Node next;  
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front=null;
    Node rear=null;

    public void enQueue(int data){

        Node node=new Node(data);
        if(front == null){
            front=node;
            rear=node;
            return;
        }

        rear.next=node;
        rear=node;
    }

    public int deQueue(){
        if(front==null){
            System.out.println("the queue is empty ");
            return -1;
        }
        int temp=front.data;
        front=front.next;
        return temp;
    }

    public void display(){
        if(front==null){
            System.out.println("queue is empty ");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"    ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] arg){
        QueueLL q=new QueueLL();
        q.enQueue(2);
        q.enQueue(4);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(22);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());q.display();
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(22);
        q.display();
        
    }




}
