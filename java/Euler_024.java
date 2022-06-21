import java.util.ArrayList;
import java.util.List;

public class Euler_024 {

    /*
     * This method will generate permutations in lexicographic order if the digits
     * specified are in order.
     */
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

        return permutations;
    }

    public static void main(String[] args) {
        List<String> permutations = generatePermutations("0123456789");
        System.out.println(permutations.get(999999));
    }

}
