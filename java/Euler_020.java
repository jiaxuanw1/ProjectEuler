import java.math.BigInteger;

public class Euler_020 {

	public static BigInteger factorial(int n) {
		BigInteger product = BigInteger.ONE;
		for (int i = n; i > 1; i--) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		return product;
	}

	public static void main(String[] args) {
		String[] digits = factorial(100).toString().split("");
		int sum = 0;
		for (String digit : digits) {
			sum += Integer.parseInt(digit);
		}
		System.out.println(sum);
	}

}
