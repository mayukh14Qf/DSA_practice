package Recursion;

public class NaturalNumbers {

    // N natural numbers in forward manner
    public static void numbers(int range){
        if (range==0){
            return;
        }
        numbers(range-1);
        System.out.println(range);
    }

    // N natural numbers in forward manner
    public static void numbersBackward(int range){
        if (range==0){
            return;
        }
        System.out.println(range);
        numbersBackward(range-1);
    }

    public static void main(String[] args) {
        numbers(10);

        numbersBackward(10);
    }
}
