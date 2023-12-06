package practice.Sorting.Merge;

import java.util.Arrays;

public class MergeSort2 {

    private static void merge(int[] arr, int l,int m , int h){
        int n1=m-l+1;
        int n2=h-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+j+1];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }



    private static void sort(int[] arr,int low, int high){
        if(low<high){
            int m=(low+high)/2;

            sort(arr, low, m);
            sort(arr, m+1, high);

            merge(arr , low ,m ,high);
        }
    }


    public static void main(String[] args) {
        int[] arr={3,6,22,5,2,77,24,86,38,29,11,4,5};
        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
