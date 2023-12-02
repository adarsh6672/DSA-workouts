package practice.String;

public class NormalString {

    public boolean checkPalindrome(String s){
         int l=s.length();

        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="malayalam";
       NormalString normalString=new NormalString();
       if(normalString.checkPalindrome(s)){
        System.out.println("the string is palindrome");
       }else{
        System.out.println("string is not palindrom");
       }
    }
    
}
