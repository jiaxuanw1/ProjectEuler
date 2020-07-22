
public class Euler_019 {

    private static int[] DAYS_IN_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        int dayOfWeek = 1;
        int sundays = 0;

        for (int year = 1900; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                if (year >= 1901 && dayOfWeek == 0) {
                    sundays++;
                }

                if (month == 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    dayOfWeek = (dayOfWeek + 29) % 7;
                } else {
                    dayOfWeek = (dayOfWeek + DAYS_IN_MONTH[month]) % 7;
                }
            }
        }

        System.out.println(sundays);
    }

}
