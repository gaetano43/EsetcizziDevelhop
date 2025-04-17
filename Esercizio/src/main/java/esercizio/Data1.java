package esercizio;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Data1 {
    public static void main(String[] args) {
        try {
            // Parsing della data da una stringa in formato ISO 8601
            OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

            /*
             * Formattatori per diversi stili:
             * - FULL: formato completo, include giorno della settimana, mese esteso e anno (es. "venerdì 1 marzo 2002")
             * - MEDIUM: formato medio, mese abbreviato (es. "1 mar 2002")
             * - SHORT: formato compatto, numerico (es. "01/03/02")
             */
            DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);
            DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY);
            DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);

            // Applicazione dei diversi formati
            String dataFull = data.format(fullFormatter);
            String dataMedium = data.format(mediumFormatter);
            String dataShort = data.format(shortFormatter);

            // Stampa dei risultati
            System.out.println("Formato FULL:   " + dataFull);   // Esempio: venerdì 1 marzo 2002
            System.out.println("Formato MEDIUM: " + dataMedium); // Esempio: 1 mar 2002
            System.out.println("Formato SHORT:  " + dataShort);  // Esempio: 01/03/02

        } catch (DateTimeParseException e) {
            // Gestione dell'errore in caso di formato data non valido
            System.err.println("Errore nel parsing della data. Verifica che la stringa sia nel formato corretto ISO 8601 (es. 2002-03-01T13:00:00Z).");
        }
    }
}
