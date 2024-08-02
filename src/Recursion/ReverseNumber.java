package Recursion;

public class ReverseNumber {

    public static int reverse(int number){

        if (number>=0 && number <=9){
            return number;
        }
        return (number%10)*(int) (Math.pow(10,(String.valueOf(number).length()-1)))+(reverse(number/10));
    }

    public static void main(String[] args) {
        System.out.println(reverse(156));
    }
}
