import java.time.LocalDateTime;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class IntervalBetweenLectures {

    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2021, 8, 31,
                20, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2021, 9, 4,
                18, 0, 0);
        long days = date2.getDayOfYear() - date1.getDayOfYear();
        System.out.println("Interval in days: " + days);
        long hours = date2.getHour() - date1.getHour() + days * 24;
        System.out.println("Interval in hours: " + hours);
        long minutes = date2.getMinute() - date1.getMinute() + hours * 60;
        System.out.println("Interval in minutes: " + minutes);
        long seconds = date2.getSecond() - date1.getSecond() + minutes * 60;
        System.out.println("Interval in seconds: " + seconds);
    }
}
