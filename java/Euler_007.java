
public class Euler_007 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 3, term = 2;

        while (term < 10001) {
            n += 2;
            if (isPrime(n)) {
                term++;
            }
        }

        System.out.println(n);

    }

}
