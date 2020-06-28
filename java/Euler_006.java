
public class Euler_006 {

    public static int naturalSum(int n) {
        return n * (n + 1) / 2;
    }

    public static int squareSum(int n) {
        return n * (n + 1) * (n * 2 + 1) / 6;
    }

    public static void main(String[] args) {
        int sumOfSquares = squareSum(100);
        int squareOfSum = (int) Math.pow(naturalSum(100), 2);
        System.out.println(squareOfSum - sumOfSquares);
    }

}
