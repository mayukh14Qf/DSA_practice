package Array;

public class binarySearch {
    public  static int binary(int [] marks, int key){
        int start=0; int end=marks.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] < key) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] marks={1,2,3,4,5}; // sorted array
        int key=5;

        System.out.println(binary(marks,key));
        // time complexity fot this code is big of log(n)

    }
}
