package practice.String;

import java.util.Arrays;

public class StringReverseNormal {
    public static void main(String[] args) {
        String s="please reverse this";
        char[] carray=s.toCharArray();
        int l=carray.length;
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<l/2;i++){
           char c=carray[i];
            carray[i]=carray[l-i-1];
            carray[l-i-1]=c;
        }

        String res=Arrays.toString(carray).replaceAll(", ", "");
        System.out.println("the reverse is"+res);
    }
}
