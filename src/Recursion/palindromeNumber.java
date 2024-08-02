package Recursion;

public class palindromeNumber {

    public static int checkPalindromeNumber(int number) {

        if (number==reverse(number)){
            return 1;
        }
        return 0;
    }
    public static int reverse(int number){

        if (number>=0 && number <=9){
            return number;
        }
        return (number%10)*(int) (Math.pow(10,(String.valueOf(number).length()-1)))+(reverse(number/10));
    }


    public static void main(String[] args) {
        System.out.println(checkPalindromeNumber(121));
    }
}
