package practice.search;

public class BinarySearch2 {
    public static int binarySearch(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        System.out.println(arr.length);

        while(l<=r){
            int mid=l+(r-l)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,9,55};
        int target=55;
        int res=binarySearch(arr, target);
        if(res == -1){
            System.out.println("item not found");
        }else{
            System.out.println("item is found at index "+res);
        }
    }
}
