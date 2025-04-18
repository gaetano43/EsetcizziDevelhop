import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Date4Test {

    @Test
    public void testDataModificataFormattata() {
        // Dato: data iniziale ISO
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Quando: applico le modifiche
        OffsetDateTime dataModificata = data.plusYears(1).minusMonths(1).plusDays(7);

        // Formatter per output localizzato in italiano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.ITALY);

        // Formattazione
        String dataInizialeFormattata = data.format(formatter);
        String dataModificataFormattata = dataModificata.format(formatter);

        // Allora: le date formattate devono corrispondere
        assertEquals("01 marzo 2023, 13:00", dataInizialeFormattata, "Formato data iniziale non corretto");
        assertEquals("08 febbraio 2024, 13:00", dataModificataFormattata, "Formato data modificata non corretto");
    }
}


