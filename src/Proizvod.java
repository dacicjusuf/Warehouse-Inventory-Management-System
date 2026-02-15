public abstract class Proizvod {
    private String sifra;
    private String naziv;
    private double cijena;
    private int kolicinaNaStanju;

    public Proizvod(String sifra, String naziv, double cijena, int kolicinaNaStanju) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public String getSifra() {
        return sifra;
    }
    public String getNaziv() {
        return naziv;
    }
    public double getCijena() {
        return cijena;
    }
    public int getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setSifra(String s) {
        this.sifra = s;
    }
    public void setNaziv(String n) {
        this.naziv = n;
    }
    public void setCijena(double c) {
        this.cijena = c;
    }
    public void setKolicinaNaStanju(int k) {
        this.kolicinaNaStanju = k;
    }

    public void dodajNaStanje(int k) {
        kolicinaNaStanju = kolicinaNaStanju + k;
    }

    public double vrijednostZaliha() {
        return cijena * kolicinaNaStanju;
    }

    public abstract String kategorija();

    public String toString() {
        return "Sifra: " + sifra + " Naziv: " + naziv + " Cijena: " + cijena + " Kolicina: " + kolicinaNaStanju + " Kategorija: " + kategorija();
    }
}