package practice.HashMap;

import java.util.LinkedList;

public class HashMap2 {
    static class HashMap<K,V>{

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
        private LinkedList <Node> buckets [];

        HashMap(){
            this.N=5;
            this.buckets=new LinkedList[N];
            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        
    }
}
