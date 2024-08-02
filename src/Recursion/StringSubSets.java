package Recursion;

public class StringSubSets {


    public static void subSet(String s, String cur,int i){
        if (s.length()==i){
            System.out.print(cur+" ");
            return;
        }
        subSet(s,cur,i+1);
        subSet(s,cur+s.charAt(i),i+1);
    }

    public static void main(String[] args) {
        subSet("ABC","",0);
    }

}
