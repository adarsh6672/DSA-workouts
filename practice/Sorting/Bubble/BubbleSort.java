package practice.Sorting.Bubble;
import java.util.Arrays;


public class BubbleSort {

    public int[] sort(int[] arr){
        int l=arr.length;

        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            // System.out.println(Arrays.toString(arr));
        }
        
        return arr;
    }

    public int[] descSort(int[] arr){
        int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            // System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    


    public static void main(String[] args) {
        int[] arr={900,1,3,2,7,34,66,12,1,4,8,9,6,4,0};
        BubbleSort bs=new BubbleSort();
        int[] res=bs.sort(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(bs.descSort(arr)));
    }
}
