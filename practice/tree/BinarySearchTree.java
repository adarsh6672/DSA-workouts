package practice.tree;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    Node root;

    public void insert(int data){
        if(root==null){
            root=new Node(data);
            return;
        }

        Node currNode=root;
        while(true){
            if(data<currNode.data){
                if(currNode.left==null){
                    currNode.left=new Node(data);
                    break;
                }else{
                    currNode=currNode.left;
                }
            }else{
                if(currNode.right==null){
                    currNode.right=new Node(data);
                    break;
                }else{
                    currNode=currNode.right;
                }
            }
        }
    }

    public boolean contains(int data){
        Node currNode=root;
        while(currNode!=null){
            if(data<currNode.data){
                currNode=currNode.left;
            }else if(data>currNode.data){
                currNode=currNode.right;
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean search(int data,Node root){
        if(root==null){
            return false;
        }else if(data<root.data){
            return search(data, root.left);
        }else if(data>root.data){
            return search(data, root.right);
        }else{
            return true;
        }
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+"   ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(22); 
        bst.insert(88);
        System.out.println(bst.contains(5));
        System.out.println(bst.search(10, bst.root));
        bst.inOrder(bst.root);
        
    }
}
