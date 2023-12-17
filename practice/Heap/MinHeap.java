package practice.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinHeap {
    List<Integer> heap=new ArrayList<>();

    public MinHeap(){

    }

    public MinHeap(List<Integer> array){
        buildHeap(array);
    }

    public void buildHeap(List<Integer> array){
        heap = array;
        for(int i=parant(heap.size()-1);i>=0;i--){
            shiftDown(i);
        }
    }

    public void shiftDown(int currentIdx){
        int endidx=heap.size()-1;
        int leftIdx=leftChild(currentIdx);
        while(leftIdx <= endidx){
            int rightIdx=rightChild(currentIdx);
            int idxToShift;
            if(rightIdx<=endidx && heap.get(rightIdx)<heap.get(leftIdx)){
                idxToShift=rightIdx;
            }else{
                idxToShift=leftIdx;
            }

            if(heap.get(currentIdx)>heap.get(idxToShift)){
                Collections.swap(heap, currentIdx, idxToShift);
                currentIdx=idxToShift;
                leftIdx=leftChild(currentIdx);
            }else{
                return;
            }
        }
    }
    public void shiftUp(int currentIdx){
        int parentIdx=parant(currentIdx);
        while(currentIdx>0 && heap.get(parentIdx)>heap.get(currentIdx)){
            Collections.swap(heap, currentIdx, parentIdx);
            currentIdx=parentIdx;
            parentIdx=parant(currentIdx);
        }
    }
    public int peek(){
        if(heap.isEmpty()){
            return 0;
        }
        return heap.get(0);
    }

    public void remove(){
        Collections.swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        shiftDown(0);
    }
    public void insert(int value){
        heap.add(value);
        shiftUp(heap.size()-1);
    }

    private int parant(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return (i*2)+1;
    }
    private int rightChild(int i){
        return (i*2)+2;
    }

    public void  display(){
        for(int i=0;i<heap.size();i++){
            System.out.print(heap.get(i)+"   ");
        }
    }


    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>(Arrays.asList(6,2,8));
        MinHeap heap=new MinHeap(al);
        heap.display();
        heap.insert(1);
        heap.insert(5);
        heap.insert(15);
        System.out.println();
        heap.display();
        heap.remove();
        System.out.println();
        heap.display(); 
    }
}
