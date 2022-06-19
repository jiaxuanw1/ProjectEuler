
public class Euler_046 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findSolution() {
        for (int n = 37;; n += 2) {
            if (!isPrime(n)) {
                boolean conjecture = false;
                for (int i = 1; i * i * 2 <= n && !conjecture; i++) {
                    if (isPrime(n - i * i * 2)) {
                        conjecture = true;
                    }
                }
                if (!conjecture) {
                    return n;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findSolution());
    }

}
