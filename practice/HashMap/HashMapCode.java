package practice.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V> {

        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[] ;

        public HashMap(){
            this.N=5;
            this.buckets = new LinkedList[5];
            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchinLL(int bi ,K key){
            LinkedList<Node> li=buckets[bi];
            for(int i=0;i<li.size();i++){
                if(li.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public void put(K key , V value){
            int bi=hashFunction(key);
            int di=searchinLL(bi,key);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }

        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchinLL(bi, key);

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
                
            }

        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> li=buckets[i];
                for(int j=0;j<li.size();j++){
                    Node node=li.get(j);
                    keys.add(node.key);                
                }
            }
            return keys;
            
        }

        public V get(K key){
            int bi=hashFunction(key);
            int fi=searchinLL(bi, key);

            if(fi==-1){
                return null;
            }else{
                return buckets[bi].get(fi).value;
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String , Integer> hm=new HashMap<>();
        hm.put("adarsh", 3);
        hm.put("athul", 332);
        hm.put("pooja" ,67);
        System.out.println( hm.get("adarsh"));
        hm.remove("adarsh");
        System.out.println( hm.get("adarsh"));
        ArrayList<String> keys=hm.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+"   " + hm.get(keys.get(i)));
        }
        

    }
}
