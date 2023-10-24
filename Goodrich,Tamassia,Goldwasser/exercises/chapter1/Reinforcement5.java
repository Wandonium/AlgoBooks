

/* 
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n.
 */
public class Reinforcement5 {
    public static void main(String[] args) {
        System.out.println("Sum of all positive integers less than or equal to 5: " + sumofInts(5));
        System.out.println("Sum of all positive integers less than or equal to 15: " + sumofInts(15));
        System.out.println("Sum of all positive integers less than or equal to 25: " + sumofInts(25));
        System.out.println("Sum of all positive integers less than or equal to 35: " + sumofInts(35));
        System.out.println("Sum of all positive integers less than or equal to 105: " + sumofInts(105));
    }

    public static int sumofInts(int n) {
        int total = 0;
        for(int i = 0; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
}
