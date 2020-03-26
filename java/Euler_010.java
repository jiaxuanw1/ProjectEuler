
public class Euler_010 {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long sum = 2L;

		for (int i = 3; i < 2000000; i += 2) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

}
