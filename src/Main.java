// Enum per identificare i tipi di forma
enum TipoForma {
    TRIANGOLO("Triangolo"),  // Rappresenta un triangolo
    RETTANGOLO("Rettangolo"); // Rappresenta un rettangolo

    private String nome; // Nome della forma

    // Costruttore per assegnare il nome alla forma
    TipoForma(String nome) {
        this.nome = nome;
    }

    // Metodo per ottenere il nome della forma
    public String getNome() {
        return nome;
    }
}

// Classe astratta che rappresenta una forma geometrica generica
abstract class Forma {
    // Metodo astratto per calcolare l'area (ogni forma lo implementerà in modo specifico)
    public abstract double calcolaArea();

    // Metodo astratto per ottenere il tipo di forma
    public abstract TipoForma tipo();
}

// Classe che rappresenta un triangolo, estende la classe Forma
class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore per inizializzare base e altezza
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo per calcolare l'area del triangolo
    @Override
    public double calcolaArea() {
        return 0.5 * base * altezza;
    }

    // Implementazione del metodo per restituire il tipo di forma (triangolo)
    @Override
    public TipoForma tipo() {
        return TipoForma.TRIANGOLO;
    }
}

// Classe che rappresenta un rettangolo, estende la classe Forma
class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    // Costruttore per inizializzare lunghezza e larghezza
    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    // Implementazione del metodo per calcolare l'area del rettangolo
    @Override
    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    // Implementazione del metodo per restituire il tipo di forma (rettangolo)
    @Override
    public TipoForma tipo() {
        return TipoForma.RETTANGOLO;
    }
}

// Classe principale che contiene il metodo main per eseguire il programma
public class Main {
    public static void main(String[] args) {
        // Creazione di un triangolo con base 5 e altezza 10
        Forma triangolo = new Triangolo(5, 10);
        // Stampa il tipo di forma e la sua area
        System.out.println("Forma: " + triangolo.tipo().getNome() + ", Area: " + triangolo.calcolaArea());

        // Creazione di un rettangolo con lunghezza 4 e larghezza 7
        Forma rettangolo = new Rettangolo(4, 7);
        // Stampa il tipo di forma e la sua area
        System.out.println("Forma: " + rettangolo.tipo().getNome() + ", Area: " + rettangolo.calcolaArea());
    }
}