package practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    Node root=null;

    public void insert(int data){
        if(root==null){
            root=new Node(data);
            return;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node currNode=q.remove();

            if(currNode.left==null){
                currNode.left=new Node(data);
                return;
            }else{
                q.add(currNode.left);
            }

            if(currNode.right==null){
                currNode.right=new Node(data);
                return;
            }else{
                q.add(currNode.right);
            }
        }
    }

    public void inorder(Node root){
        if(root==null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+"   ");
        inorder(root.right);
    }

    public void levelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        qu.add(null);

        while(!qu.isEmpty()){
            Node temNode=qu.remove();
            if(temNode==null){
                System.out.println();

                if(qu.isEmpty()){
                    break;
                }else{
                    qu.add(null);
                }

            }else{
                System.out.print(temNode.data +"  ");

                if(temNode.left!=null){
                    qu.add(temNode.left);
                }
                if(temNode.right!=null){
                    qu.add(temNode.right);
                }
            }


        }
    }
    public boolean isBST(){
        Node temp=root;
        return helperIsBST(temp,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean helperIsBST(Node node,int minValue, int maxValue){
        if(node==null){
            return true;
        }
        if(node.data<=minValue || node.data>=maxValue){
            return false;
        }

        return helperIsBST(node.left, minValue, node.data) && helperIsBST(node.right, node.data, maxValue);
    }
    

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.insert(10);
        bt.insert(5);
        bt.insert(16);
        bt.insert(1);
        bt.insert(6);
        bt.insert(11);
        bt.insert(17);
        
        bt.inorder(bt.root);
        System.out.println();
        bt.levelOrder(bt.root);
        System.out.println(bt.isBST());
    }
}

