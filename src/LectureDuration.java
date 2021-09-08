import java.time.Duration;
import java.time.LocalTime;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class LectureDuration {

    public static void main(String[] args) {
        LocalTime start = LocalTime.of(16, 0, 0);
        LocalTime end = LocalTime.of(18, 0,0);
        Duration duration = Duration.between(start, end);
        System.out.println("Lecture duration in seconds: " + duration.getSeconds());
        System.out.println("Lecture duration in minutes: " + duration.toMinutes());
    }
}
