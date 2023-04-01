package Array;

public class sumOfElementInSubArray {
    public static void sumOfElement ( int[] marks){
        int totalSum = 0;
        int sum=0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum=sum+marks[k];
                    System.out.print(marks[k] + " ");
                }
                System.out.print(" sum of the elements is :" +sum);
                System.out.println();
                sum=0;
                totalSum++;
            }
            System.out.println();
        }
        System.out.println("total number of sub arrays : " + totalSum);
    }
    public static void main(String[] args) {
        int [] marks={2,1,4,6,7};
        sumOfElement(marks);
    }
}
