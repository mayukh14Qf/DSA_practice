package Array;

public class maxSubArray {
    // brute force method with big of (n^3) time complexity
    public static void maxSub(int [] marks){
        int CurrentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            for(int j=i;j<marks.length;j++){
                for (int k=i;k<=j;k++){
                    CurrentSum=CurrentSum+marks[k];
                    System.out.print(marks[k]+" ");
                }
                System.out.print("[ sum of this sub Array is : "+CurrentSum+" ]");
                System.out.println();
                if (CurrentSum>maxSum){
                    maxSum=CurrentSum;
                }
                CurrentSum=0;
            }
            System.out.println();
        }
        System.out.println("max of sub Array is "+maxSum);
    }

    // prefix Array method with time complexity big o of (n^2)
    public static void prefixSubArraySum(int [] marks){
        int max=Integer.MIN_VALUE;
        int currentSum;
        int [] prefix=new int[marks.length];
        prefix[0]=marks[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+marks[i];
        }
        for(int i=0;i<marks.length;i++){
            for (int j=i;j<marks.length;j++) {
                System.out.println(currentSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1]);
                if (currentSum > max) {
                    max = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum of sub array is :"+ max);
    }

    // Kadane's Algorithm with time complexity big o of (n)
    public static void kadaneAlgorithm(int [] marks){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            cs=cs+marks[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum of array is "+ms);
    }
    public static void main(String[] args) {
        int [] marks={2,-1,6,9,-7};
        maxSub(marks);

        System.out.println();
        prefixSubArraySum(marks);

        System.out.println();
        kadaneAlgorithm(marks);
    }
}
