import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.time.format.DateTimeParseException;

public class Data2 {
    public static void main(String[] args) {
        try {
            // Parsing della stringa ISO 8601 in un oggetto OffsetDateTime
            OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

            // Creazione di un formatter personalizzato per visualizzare la data nel formato "01 marzo 2023"
            // dd    → giorno (due cifre)
            // MMMM  → mese esteso (in italiano)
            // yyyy  → anno a quattro cifre
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);

            // Applichiamo il formatter all'oggetto OffsetDateTime
            String dataFormattata = data.format(formatter);

            // Stampa del risultato sulla console
            System.out.println("La data formattata è: " + dataFormattata);

        } catch (DateTimeParseException e) {
            // Gestione dell'errore nel parsing della stringa in caso di formato errato
            System.out.println("Errore nel parsing della data: formato non valido.");
        }
    }
}


