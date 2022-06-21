import java.util.ArrayList;
import java.util.List;

public class Euler_041 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<String> generatePermutations(String word) {
        List<String> permutations = new ArrayList<String>();

        // Base case - a word with 0 or 1 character only has 1 permutation (itself)
        if (word.length() <= 1) {
            permutations.add(word);
            return permutations;
        }

        // For each character in the word, keep it at the front and recursively generate
        // all permutations of the remaining characters
        for (int i = 0; i < word.length(); i++) {
            String subword = new StringBuilder(word).deleteCharAt(i).toString();
            List<String> subPermutations = generatePermutations(subword);
            for (String subPerm : subPermutations) {
                permutations.add(word.charAt(i) + subPerm);
            }
        }

        // Return the List of permutations
        return permutations;
    }

    // Generates a List of all n-digit pandigital numbers in descending order.
    public static List<String> generateAllPandigitals(int digits) {
        int largestPandigital = 0;
        for (int i = 1; i <= digits; i++) {
            largestPandigital += i * Math.pow(10, i - 1);
        }
        return generatePermutations(Integer.toString(largestPandigital));
    }

    public static void main(String[] args) {
        for (int digits = 9; digits >= 1; digits--) {
            List<String> pandigitals = generateAllPandigitals(digits);
            for (String p : pandigitals) {
                if (isPrime(Integer.parseInt(p))) {
                    System.out.println(p);
                    return;
                }
            }
        }
    }

}
