package practice.Trie;

public class Trie {
    class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children=new Node[26];
            eow=false;
        }
    }

    Node root=new Node();

    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
            curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx]; 
        }
    }

    public boolean search(String s){
        Node curr=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==s.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    private void insertRec2(String s,Node root, int i){
        if(i<s.length()){
            int idx=s.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx]=new Node();
            }

            insertRec2(s, root.children[idx], i+1);
        }else{
            root.eow=true;
        }
    }

    public void insertRec(String s){
        insertRec2(s, root, 0);
    }

    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("veer");
        trie.insert("kili");
        trie.insertRec("adarsh");
        
        System.out.println(trie.search("adarsh"));
        System.out.println(trie.search("kili"));
    }
}
