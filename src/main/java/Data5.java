
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Data5 {
    public static void main(String[] args) {
        try {
            // Creiamo due String all' interno inseriamo la relativa data
            String dataString1 = "2023-03-01T13:00:00Z";
            String dataString2 = "2024-03-01T13:00:00Z";

            // Creiamo due istanze (oggetti di tipo OffsetDateTime) a partire dalle due stringhe precedenti
            OffsetDateTime data1=OffsetDateTime.parse(dataString1);
            OffsetDateTime  data2 =OffsetDateTime.parse(dataString2);



            // Otteniamo l'ora attuale
            OffsetDateTime oraAttuale =OffsetDateTime.now();

            // Verifica se la prima data è precedente alla seconda
            boolean primaPrecedeSeconda = data1.isBefore(data2);

            // Verifica se la seconda data è successiva alla prima
            boolean secondaSuccessivaPrima = data2.isAfter(data1);

            // Verifica se le date sono esattamente uguali all'ora attuale
            boolean data1UgualeOra = data1.equals(oraAttuale);
            boolean data2UgualeOra = data2.equals(oraAttuale);

            // Creazione di un formatter personalizzato per visualizzare la data nel formato idoneo al ISO 8601 esempio "01 marzo 2023"
            // dd    → giorno (due cifre)
            // MMMM  → mese esteso (in italiano)
            // yyyy  → anno a quattro cifre
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);

            // Applichiamo il formatter all'oggetto1 OffsetDateTime
            String dataFormattata1 = data1.format(formatter);

            // Applichiamo il formatter all'oggetto2 OffsetDateTime
            String dataFormattata2 = data2.format(formatter);

            // Applichiamo il formatter all'oraAttuale OffsetDateTime
            String oraAttualeFormattata = oraAttuale.format(formatter);



            // Stampa dei risultati a console
            System.out.println("La prima data (" + dataFormattata1 + ") è precedente alla seconda (" + dataFormattata2 + "): " + primaPrecedeSeconda);
            System.out.println("La seconda data (" + dataFormattata2 + ") è successiva alla prima (" + dataFormattata1 + "): " + secondaSuccessivaPrima);
            System.out.println("La prima data (" + dataFormattata1 + ") è uguale all'ora attuale (" + oraAttualeFormattata + "): " + data1UgualeOra);
            System.out.println("La seconda data (" + dataFormattata2 + ") è uguale all'ora attuale (" + oraAttualeFormattata + "): " + data2UgualeOra);


        } catch (DateTimeParseException e) {
            // Questo blocco viene eseguito se il parsing delle date fallisce (formato errato)
            System.out.println("Errore: una delle stringhe di data non è nel formato corretto. Atteso: 'YYYY-MM-DDTHH:MM:SSZ'");
        } catch (Exception e) {
            // Catch generico per eventuali altri errori imprevisti
            System.out.println("Si è verificato un errore imprevisto: " + e.getMessage());
        }
    }
}
