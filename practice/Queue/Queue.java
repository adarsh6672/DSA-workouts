package practice.Queue;

public class Queue {
    int size=6;
    int front;
    int rear;
    int[] queue=new int[size];
    Queue(){
        
        front=-1;
        rear=-1;
    }

    public void enQueue(int data){
        if(rear == size - 1){
            System.out.println("queue is full");
            return;
        }
        if(front==-1) {front=0;}
        queue[++rear]=data;
    }

    public int deQueue(){
        if(front==-1){
            System.out.println( "Queue is empty ");
            return -1;
        }
        int element=queue[front];
        if(front >= rear){
            front=-1;
            rear=-1;
        }else{
            front++;
        }
        return element;
    }

    public void display(){
        if(front==-1){
            System.out.print("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+"   ");
        }
        System.out.println();

    }
    public static void main(String[] arg){
        Queue q=new Queue();
        q.enQueue(2);
        q.enQueue(4);
        q.enQueue(6);
        q.enQueue(8);
        q.display();
        q.deQueue();
        q.deQueue();
        q.display();
        q.enQueue(55);
        q.display();
        q.deQueue();
        q.deQueue();
        q.enQueue(2);
        q.enQueue(4);
        q.enQueue(6);
        q.enQueue(8);
        
        q.display();
    }
}
