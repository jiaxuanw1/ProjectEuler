
public class Euler_002 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		int total = 0;

		while (sum <= 4000000) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;

			if (sum % 2 == 0) {
				total += sum;
			}

		}

		System.out.println(total);
	}

}
