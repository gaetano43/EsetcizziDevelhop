import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe di test per verificare il corretto formato della data
 * a partire da una stringa in formato ISO 8601.
 */
public class Data2Test {

    /**
     * Questo test verifica che una data in formato ISO 8601 venga
     * correttamente convertita nel formato "dd MMMM yyyy"
     * (esempio: "01 marzo 2023") in lingua italiana.
     */
    @Test
    public void testFormatoDataItaliano() {
        // Step 1: Parsing della data da una stringa ISO 8601 (standard usato per date e orari)
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Step 2: Creazione di un formatter per visualizzare la data nel formato italiano desiderato
        // "dd MMMM yyyy" → giorno con due cifre, mese esteso, anno a quattro cifre
        // Locale.ITALY   → per ottenere il mese in italiano, es. "marzo" anziché "March"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);

        // Step 3: Formattazione dell'oggetto OffsetDateTime in una stringa secondo il pattern
        String dataFormattata = data.format(formatter);

        // Step 4: Verifica del risultato atteso tramite asserzione
        // Se il valore formattato non corrisponde a "01 marzo 2023", il test fallirà
        assertEquals("01 marzo 2023", dataFormattata,
                "Il risultato deve essere '01 marzo 2023' per la data fornita");
    }
}

