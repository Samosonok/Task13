import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class SeasonsDuration {

    public static void main(String[] args) {
        LocalDateTime startYear = LocalDateTime.of(1965, 1, 1, 0, 0);
        LocalDateTime startSpring = LocalDateTime.of(1965, 3, 1, 0, 0);
        LocalDateTime startSummer = LocalDateTime.of(1965, 6, 1, 0, 0);
        LocalDateTime startAutumn = LocalDateTime.of(1965, 9, 1, 0, 0);
        LocalDateTime startWinter = LocalDateTime.of(1965, 12, 1, 0, 0);
        LocalDateTime endYear = LocalDateTime.of(1966, 1, 1, 0, 0);
        
        Duration spring = Duration.between(startSpring, startSummer);
        Duration summer = Duration.between(startSummer, startAutumn);
        Duration autumn = Duration.between(startAutumn, startWinter);
        Duration winterPart1 = Duration.between(startYear, startSpring);
        Duration winterPart2 = Duration.between(startWinter, endYear);

        System.out.println("The duration of the seasons in 1965 in minutes: " +
                "\nSpring: " + spring.toMinutes() +
                "\nSummer: " + summer.toMinutes() +
                "\nAutumn: " + autumn.toMinutes() +
                "\nWinter: " + (winterPart1.toMinutes() + winterPart2.toMinutes()));
    }
}
