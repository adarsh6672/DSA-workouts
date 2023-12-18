package practice.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxHeap {
    List<Integer> heap;
    MaxHeap(){
        this.heap=new ArrayList<>();
    }

    MaxHeap(ArrayList<Integer> array){
        this.heap=array;
        for(int i=getParant(heap.size()-1);i>=0;i--){
            downHeap(i);
        }
    }

    private int getParant(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return i*2+1;
    }

    private int rightChild(int i){
        return i*2+2;
    }



    public void insert(int data){
        heap.add(data);
        upHeap(heap.size()-1);
    }

    private void upHeap(int i){
        if(i==0){
            return;
        }
        int p=getParant(i);
        if(heap.get(i)>heap.get(p)){
            Collections.swap(heap, i, p);
            upHeap(p);
        }
    }
    private void downHeap(int i){
        int max=i;
        int left=leftChild(i);
        int right=rightChild(i);

        if(left<heap.size() && heap.get(left)>heap.get(max)){
            max=left;
        }

        if(right<heap.size() &&  heap.get(right)>heap.get(max)){
            max=right;
        }
        if(max!=i){
            Collections.swap(heap, i, max);
            downHeap(max);
        }

    }

    public int remove() throws Exception{
        if(heap.isEmpty()){
            throw new Exception("removing from empty heap");
        }
        int temp=heap.get(0);
        int last=heap.remove(heap.size()-1);
        if(!heap.isEmpty()){
            heap.set(0, last);
            downHeap(0);
        }

        return temp;
    }

    public List<Integer> heapSort() throws Exception{
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(!heap.isEmpty()){
            int dig=remove();
            res.add(dig);

        }


        return res;
    }

    public void print(){
        for(int i=0;i<heap.size();i++){
            System.out.print(heap.get(i)+"   ");
        }
        System.out.println();
    }

    public static void main(String[] args)throws Exception {
        ArrayList <Integer> al=new ArrayList<>(Arrays.asList(4,1,3,2,16,9,10,14,8,7));
        MaxHeap mh=new MaxHeap(al);
        mh.remove();
        mh.print();
        System.out.println(mh.heapSort());
    }

}
