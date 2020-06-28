
public class Euler_092 {

    public static int numberChainResult(int n) {
        int current = n;
        while (true) {
            int next = 0;
            String[] digits = Integer.toString(current).split("");
            for (String digit : digits) {
                next += Math.pow(Integer.parseInt(digit), 2);
            }
            if (next == 1) {
                return 1;
            } else if (next == 89) {
                return 89;
            } else {
                current = next;
            }
        }
    }

    public static void main(String[] args) {
        int startingNums = 0;
        for (int i = 1; i < 10000000; i++) {
            if (numberChainResult(i) == 89) {
                startingNums++;
            }
        }
        System.out.println(startingNums);
    }

}
