package SEARCHING;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElements {

    public static int major(int [] arr){
        int size= arr.length;
        Arrays.sort(arr);
        int e1=arr[0];
        int element = 0;
        int elementCount=0;
        int count=0;
        for (int i=0;i<size;i++){
            if (arr[i]==e1){
                count++;
            }
            else {
                e1=arr[i];
                count=1;
            }
            if (count>elementCount){
                elementCount=count;
                element=e1;
            }
        }
        return elementCount>size/2?element:-1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int[6000];
        for (int i=0;i<6000;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println(major(arr1));
    }
}
