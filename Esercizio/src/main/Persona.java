
// Definizione della classe Persona
 public class Persona {
    private String nome;
    private int eta;

    // Costruttore per inizializzare l'oggetto Persona
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per l'età
    public int getEta() {
        return eta;
    }

    // Metodo equals() per confrontare due oggetti Persona
    @Override
    public boolean equals(Object obj) {
        // Se i riferimenti degli oggetti sono uguali, restituisce true
        if (this == obj) return true;

        // Se l'oggetto passato è null o di un'altra classe, restituisce false
        if (obj == null || getClass() != obj.getClass()) return false;

        // Effettua il cast a Persona
        Persona persona = (Persona) obj;

        // Confronta nome ed eta per stabilire l'uguaglianza
        return eta == persona.eta && nome.equals(persona.nome);
    }

    // Metodo hashCode() necessario per l'utilizzo corretto in HashSet
    @Override
    public int hashCode() {
        // Genera un hash code unico combinando nome ed eta
        return nome.hashCode() + eta;
    }

    // Metodo toString() per stampare l'oggetto in modo leggibile
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}

