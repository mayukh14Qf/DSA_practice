// 1+ x/1! + x^2/2! + x^3/3!  .....

package Loops;

import java.util.Scanner;

public class loop2 {
    public static double fac(double n){
        if(n==0){
            return 1;
        }
        else {
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your x ");
        double x=sc.nextInt();
        System.out.println("enter your n ");
        double n=sc.nextInt();
        double sum =1;
        for(double i=1;i<n;i++){
            sum=sum+(Math.pow(x,i)/fac(i));
        }
        System.out.println(sum);

    }
}
