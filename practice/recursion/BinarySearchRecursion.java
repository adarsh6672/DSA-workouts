package recursion;

public class BinarySearchRecursion {
    public int searchRecursion(int[] array, int start,int end, int target){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(array[mid]==target){
            return mid;
        }
        if(target<array[mid]){
            return searchRecursion(array, start, mid-1, target);
        }else{
            return searchRecursion(array, mid+1, end, target);
        }
    
    }

    public static void main(String[] args) {
        int[] array ={1,2,4,5,6,7,8,9};
        int target=6;
        BinarySearchRecursion bs=new BinarySearchRecursion();
        int index= bs.searchRecursion(array, 0, array.length-1, target);
        if(index !=-1){
            System.out.println(target+"  found at index "+index);
        }else
        System.out.println("Item not found......!");
    }
}
