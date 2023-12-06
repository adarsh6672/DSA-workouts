package practice.Stack;

public class Stack {
    static final int max=5;
    int top;
    int[] a=new int[max];

    Stack(){
        top=-1;
    }

    public void push(int data){
        if(top>=max-1){
            System.out.println("Stack Over Flow");
            return;
        }
        a[++top]=data;
        return;
    }

    public int pop(){
        if(top<0){
            System.out.println( "stack is empty");
            return -1;
        }
        int x=a[top--];
        return x;
    }

    public void display(){
        if(top<0){
            System.out.println( "stack is empty");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.pop();
        st.push(1);
        st.display();
        st.pop();
        st.pop();
        

    }
}
