package Recursion;

public class Fibonacci {
    public static int fibonacciNumber(int position){
        if (position==1){
            return 0;
        }
        else if ((position==2) || (position==3)){
            return 1;
        }
        else {
            return fibonacciNumber(position-1)+fibonacciNumber(position-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumber(8));
    }
}
