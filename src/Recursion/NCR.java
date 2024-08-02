package Recursion;

public class NCR {

    public static int nCr(int n,int r){
        if (n<r){
            return 0;
        }
        if (r==1){
            return n;
        }
        if (r==0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        return nCr(n-1,r-1)+nCr(n-1,r);
    }


    public static void main(String[] args) {
        System.out.println(nCr(5,2));
    }
}
