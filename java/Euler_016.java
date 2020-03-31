import java.math.BigInteger;

public class Euler_016 {

	public static void main(String[] args) {
		BigInteger NUM = new BigInteger("2").pow(1000);
		String[] digits = NUM.toString().split("");

		int sum = 0;
		for (String digit : digits) {
			sum += Integer.parseInt(digit);
		}

		System.out.println(sum);
	}

}
