
public class Euler_009 {

    public static void main(String[] args) {
        // Uses Euclid's method to find Pythagorean triplets
        int a = 0;
        int b = 0;
        int c = 0;
        for (int m = 1; a < 998; m++) {
            for (int n = 1; m > n; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (a + b + c == 1000) {
                    System.out.println(a * b * c);
                }
            }
        }
    }

}
