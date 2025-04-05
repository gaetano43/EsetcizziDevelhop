import java.util.Iterator;
import java.util.Set;

/**
 * Classe principale che gestisce le operazioni su un HashSet di oggetti Frutta.
 */
public class Main {

    /**
     * Metodo principale per eseguire il codice.
     *
     * @param args Argomenti della riga di comando (non utilizzati in questo caso)
     */
    public static void main(String[] args) {
        // Creiamo il set riempito di frutta
        Set<Frutta> fruitSet = Frutta.fruitSet();

        // Crea un oggetto Frutta (ad esempio "arancia") da cercare nel Set
        Frutta fruitToRemove = new Frutta("arancia");

        // Stampa il set iniziale
        System.out.println("HashSet iniziale:");
        for (Frutta frutta : fruitSet) {
            System.out.println(frutta);
        }

        // Scorre il set e elimina l'elemento uguale a fruitToRemove
        Iterator<Frutta> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            Frutta frutta = iterator.next();
            if (frutta.equals(fruitToRemove)) {
                iterator.remove();  // Rimuove l'elemento dal Set
                break;  // Interrompe il ciclo dopo la rimozione
            }
        }

        // Stampa l'HashSet dopo la rimozione
        System.out.println("\nHashSet dopo la rimozione:");
        for (Frutta frutta : fruitSet) {
            System.out.println(frutta);
        }

        // Svuota l'HashSet
        fruitSet.clear();

        // Verifica e stampa se l'HashSet è vuoto
        System.out.println("\nHashSet dopo lo svuotamento:");
        if (fruitSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }
}

