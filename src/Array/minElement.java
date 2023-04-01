package Array;

public class minElement {
    public  static int minEle(int [] marks){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
            if (min>marks[i]){
                min=marks[i];
            }
        }
        return  min;
    }
    public static void main(String[] args) {
        int [] marks={12,2,34,56,1,89,90,11};
        System.out.println(minEle(marks));
    }
}
