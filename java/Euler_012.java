
public class Euler_012 {

    public static void main(String[] args) {
        int num = 0;

        for (int i = 1;; i++) {
            int divisors = 0;
            num += i;

            for (int j = 1; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    divisors += 2;
                }
                if (Math.sqrt(num) % 1 == 0) {
                    divisors--;
                }
            }

            if (divisors > 500) {
                System.out.println(num);
                return;
            }
        }
    }

}
