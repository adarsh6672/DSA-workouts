package practice.recursion;

public class FactorialRecursion {
    public int findFactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*findFactorial(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        FactorialRecursion fr=new FactorialRecursion();
        System.out.println("Factorial is "+fr.findFactorial(num));
    }
}
