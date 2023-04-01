package Array;

public class pairs {
    public static void pair(int [] marks){
        for(int i=0;i<marks.length;i++){
            for (int j=i+1;j<marks.length;j++){
                System.out.print("("+marks[i]+","+marks[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] marks={12,2,34,56,1};
        pair(marks);
        // time complexity big of (n^2)
        // formula of pairs is [ n(n-1)/2 ]
    }
}
