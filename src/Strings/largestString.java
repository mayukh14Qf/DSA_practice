package Strings;

public class largestString {
    public static String largest(String [] fruits){
        String lar=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(lar.compareTo(fruits[i])<0){    // Compare in lexicographically order
                lar=fruits[i];
            }
        }
        return lar;
    }
    public static void main(String[] args) {
        String [] fruits={"apple","mango","banana"};
        System.out.println(largest(fruits));

        // Big o of (X*n) is our time complexity [x= max length of letters ]
    }
}
