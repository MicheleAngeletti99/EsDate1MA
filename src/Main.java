import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        ZonedDateTime dataZoned = data.toZonedDateTime();
        String dataFull = dataZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String dataMedium = dataZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dataShort = dataZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println(dataFull);
        System.out.println(dataMedium);
        System.out.println(dataShort);
    }
}