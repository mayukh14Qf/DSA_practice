package Array;

public class reverseArray {
    public  static int [] reverse(int [] marks){
        int start =0;
        int end=marks.length-1;
        int temp;
        while (start<end){
            temp=marks[start];
            marks[start]=marks[end];
            marks[end]=temp;
            start++;
            end --;
        }
        return marks;
    }
    // time complexity us big o of n
    public static void main(String[] args) {
        int [] marks={12,2,34,56,1};
        int [] revMarks=reverse(marks);
        for(int p : revMarks){
            System.out.print(p+" ");

        }
    }
}
