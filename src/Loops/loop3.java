package Loops;



/*
input:
n=4

output:
w
xw
yyx
zzzy

input:
n=5

output:
v
xv
xxw
yyyx
zzzzy


 */




import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number ");
        int s=sc.nextInt();
        for(int i =1;i<=s;i++){
            for (int j=1;j<=i;j++){
                if(j==i && i==1){
                    System.out.print((char)('z'-(s-i)));
                }
                else if(i==j)
                {
                    System.out.print((char)('z'-(s-i+1)));
                } else {
                    System.out.print((char)('z'-(s-i)));

                }
            }
            System.out.println();
        }
    }
}
