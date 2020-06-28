
public class Euler_003 {

    public static void main(String[] args) {
        long n = 600851475143L;
        int factor = 3;

        while (factor < n) {
            if (n % factor == 0) {
                n /= factor;
                factor = 3;
            } else {
                factor += 2;
            }
        }

        System.out.println(n);

    }

}
