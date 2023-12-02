package practice.String;

public class ReplaceAlphebets {
    public static void main(String[] args) {
        String s="Hai java developer";
        int n=1;
        char c= s.charAt(n);
        String res=s.replace(c,'*');
        System.out.println(res);

    }
}
