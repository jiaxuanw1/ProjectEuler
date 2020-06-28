
public class Euler_005 {

    public static boolean isDivisible(int n) {
        for (int i = 2; i <= 20; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;

        while (!isDivisible(n)) {
            n += 20;
        }

        System.out.println(n);

    }

}
