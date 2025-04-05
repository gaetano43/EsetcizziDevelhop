import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe che rappresenta una Frutta con un tipo specifico.
 * Contiene metodi per la gestione di un HashSet di oggetti Frutta.
 */
class Frutta {
    private String tipo;

    /**
     * Costruttore per creare un oggetto Frutta con un tipo specifico.
     *
     * @param tipo Il tipo di frutta (es. mela, arancia, etc.)
     */
    public Frutta(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Restituisce il tipo di frutta.
     *
     * @return tipo della frutta
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il tipo di frutta.
     *
     * @param tipo Il tipo di frutta da impostare
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Crea un HashSet di oggetti Frutta e lo popola con alcuni tipi di frutta.
     *
     * @return Un HashSet di oggetti Frutta
     */
    public static Set<Frutta> fruitSet() {
        Set<Frutta> fruitSet = new HashSet<>();
        fruitSet.add(new Frutta("mela"));
        fruitSet.add(new Frutta("melograno"));
        fruitSet.add(new Frutta("arancia"));
        fruitSet.add(new Frutta("pesca"));
        return fruitSet;
    }

    /**
     * Restituisce una rappresentazione in formato stringa dell'oggetto Frutta.
     * Utilizza String.format per una gestione più chiara delle stringhe.
     *
     * @return Stringa che rappresenta l'oggetto Frutta
     */
    @Override
    public String toString() {
        return String.format("Frutta{tipo='%s'}", tipo);
    }

    /**
     * Confronta due oggetti Frutta per verificare se sono uguali in base al tipo.
     *
     * @param o L'oggetto con cui confrontare
     * @return true se gli oggetti sono uguali, false altrimenti
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Se gli oggetti sono lo stesso
        if (o == null || getClass() != o.getClass()) return false;  // Se l'oggetto è null o di classe diversa
        Frutta frutta = (Frutta) o;
        return Objects.equals(tipo, frutta.tipo);  // Confronta il tipo di frutta
    }

    /**
     * Calcola il codice hash dell'oggetto Frutta basandosi sul tipo di frutta.
     *
     * @return Codice hash dell'oggetto Frutta
     */
    @Override
    public int hashCode() {
        return Objects.hash(tipo);  // Calcola hash per il tipo
    }
}
