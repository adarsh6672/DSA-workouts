package practice.Sorting.Insertion;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr){
        int l=arr.length;
        for(int i=1;i<l;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }
        return arr;
    }

    public int[] DescSort(int[] arr){
        int l=arr.length;
        for(int i=1;i<l;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key>arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={8,55,3,2,88,5,4,3,77,4,46,83,64,24,8,0,1,45};
        InsertionSort is=new InsertionSort();
        System.out.println(Arrays.toString(is.insertionSort(arr)));
        System.out.println(Arrays.toString(is.DescSort(arr)));
    }
}
