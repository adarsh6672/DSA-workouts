package practice.Sorting.Merge;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] arr={1,3,2,6,3,66,4,77,3,8,77};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {

        if(l<r){
            int m=(l+r)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

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
}
