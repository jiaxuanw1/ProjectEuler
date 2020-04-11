import java.math.BigInteger;

public class Euler_025 {

	public static void main(String[] args) {
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		int count = 2;

		while (sum.toString().length() < 1000) {
			sum = n1.add(n2);
			n1 = n2;
			n2 = sum;
			count++;
		}

		System.out.println(count);
	}

}
