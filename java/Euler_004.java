
public class Euler_004 {

    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                StringBuilder product = new StringBuilder(Integer.toString(i * j));
                int reverse = Integer.parseInt(product.reverse().toString());
                if (reverse == i * j && reverse > largestPalindrome) {
                    largestPalindrome = reverse;
                }
            }
        }

        System.out.println(largestPalindrome);
    }

}
