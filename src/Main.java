public class Main {
    public static void main(String[] args) {
        PrehrambeniProizvod p1 = new PrehrambeniProizvod("001", "Mlijeko", 2.5, 50, "2026-03-01");
        PrehrambeniProizvod p2 = new PrehrambeniProizvod("002", "Hljeb", 1.0, 0, "2026-02-20");
        TehnickiProizvod t1 = new TehnickiProizvod("101", "TV", 1500.0, 5, 24);
        TehnickiProizvod t2 = new TehnickiProizvod("102", "Laptop", 2500.0, 2, 12);

        Skladiste skladiste = new Skladiste();
        skladiste.dodajProizvod(p1);
        skladiste.dodajProizvod(p2);
        skladiste.dodajProizvod(t1);
        skladiste.dodajProizvod(t2);

        System.out.println("Svi proizvodi:");
        skladiste.prikaziSveProizvode();

        System.out.println("\nProizvod sa najvecom vrijednoscu zaliha:");
        System.out.println(skladiste.proizvodSNajvecimVrijednostima());

        System.out.println("\nProizvodi sa 0 na stanju:");
        skladiste.proizvodiSaNulaNaStanju().stream()
                .filter(p -> p instanceof Oznacivo)
                .map(p -> ((Oznacivo)p).oznaka())
                .forEach(System.out::println);

        AnalizaZaliha analiza = new AnalizaZaliha();
        System.out.println("\nBroj proizvoda po kategoriji: " + analiza.brojProizvodaPoKategoriji(skladiste));
        System.out.println("Kategorija sa najvise proizvoda: " + analiza.kategorijaSaNajvise(skladiste));
        System.out.println("Ukupna vrijednost zaliha: " + analiza.ukupnaVrijednostZaliha(skladiste));
        System.out.println("Sifre proizvoda ispod vrijednosti 200: " + analiza.sifreProizvodaIspodVrijednosti(skladiste, 200));
    }
}