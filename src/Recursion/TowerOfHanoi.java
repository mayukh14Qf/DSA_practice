package Recursion;

public class TowerOfHanoi {

    public static void TOH(int n,char a, char b, char c){
        if (n==1){
            System.out.println("MOVE 1 FROM "+a+" TO "+c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("MOVE " +n+" FROM "+a+" TO "+c);
        TOH(n-1,b,a,c);
    }



    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
}
