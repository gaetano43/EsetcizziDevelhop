import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Date4 {
    public static void main(String[] args) {
        try {
            // Crea l'oggetto OffsetDateTime dalla stringa ISO (Z indica UTC)
            OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

            // Applica le modifiche richieste: +1 anno, -1 mese, +7 giorni
            OffsetDateTime dataModificata = data.plusYears(1).minusMonths(1).plusDays(7);

            // Formatter per visualizzare data e ora in italiano
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.ITALY);

            // Formatto entrambe le date
            String dataInizialeFormattata = data.format(formatter);
            String dataFinaleFormattata = dataModificata.format(formatter);

            // Stampo i risultati
            System.out.println("Data iniziale  : " + dataInizialeFormattata);
            System.out.println("Data modificata: " + dataFinaleFormattata);

        } catch (DateTimeParseException e) {
            // Gestione di eventuali errori nel parsing della data
            System.out.println("Errore: formato della data non valido.");
        }
    }
}


