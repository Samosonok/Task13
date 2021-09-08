import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class ParsedString {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd " +
                "hh:mm:ss a", Locale.US);
        System.out.println(LocalDateTime.parse("1999/Jun/18 07:34:56 PM", formatter));
    }
}