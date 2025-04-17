import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Data1Test {

    @Test
    public void testFormatoFull() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);

        String formato = data.format(formatter);
        assertEquals("venerdì 1 marzo 2002", formato, "Formato FULL non corretto");
    }

    @Test
    public void testFormatoMedium() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY);

        String formato = data.format(formatter);
        assertEquals("1 mar 2002", formato, "Formato MEDIUM non corretto");
    }

    @Test
    public void testFormatoShort() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);

        String formato = data.format(formatter);
        assertEquals("01/03/02", formato, "Formato SHORT non corretto");
    }
}
