package datatype;

public class First {
    public static void main(String[] args) {
//        System.out.println("Hello world");

        // Print a pattern

       /* for (int i=4;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
       /* int a=8;
        String s=String.valueOf(a);
        System.out.println();
        */

        // A pattern

        for (int i=1;i<=5;i++){
            int p;
            if (i%2==0){
                p=0;
            }
            else {
                p=1;
            }
            for (int j=1;j<=i;j++){
                System.out.print(p+" ");
                if (p==1){
                    p=0;
                }
                else{
                    p=1;
                }
            }
            System.out.println();
        }

        // Floyd's Triangle
        /*
        int q=0;
        for (int i=0;i<=3;i++){
            for (int j=0;j<=i;j++){
                q++;
                System.out.print(q+" ");
            }
            System.out.println();
        } */

        /*
        for (int i=1;i<=6;i++){
            if (i==1 || i==6){
                for (int j=1;j<=5;j++){
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <= 5; j++) {
                    if (j == 1 || j == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        */

    }
}
