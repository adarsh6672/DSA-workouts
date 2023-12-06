package practice.Stack;

public class StackLL {
    class StackNode{
        int data;
        StackNode next;

        StackNode(int data){
            this.data=data;
        }
    }

    StackNode top=null;

    public void push(int data){

        StackNode node=new StackNode(data);
        if(top == null){
            top=node;
            return;
        }
        StackNode temp=top;
        top=node;
        top.next=temp;
        return; 
    }

    public void display(){
        if(top==null){
            System.out.println("stack is empty ");
            return;
        }

        StackNode tNode=top;
        while(tNode!=null){
            System.out.print(tNode.data+"  ");
            tNode=tNode.next;
        }
        System.out.println();
    }

    public StackNode pop(){
        if(top== null){
            System.out.println("stack is empty ");
            return null;
        }
        StackNode temp=top;
        top=top.next;
        return temp;
    }

    public static void main(String[] args) {
         StackLL stack=new StackLL();
         stack.pop();
         stack.display();
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.display();
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
         stack.pop();
         stack.pop();
        //  stack.display();
    }
}
