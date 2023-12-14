package practice.test;

public class Test {
    public static void fn(int n){
        if(n<=1){
            return;
        }
        fn(n-1);
        System.out.println(n);
        fn(n-1);

    }
    public static void main(String[] args) {
        fn(5);
    }
}
