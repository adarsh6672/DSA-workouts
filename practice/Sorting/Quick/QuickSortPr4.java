package practice.Sorting.Quick;

import java.util.Arrays;

public class QuickSortPr4 {
    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static int partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
            
        }
        swap(arr,i,high);
            return i;
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args) {
        int[] arr={3,55,24,76,2,4,87,2,58,96,21};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
