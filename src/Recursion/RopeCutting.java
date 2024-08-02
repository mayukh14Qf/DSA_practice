package Recursion;

public class RopeCutting {

    public static int rope(int length, int a, int b, int c){
        if (length==0){
            return 0;
        }
        if (length<0){
            return -1;
        }
        int res=Math.max(rope(length-c,a,b,c),Math.max(rope(length-a,a,b,c),rope(length-b,a,b,c)));

        if (res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(rope(23,11,9,12));
    }
}
