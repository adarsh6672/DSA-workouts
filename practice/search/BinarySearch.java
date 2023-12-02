package practice.search;

public class BinarySearch {
    static int binarySearch(int[] array , int target){
        int l=0;
     
        int r=array.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(array[mid] == target)
                return mid;
            else if(target<array[mid])
               r=mid-1;
            else
                l=mid+1;
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7,8,9,10,11};
        int target=7;
        int index=binarySearch(array, target);
        if(index == -1)
            System.out.println("item not found...");
        else
            System.out.println("item found at"+ index);
    }
}
