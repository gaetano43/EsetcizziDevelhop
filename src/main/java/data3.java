import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class data3 {
    public static void main(String[] args) {
        try {
            // Parsing della stringa ISO 8601 in un oggetto OffsetDateTime
            // La "Z" alla fine indica che la data/ora è in formato UTC
            OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

            // Ottieni il mese in italiano (es. "marzo" anziché "MARCH")
            String meseItaliano = data.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);

            // Ottieni il giorno della settimana in italiano (es. "mercoledì")
            String giornoSettimanaItaliano = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

            // Stampa i risultati in un'unica istruzione, come da richiesta
            System.out.println("L'anno è " + data.getYear() + "\n" +
                    "Il mese è " + meseItaliano + "\n" +
                    "Il giorno è " + data.getDayOfMonth() + "\n" +
                    "Il giorno della settimana è " + giornoSettimanaItaliano + "\n");

        } catch (DateTimeParseException e) {
            // In caso di errore nel parsing della data (es. formato errato)
            System.out.println("Errore: la stringa della data non è valida.");
        }
    }
}
