package Strings;

public class letterUpperCase {
    // Method 1
    public static String toUpperCase(String s){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {

        String s="my name is mayukhjit";
        // Method 2
        String p="";
        p=p+s.toUpperCase().charAt(0);
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==' '){
                p=p+s.charAt(i);
                i++;
                p=p+s.toUpperCase().charAt(i);
            }
            else {
                p=p+s.charAt(i);
            }
        }
        System.out.println(p);
        System.out.println(toUpperCase(s));
    }
}
