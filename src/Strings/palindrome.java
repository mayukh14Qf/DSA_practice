package Strings;

public class palindrome {
    public static Boolean isPalindrome(String s){
        String p="";
        int ptr=s.length()-1;
        while (ptr>=0){
            p=p+s.charAt(ptr);
            ptr --;
        }
        if(p.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="moom";
        System.out.println(isPalindrome(s));
    }
}
