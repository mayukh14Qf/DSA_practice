package Recursion;

public class SumOfDigits {

    public static int sumOfDigits(int number){
        if (number>=0 && number <=9){
            return number;
        }
        return (number%10)+sumOfDigits(number/10);
    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(156));
    }
}
