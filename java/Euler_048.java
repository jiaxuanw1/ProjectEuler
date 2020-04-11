import java.math.BigInteger;

public class Euler_048 {

	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		System.out.println(sum.mod(BigInteger.TEN.pow(10)));
	}

}
