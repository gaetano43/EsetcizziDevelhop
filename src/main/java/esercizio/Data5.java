package esercizio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Data5 {

    // Metodo per formattare un oggetto Instant in una stringa leggibile
    private static String formattaData(Instant data) {
        // Formato leggibile per esseri umani: giorno/mese/anno ora:minuti:secondi
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.of("UTC"));
        return formatter.format(data);
    }

    // Metodo per confrontare solo giorno, mese e anno ignorando orario e millisecondi
    private static boolean stessaData(Instant data, Instant riferimento) {
        LocalDate dataLocal = data.atZone(ZoneId.of("UTC")).toLocalDate();
        LocalDate riferimentoLocal = riferimento.atZone(ZoneId.of("UTC")).toLocalDate();
        return dataLocal.equals(riferimentoLocal);
    }

    public static void main(String[] args) {
        try {
            // Parsing delle date statiche
            Instant dataInizio = Instant.parse("2023-03-01T13:00:00Z");
            Instant dataFine = Instant.parse("2024-03-01T13:00:00Z");

            // Otteniamo l'ora attuale
            Instant oraAttuale = Instant.now();

            // Formattazione delle date per la stampa
            String dataFormattataInizio = formattaData(dataInizio);
            String dataFormattataFine = formattaData(dataFine);
            String dataFormattataOra = formattaData(oraAttuale);

            // Confronti logici
            boolean inizioPrecedeFine = dataInizio.isBefore(dataFine);
            boolean fineSuccessivaInizio = dataFine.isAfter(dataInizio);
            boolean stessoGiornoInizio = stessaData(dataInizio, oraAttuale);
            boolean stessoGiornoFine = stessaData(dataFine, oraAttuale);

            // Stampe nel formato richiesto
            System.out.println("La prima data (" + dataFormattataInizio + ") è precedente alla seconda (" + dataFormattataFine + "): " + inizioPrecedeFine);
            System.out.println("La seconda data (" + dataFormattataFine + ") è successiva alla prima (" + dataFormattataInizio + "): " + fineSuccessivaInizio);
            System.out.println("La prima data (" + dataFormattataInizio + ") è nello stesso giorno dell'ora attuale (" + dataFormattataOra + "): " + stessoGiornoInizio);
            System.out.println("La seconda data (" + dataFormattataFine + ") è nello stesso giorno dell'ora attuale (" + dataFormattataOra + "): " + stessoGiornoFine);

        } catch (DateTimeParseException e) {
            // Errore di parsing se la stringa non è in formato corretto
            System.out.println("Errore nel parsing della data: assicurati che le stringhe siano nel formato ISO 8601 (es. '2023-03-01T13:00:00Z')");
        } catch (Exception e) {
            // Catch generico per diagnosticare eventuali problemi imprevisti
            System.out.println("Errore imprevisto: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
