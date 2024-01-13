package Sorting;

public class SelectionSort {
    public static void sort1(int arr []){
        for (int i=0; i< arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    public static void main(String[] args) {
        int arr []={5,4,1,3,2};
        sort1(arr);

        for(int p : arr){
            System.out.print(p+" ");
        }
    }
}
