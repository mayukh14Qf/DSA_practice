package Strings;

public class countVowel {
    public static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="hi my name is Mayukhjit";
        System.out.println(countVowels(s));
    }
}
