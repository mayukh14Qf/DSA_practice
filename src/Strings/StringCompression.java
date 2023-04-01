package Strings;

public class StringCompression {
    public static String compress(String str){
        String p="";
        for (int i=0;i<str.length();i++){
            int count=1;
            while ((i<str.length()-1) && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            p=p+str.charAt(i);
            if(count>1){
                p=p+ Integer.toString(count);
            }
        }
        return p;
    }
    public static void main(String[] args) {
        String str="aaaabbbbcccd";
        System.out.println(compress(str));
    }
}
