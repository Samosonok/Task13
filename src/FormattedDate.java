import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class FormattedDate {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2001, 1, 15, 23, 56);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}
