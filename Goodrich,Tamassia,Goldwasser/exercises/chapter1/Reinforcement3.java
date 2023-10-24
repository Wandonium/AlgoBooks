/* 
 *  Write a short Java method, isMultiple, that takes two long values, n and m, and 
 *  returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class Reinforcement3 {
    public static void main(String[] args) {
        System.out.println("3 is a multiple of 6: " + isMultiple(3, 6));
        System.out.println("3147293 is a multiple of 3147293165: " + isMultiple(3147293L, 3147293165L));
        System.out.println("6 is a multiple of 9828347547: " + isMultiple(6L, 9828347547L));
    }

    public static boolean isMultiple(long a, long b) {
        return b%a == 0;
    }
}
