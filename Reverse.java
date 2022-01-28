package String;

import java.util.Stack;

public class Reverse {



    public static void reverseWords(String s) {
        s=s.trim();
        Stack<String> st=new Stack<>();
        String ch="";
        int c=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               c++;
               if(c==1){
                   st.push(ch);
                   ch="";
               }
           }
           else {
               ch=ch+s.charAt(i);
               c=0;
           }
       }
       String p="";
       st.push(ch);
       while (st.size()!=0) {
           p=p+st.pop()+" ";
       }
        System.out.print(p);
    }

    public static void main(String[] args){
        String s=" hello world ";
        reverseWords(s);
    }
}
