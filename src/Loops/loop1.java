
/* 1! + 2! + 3! + 4! + ................. + N! */




package Loops;

import java.util.Scanner;

public class loop1 {
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your range");
        int n= sc.nextInt();
        int sum=0;
        while (n>0){
            sum=sum+fac(n);
            n--;
        }
        System.out.println(sum);

    }
}
