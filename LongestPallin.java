package String;

public class LongestPallin {
    public static String pallin(String s,int start,int end){
        String c="";


        for(int i=end-1;i>=start;i--){
            c=c+s.charAt(i);
        }
        if(c.equals(s)){
            c=s;

        }
        else {
            c="";
        }

        return c;
    }

    public static String longestPalindrome(String s) {

        String z=pallin(s,0,s.length()-1);
        return z;
    }



    public static void main(String[] args){
        String s="babad";
        System.out.print(longestPalindrome(s));
    }
}
