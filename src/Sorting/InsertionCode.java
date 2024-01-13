package Sorting;

public class InsertionCode {
    public static void sort2(int arr []){
        for (int i=1;i< arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while (prev >=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev --;
            }
            arr[prev+1]=cur;
        }
    }
    public static void main(String[] args) {
        int arr []={5,4,1,3,2};
        sort2(arr);

        for(int p : arr){
            System.out.print(p+" ");
        }
    }
}
