package practice.Stack;

public class Stack2 {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node top=null;

    public void push(int data){
        Node node=new Node(data);
        if(top==null){
            top=node;
            return;
        }
        node.next=top;
        top=node;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty ");
            return;
        }else{
            Node tNode=top;
            top=top.next;
            return;
        }
    }

    public void display(){
        if(top==null){
            System.out.println("the stack is empty");
            return;
        }
        Node tmp=top;
        while(tmp!=null){
            System.out.println( tmp.data+"   ");
            tmp=tmp.next;
        }

    }
    public static void main(String[] args) {
         Stack2 stack=new Stack2();
         stack.push(0);
         stack.push(22);
         stack.push(33);
         stack.display();
         stack.pop();
         stack.pop();
         stack.display();   
    }
}
