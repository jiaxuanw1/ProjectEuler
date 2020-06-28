
public class Euler_017 {

    private static String[] ONES = 
        { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static String[] TENS = 
        { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static String[] TEENS = 
        { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    public static String toWords(int n) {
        if (n < 10) {
            return ONES[n];
        } else if (n < 20) {
            return TEENS[n % 10];
        } else if (n < 100) {
            if (n % 10 == 0) {
                return TENS[n / 10];
            } else {
                return TENS[n / 10] + " " + ONES[n % 10];
            }
        } else if (n < 1000) {
            if (n % 100 == 0) {
                return ONES[n / 100] + " hundred";
            } else if (9 < n % 100 && n % 100 < 20) {
                return ONES[n / 100] + " hundred and " + TEENS[n % 10];
            } else {
                return ONES[n / 100] + " hundred and " + TENS[(n / 10) % 10] + " " + ONES[n % 10];
            }
        } else if (n == 1000) {
            return "one thousand";
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        int totalLetters = 0;
        for (int i = 1; i <= 1000; i++) {
            totalLetters += toWords(i).replaceAll("\\s", "").length();
        }
        System.out.println(totalLetters);
    }

}
