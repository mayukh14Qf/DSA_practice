package Recursion;

public class CountDigits {

    public static int countDigits(int number){
        if (number>=0 && number<=9){
            return 1;
        }
        return 1+countDigits(number/10);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(54398));
    }
}
