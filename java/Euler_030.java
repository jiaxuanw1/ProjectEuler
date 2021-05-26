
public class Euler_030 {

    /*
     * For an n-digit number, the maximum possible sum of the fifth powers of the
     * digits is n * 9^5. Trying different numbers of digits, 6 digits is the
     * largest for which the maximum sum does not have fewer digits than the
     * original number. Therefore, we can limit the range of possible numbers to
     * have a maximum of 6 * 9^5, or 354294.
     */
    private static int max = 354294;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < max; i++) {
            if (i == sumFifthPowerDigits(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int sumFifthPowerDigits(int n) {
        String[] digits = Integer.toString(n).split("");
        int sum = 0;
        for (String digit : digits) {
            sum += Math.pow(Integer.parseInt(digit), 5);
        }
        return sum;
    }

}
