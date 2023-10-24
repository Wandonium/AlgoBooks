/* 
 * Write a short Java method, isEven, that takes an int i and returns true if and only 
 * if i is even. Your method cannot use the multiplication, modulus, or division operators, however.
 */
public class Reinforcement4 {
    public static void main(String[] args) {
        System.out.println("11 is not an even number: " + isEven(11));
        System.out.println("10 is not an even number: " + isEven(10));
        System.out.println("15 is not an even number: " + isEven(15));
        System.out.println("18 is not an even number: " + isEven(18));
    }

    // Division is simply subtraction multiple times.
    public static boolean isEven(int i) {
        int num = i;
        while(num > 0) {
            num = num - 2;
        }
        return num == 0;
    }
}
