package Sorting;

public class PracticeSorting {
    public static  void bubbleSort(int numbers []){
        for (int i=0;i< numbers.length-2;i++){
            for (int j=0;j< numbers.length-1-i;j++){
                if (numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr []){
        for (int i=0;i< arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }

    public static void insertionSort(int arr []){
        for (int i=1;i< arr.length;i++){
            int cur=arr[i];
            int pre=i-1;
            while (pre>=0 && cur<arr[pre]){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=cur;
        }
    }

    public static void countingSort(int arr []){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int [] count= new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int y=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr[y]=i;
                y++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] numbers={4,7,1,8,3,6,4,1,9};
        countingSort(numbers);
        for ( int s : numbers){
            System.out.print(s+" ");
        }
    }
}
