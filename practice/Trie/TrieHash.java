package practice.Trie;

import java.util.HashMap;

public class TrieHash {
    class Node{
        HashMap<Character,Node> children;
        boolean eow;

        Node(){
            children=new HashMap<>();
            eow=false;
        }
        
    }
    Node root=new Node();

    public void insert(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            if(temp.children.get(x)==null){
                temp.children.put(x, new Node());
            }
            temp=temp.children.get(word.charAt(i));
        }

        temp.eow=true;
    }

    public boolean search(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            if(temp.children.get(x)==null){
                return false;
            }
            if(i==word.length()-1 && temp.children.get(x).eow==false){
                return false;
            }
            temp=temp.children.get(x);
        }
        return true;
    }

    public static void main(String[] args) {
        TrieHash tr=new TrieHash();
        tr.insert("love");
        tr.insert("is");
        tr.insert("lost");
        
        System.out.println(tr.search("love"));
    }
}
