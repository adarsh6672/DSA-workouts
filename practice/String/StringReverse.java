package practice.String;

public class StringReverse {
    public static void main(String[] args) {
        String s="hello i am here";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String[] sr=s.split(" ");
        for(String b:sr){
            System.out.println(b);
        }
        System.out.println(sb);
        
    }
}
