import java.math.BigInteger;

public class Euler_015 {

	public static BigInteger factorial(int n) {
		BigInteger product = new BigInteger("1");
		for (int i = n; i > 1; i--) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		return product;
	}

	public static BigInteger choose(int n, int k) {
		BigInteger perm = new BigInteger("1");
		for (int i = n; i > n - k; i--) {
			perm = perm.multiply(BigInteger.valueOf(i));
		}
		return perm.divide(factorial(k));
	}

	public static void main(String[] args) {
		System.out.println(choose(40, 20));
	}

}
