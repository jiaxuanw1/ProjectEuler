
public class Euler_006 {

	public static void main(String[] arsg) {
		int sumOfSquares = 0, sum = 0;

		for (int i = 1; i <= 100; i++) {
			sumOfSquares += i * i;
			sum += i;
		}

		System.out.println(sum * sum - sumOfSquares);
	}

}
