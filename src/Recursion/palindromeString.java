package Recursion;

public class palindromeString {
    public static boolean checkPalindromeString(String s,int start,int end){
        if (start>=end){
            return true;
        }
        return (s.charAt(start)==s.charAt(end) && (checkPalindromeString(s,start+1,end-1)));
    }

    public static int checkPalindromeString1(String s,int start,int end){
        if (start>=end){
            return 1;
        }
        else if(s.charAt(start)==s.charAt(end)){
            return checkPalindromeString1(s,start+1,end-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindromeString("abcba",0,4));
        System.out.println(checkPalindromeString1("abcba",0,4));
    }
}
