package SEARCHING;

public class BinarySearch {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        //N ->SIZE
        //K ->THAT ELEMENT
        int start=0;
        int end=N-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(K==arr[mid]){
                return 1;
            }
            else if(arr[mid]<K){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {


    }
}
