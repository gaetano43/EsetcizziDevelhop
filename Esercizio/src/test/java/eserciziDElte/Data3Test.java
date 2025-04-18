package eserciziDElte;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Data3Test {

    @Test
    public void testEstrazioneDataInItaliano() {
        // Dato: una stringa ISO 8601
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Quando: estraiamo le componenti della data
        int anno = data.getYear(); // 2023
        int giorno = data.getDayOfMonth(); // 1
        String meseItaliano = data.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY); // "marzo"
        String giornoSettimanaItaliano = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY); // "mercoledì"

        // Allora: verifichiamo che siano corretti
        assertEquals(2023, anno, "Anno  corretto");
        assertEquals(1, giorno, "Giorno del mese  corretto");
        assertEquals("marzo", meseItaliano, "Mese  corretto in italiano");
        assertEquals("mercoledì", giornoSettimanaItaliano, "Giorno della settimana  corretto in italiano");
    }
}


