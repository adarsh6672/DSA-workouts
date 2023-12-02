package practice.search;

public class LinearSearch {
    static int linearSearch(int[] array, int target){
        for(int i=0; i<array.length;i++){
            if(array[i]==target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target =9;
        int res=linearSearch(array, target);
        if(res == -1)
            System.out.println("item not found ");
        else
            System.out.println("the item is in index "+res);
    }
}
