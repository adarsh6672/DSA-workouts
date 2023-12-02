package practice.Sorting.Selection;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] array){
        int l=array.length;
        
        for(int i=0;i<l;i++){
            int sm=i;
            for( int j=i+1;j<l;j++){
                if(array[j]<array[sm]){
                    sm=j;
                }
            }

            int temp=array[i];
            array[i]=array[sm];
            array[sm]=temp;
        }

        return array;
    }

    public int[] selectionDesc(int[] arr){
        int l=arr.length;
        for(int i=0;i<l;i++){
            int max=i;
            for(int j=i+1;j<l;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort ss=new SelectionSort();
        int[] arr={99,54,12,0,5,34,1,56,444,6,99,56};
        int[] res=ss.selectionSort(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(ss.selectionDesc(arr)));
    }
}
