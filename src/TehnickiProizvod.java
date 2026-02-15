class TehnickiProizvod extends Proizvod implements Oznacivo {
    private int garancijaMjeseci;

    public TehnickiProizvod(String sifra, String naziv, double cijena, int kolicina, int garancijaMjeseci) {
        super(sifra, naziv, cijena, kolicina);
        this.garancijaMjeseci = garancijaMjeseci;
    }

    public int getGarancija() {
        return garancijaMjeseci;
    }

    public String kategorija() {
        return "Tehnicki";
    }

    public String oznaka() {
        return "TEH-" + getSifra() + "-" + garancijaMjeseci;
    }

    public String toString() {
        return super.toString() + " Garancija: " + garancijaMjeseci;
    }
}