package Array;
public class linearSearch {
    public  static int linear(int[] marks, int key){
        for(int i=0;i<marks.length;i++){
            if (marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] marks ={12,45,1,25,7,80,12};
        int key=25;
        System.out.println(linear(marks,key));
        // time complexity for this code is big of n
    }
}
