package Array;

public class subArrays {
    public static void subArray(int [] marks){
        int totalSum=0;
        for(int i=0;i<marks.length;i++){
            for(int j=i;j<marks.length;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println();
                totalSum++;
            }
            System.out.println();
        }
        System.out.println("total number of sub arrays : "+totalSum);
    }
    public static void main(String[] args) {
        int [] marks={2,1,4,6,7};
        subArray(marks);
    }
}
