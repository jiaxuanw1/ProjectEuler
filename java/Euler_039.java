
public class Euler_039 {

    public static int numSolutions(int p) {
        int solutions = 0;
        for (int a = 1; a <= p / 2; a++) {
            for (int b = 1; b <= a; b++) {
                double c = p - a - b;
                if (Math.hypot(a, b) == c) {
                    solutions++;
                }
            }
        }
        return solutions;
    }

    public static void main(String[] args) {
        int maxSolutions = 0;
        int maxP = 0;
        for (int p = 3; p <= 1000; p++) {
            int solutions = numSolutions(p);
            if (solutions > maxSolutions) {
                maxSolutions = solutions;
                maxP = p;
            }
        }
        System.out.println(maxP);
    }

}
