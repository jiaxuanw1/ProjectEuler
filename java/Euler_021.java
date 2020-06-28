
public class Euler_021 {

    public static int sumProperDivisors(int n) {
        int sumOfProperDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors;
    }

    public static boolean isAmicable(int a) {
        int b = sumProperDivisors(a);
        return b != a && sumProperDivisors(b) == a;
    }

    public static void main(String[] args) {
        int sumAmicableNums = 0;
        for (int a = 2; a < 10000; a++) {
            if (isAmicable(a)) {
                sumAmicableNums += a;
            }
        }
        System.out.println(sumAmicableNums);
    }

}
