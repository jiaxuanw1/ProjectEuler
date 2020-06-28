
public class Euler_014 {

    public static void main(String[] args) {
        int longestStart = 1;
        int longestLength = 1;

        for (int i = 2; i < 1000000; i++) {
            long n = i;
            int term = 0;

            while (n != 1) {
                term++;
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
            }

            if (term > longestLength) {
                longestStart = i;
                longestLength = term;
            }
        }

        System.out.println(longestStart);
    }

}
