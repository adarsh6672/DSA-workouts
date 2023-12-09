package practice.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap3 {
    static class HashMap<K ,V>{
        class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        HashMap(){
            this.N=5;
            this.buckets=new LinkedList[5];

            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi) % N;
        }

        private int findIndx(int bi,K key){
            LinkedList<Node> li=buckets[bi];
            for(int i=0;i<li.size();i++){
                if(li.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }


        public void put(K key,V value){
            int  bi=hashFunction(key);
            int idx=findIndx(bi,key);
            if(idx==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node node =buckets[bi].get(idx);
                node.value=value;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int idx=findIndx(bi, key);
            if(idx==-1){
                return null;
            }else{
                Node node=buckets[bi].remove(idx); 
                n--;               
                return node.value;
                
            }
        }
        public V get(K key){
            int bi=hashFunction(key);
            int idx=findIndx(bi,key);
            if(idx==-1){
                return null;
            }else{
                return buckets[bi].get(idx).value;
            }
        }


        public ArrayList<K> keyset(){
            ArrayList <K> al=new ArrayList<>();
            for(int i=0;i<N;i++){
                LinkedList<Node> ls=buckets[i];
                for(int j=0;j<ls.size();j++){
                    al.add(ls.get(j).key);
                }
            }
            return al;
        }

    }

    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("adarsh", 78);
        hm.put("good", 57);
        
        ArrayList<String>keys = hm.keyset();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+"    "+ hm.get(keys.get(i)));
        }
    }
}
