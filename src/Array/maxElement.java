package Array;

public class maxElement {
    public static  int maxEle(int [] marks){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] marks={12,2,34,56,1,89,90,11};
        System.out.println(maxEle(marks));
    }
}
