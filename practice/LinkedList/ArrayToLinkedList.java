package practice.LinkedList;

public class ArrayToLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    int size=0;

    public void arrayToLinkedList(int[] array){
        if(array.length==0){
            System.out.println("no elements");
            
            return;
        }
            size=array.length;   
            Node n=new Node(array[0]);
            head=n;
        for(int i=1;i<array.length;i++){
             Node newnNode=new Node(array[i]);
             n.next=newnNode;
             n=newnNode;
             
        }
    }
    public int[] linkedListToArray(Node head , int size){
        int[] array = new int[size];
        if(head == null){
            return array;
        }
        Node temp=head;
        
        int i=0;
        while(temp != null){
            array[i]=temp.data;
            temp=temp.next;
            i++;
        }
        return array;
    }

    public void displayll(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
         int[] array={1,2,3,4,5,6};
         ArrayToLinkedList atl=new ArrayToLinkedList();
         atl.arrayToLinkedList(array);
         atl.displayll();
         int[] arr=atl.linkedListToArray(atl.head, atl.size);
         for(int i=0;i<atl.size;i++){
         System.out.print(arr[i]+"   ");
         }
    }
}
