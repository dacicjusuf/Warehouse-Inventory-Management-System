public class PrehrambeniProizvod extends Proizvod implements Oznacivo {
    private String rokTrajanja;

    public PrehrambeniProizvod(String sifra, String naziv, double cijena, int kolicina, String rokTrajanja) {
        super(sifra, naziv, cijena, kolicina);
        this.rokTrajanja = rokTrajanja;
    }

    public String getRokTrajanja() {
        return rokTrajanja;
    }

    public String kategorija() {
        return "Prehrambeni";
    }

    public String oznaka() {
        return "PREH-" + getSifra() + "-" + rokTrajanja;
    }

    public String toString() {
        return super.toString() + " Rok: " + rokTrajanja;
    }
}