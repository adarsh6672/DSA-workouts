package recursion;

public class Fibonacci {
    public int findFibonacci(int num){

        if(num==1 || num ==0){
            return num;
        }
       
        return (findFibonacci(num-1)+findFibonacci(num-2));
    }

    public static void main(String[] args) {
        Fibonacci fi=new Fibonacci();
        int num=6;
        for(int i=0;i<=num;i++){
            System.out.print(fi.findFibonacci(i)+"   ");
        }
        System.out.println();
        
    }
}
