package Sorting;

public class CountingSort {
    public static void sort4(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }

        int[] count = new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0; i< count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr []={5,4,1,2,3,1,7,9};
        sort4(arr);

        for(int p : arr){
            System.out.print(p+" ");
        }
    }
}
