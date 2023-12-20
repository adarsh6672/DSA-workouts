package practice.Trie;

public class TrieTest {
    class Node{
        Node[] children;
        boolean eow;

        public Node(){
            this.children=new Node[26];
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            this.eow=false;
        }
    }
     Node root=new Node();

    public void insert(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';

            if(temp.children[idx]==null){
                temp.children[idx]= new Node();
            }

            if(i==word.length()-1){
                temp.children[idx].eow=true;
            }

            temp=temp.children[idx];
        }
    }

    public boolean search(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            if(temp.children[idx]==null){
                return false;
            }
            if(i==word.length()-1 && temp.children[idx].eow==true){
                
                    return true;
                
            }
            temp=temp.children[idx];
        }
        return false;
    }

    public static void main(String[] args) {
        TrieTest trie=new TrieTest();
        trie.insert("adarsh");
        trie.insert("adiv"); 
        trie.insert("abu");
        trie.insert("ad");
        System.out.println(trie.search("ab"));
    }

}
