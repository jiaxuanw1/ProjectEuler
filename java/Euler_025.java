import java.math.BigInteger;

public class Euler_025 {

	public static void main(String[] args) {
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
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
