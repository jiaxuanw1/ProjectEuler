
public class Euler_036 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
