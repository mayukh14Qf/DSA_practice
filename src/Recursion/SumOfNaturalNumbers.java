package Recursion;

public class SumOfNaturalNumbers {

    public static int sumOfNumbers(int range){
        if (range==1){
            return 1;
        }
        return range+sumOfNumbers(range-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(10));
    }
}
