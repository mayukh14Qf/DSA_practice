package SEARCHING;

public class BinarySearchRecursion {

    public static int bSearch(int[] arr,int ele,int start,int end){
        if (start==end){
            if (arr[start]==ele){
                return start;
            }
            else {
                return -1;
            }
        }
        else {
            int mid=(start+end)/2;
            if (arr[mid]==ele){
                return mid;
            }
            else if (arr[mid]<ele){
                return bSearch(arr,ele,mid+1,end);
            }
            else {
                return bSearch(arr,ele,start,mid-1);
            }

        }

    }


    public static void main(String[] args) {
        int [] arr1={7,10,12,16,22,24,32,40};
        System.out.println(bSearch(arr1,10,0, arr1.length-1));
    }
}
