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

    public Node delete(int key,Node root){
        if(root==null){
            return root;
        }

        if(key<root.data){
            root.left=delete(key, root.left);
            return root;
        }else if(key>root.data){
            root.right=delete(key, root.right);
            return root;
        }

        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }else{
            Node succParent=root;
            Node succ=root.right;

            while(succ.left!=null){
                succParent=succ;
                succ=succ.left;
            }

            if(succParent!=root){
                succParent.left =succ.right;
            }else{
                succParent.right=succ.right;
            }

            root.data=succ.data;

            return root;
        }
    }

    public Node deleteRec(int data, Node root){
        if(root==null){
            return root;
        }

        if(data<root.data){
            root.left=deleteRec(data, root.left);
            return root;
        }else if(data> root.data){
            root.right=deleteRec(data, root.right);
            return root;
        }

        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }else{
            Node sp=root;
            Node s=root.right;
            while(s.left!=null){
                sp=s;
                s=s.left;
            }

            if(sp!=root){
                sp.left=s.right;
            }else{
                sp.right=s.right;
            }

            root.data=s.data;
            return root;
        }
    }

    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"   ");
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+"  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public int findClosest(int target,Node root){
        Node closest=root;

        while(root!=null){
            if(Math.abs(root.data-target)<Math.abs(closest.data-target)){
                closest=root;
            }

            if(target<root.data){
                root=root.left;
            }else if(target>root.data){
                root=root.right;
            }else{
                return root.data;
            }
        }
        return closest.data;
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(1);
        bst.insert(4);
        bst.insert(20);
        bst.insert(25);
        bst.insert(19);
        bst.insert(26);

    
        System.out.println(bst.root.data);
        bst.inOrder(bst.root);
        System.out.println();
        
        System.out.println(bst.root.data);
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        int res=bst.findClosest(27,bst.root);
        System.out.println(res);
    }
}
