package practice.test;

public class Rec {
    public int BinarySrc(int[] arr,int first,int last,int target){
        if(first>last){
            return -1;
        }
        int mid=(first+last)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return BinarySrc(arr, first, mid-1, target);
        }else{
            return BinarySrc(arr, mid+1, last, target);
        }
        
    }


    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        Rec rec=new Rec();
        int indx=rec.BinarySrc(array,0,array.length-1,target);
        if(indx==-1){
            System.out.println("element not foud");
        }else{
            System.out.print("element found at index "+indx+ "\n");
        }
    }
}
