
import java.util.HashSet;
import java.util.Set;
public class Main {

    // Metodo che crea e restituisce un HashSet popolato con oggetti Persona
    public static Set<Persona> creaHashSetPopolato() {
        // Creazione di un HashSet per contenere oggetti Persona
        Set<Persona> persone = new HashSet<>();

        // Aggiunta di alcune persone al set
        persone.add(new Persona("Mario", 30));
        persone.add(new Persona("Luigi", 25));
        persone.add(new Persona("Anna", 28));

        // Restituisce l'HashSet popolato<.
        return persone;
    }

    public static void main(String[] args) {
        // Richiama il metodo per ottenere un HashSet popolato
        Set<Persona> persone = creaHashSetPopolato();

        // Stampa tutti gli elementi del set
        System.out.println("Elementi presenti nel Set:");
        for (Persona persona : persone) {
            System.out.println(persona);
        }

        // Creazione di un nuovo oggetto Persona per verificarne la presenza nel Set
        Persona daVerificare = new Persona("Mario", 30);

        // Verifica se l'elemento è presente nel Set usando il metodo contains()
        boolean contiene = persone.contains(daVerificare);

        // Stampa il risultato della verifica
        System.out.println("\nIl set contiene " + daVerificare + "? " + contiene);
    }
}
