
public class Euler_034 {

    /*
     * For an n-digit number, the maximum possible sum of the factorial of digits is
     * n * 9!. 7 is the largest number of digits for which the maximum possible sum
     * has no fewer digits than the original number. Therefore, we can limit the
     * range of possible numbers to have a maximum of 7 * 9!, or 2540160.
     */
    private static int max = 2540160;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= max; i++) {
            if (i == sumDigitFactorials(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int sumDigitFactorials(int n) {
        int sum = 0;
        while (n != 0) {
            int factorial = 1;
            for (int i = n % 10; i > 1; i--) {
                factorial *= i;
            }
            sum += factorial;
            n /= 10;
        }
        return sum;
    }

}
